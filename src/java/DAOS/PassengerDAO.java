/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import Model.Flight;
import Model.Passenger;
import Model.Ticket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;

/**
 *
 * @author Administrator
 */
public class PassengerDAO extends DataAccessObject {
    
    public PassengerDAO() {
    }
    
    public int CreatePassenger(String name, String identifyNumber, String phone) {
        int passengerID = 0;
        try {
            // connnect to database 'FMS_FlightManagementSystem'
            // crate statement
            String sql = "Insert into [dbo].[Customers]([Name],[PhoneNumber],[IdentifyNumber])"
                    + "values (?,?,?)";
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, name);
            stmt.setString(2, phone);
            stmt.setString(3, identifyNumber);
            // get data from table 'tbl Ticket'
            // Execute the insert statement
            int affectedRows = stmt.executeUpdate();
            if (affectedRows > 0) {
                // Insert successful, retrieve the generated keys
                ResultSet generatedKeys = stmt.getGeneratedKeys();
                if (generatedKeys.next()) {
                    passengerID = generatedKeys.getInt(1);
                    // Set other attributes if needed
                }
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return passengerID;
    }
    
    public int getPassenger(String name, String identifyNumber, String phone) {
        int passengerID = 0;
        try {
            // connnect to database 'FMS_FlightManagementSystem'
            // crate statement
            String sql = "select ID, Name,PhoneNumber,IdentifyNumber from Customers "
                    + "where Name = ? AND IdentifyNumber = ? ";
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, name);
            stmt.setString(2, identifyNumber);
            System.out.println(name + " " + identifyNumber + " " + phone);
            // get data from table 'tbl Ticket'
            // Thực hiện truy vấn
            ResultSet rs = stmt.executeQuery();
            // Execute the insert statement
            if (rs.next()) {
                // Insert successful, retrieve the generated keys
                passengerID = rs.getInt("ID");
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return passengerID;
    }
    
    public Passenger getPassengerFromID(int ID) {
        Passenger result = new Passenger();
        try {
            // connnect to database 'FMS_FlightManagementSystem'
            // crate statement
            String sql = "select Name,PhoneNumber,IdentifyNumber from Customers "
                    + "where id = ? ";
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setInt(1, ID);
            // get data from table 'tbl Ticket'
            // Thực hiện truy vấn
            ResultSet rs = stmt.executeQuery();
            // Execute the insert statement
            if (rs.next()) {
                // Found Passenger
                result.setName(rs.getString("Name"));
                result.setPhoneNumber(rs.getString("PhoneNumber"));
                result.setIdentityNumber(rs.getString("IdentifyNumber"));
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return result;
    }
    
}
