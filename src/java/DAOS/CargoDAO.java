/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import Model.Cargo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class CargoDAO extends DataAccessObject{

    public CargoDAO() {
    }
       
    
     public Cargo createCargo(String FlightID, int PassengerID, String Code,String Category,float weight, float price) {
        Cargo result = new Cargo();
        try {
            // connnect to database 'FMS_FlightManagementSystem'
            // crate statement
            // get data from table 'tbl Ticket'
            String sql = "Insert into [dbo].[FlightCargo]([FlightID],[PassengerID],[Code],[Category],[Weight],[Price])"
                    + "values (?,?,?,?,?,?)";
            // show data
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            stmt.setString(1, FlightID);
            stmt.setInt(2, PassengerID);
            stmt.setString(3, Code);
            stmt.setString(4,Category);
            stmt.setFloat(5, weight);
            stmt.setFloat(6, price);
            // get data from table 'tbl Ticket'
            // Execute the insert statement
            int affectedRows = stmt.executeUpdate();
            if (affectedRows > 0) {
                // Insert successful, retrieve the generated keys
                ResultSet generatedKeys = stmt.getGeneratedKeys();
                if (generatedKeys.next()) {
                    result = new Cargo(Integer.parseInt(FlightID), PassengerID, Category, Code, weight, price);
                    // Set other attributes if needed
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return result;
    }
     
     
     public Cargo searchCargo(String code) {
        Cargo result = null;
        try {
            // connnect to database 'FMS_FlightManagementSystem'
            // crate statement
            String sql = "select FlightID,PassengerID,Code,Category,Weight,Price from FlightCargo where Code = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, code.trim()); //FMS-A01
            // get data from table 'tbl Ticket'
            ResultSet rs = stmt.executeQuery();
            // show data

            while (rs.next()) {
                int flightID = rs.getInt("FlightID");
                int passengerID = rs.getInt("PassengerID");
                String Code = rs.getString("Code");
                String Category = rs.getString("Category");
                float weight = rs.getFloat("Weight");
                float price = rs.getFloat("Price");
                result = new Cargo(flightID, passengerID, Category, Code, weight, price);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return result;
    }
}
