/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import Model.Flight;
import Model.Ticket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class TicketDAO extends DataAccessObject {

    public TicketDAO() {
    }

    public int CountTicket(String FlightID) {
        int result = 0;
        try {

            String sql = "select count(*) from Tickets where FlightID = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            System.out.println(FlightID);
            stmt.setString(1, FlightID); //FMS-A01
            // get data from table 'tbl Ticket'
            ResultSet rs = stmt.executeQuery();
            // show data

            if (rs.next()) {
                result = rs.getInt(1); // Lấy giá trị từ cột đầu tiên của kết quả truy vấn
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return result;
    }

    public Ticket searchTicket(String code) {
        Ticket result = null;
        try {
            // connnect to database 'FMS_FlightManagementSystem'
            // crate statement
            String sql = "select FlightID,PassengerID,Code from Tickets where Code = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, code); //FMS-A01
            // get data from table 'tbl Ticket'
            ResultSet rs = stmt.executeQuery();
            // show data

            while (rs.next()) {
                int flightID = rs.getInt("FlightID");
                int passengerID = rs.getInt("PassengerID");
                String Code = rs.getString("Code");
                result = new Ticket(flightID, passengerID, Code);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return result;
    }

    public ArrayList<Ticket> searchTicketByPassenger(String passengerIdentifyNumber) {
        ArrayList<Ticket> result = new ArrayList<>();
        try {
            // connnect to database 'FMS_FlightManagementSystem'
            // crate statement
            String sql = "select FlightID, PassengerID , Code"
                    + " from Tickets, Customers where IdentifyNumber = ? ";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, passengerIdentifyNumber); 
            // get data from table 'tbl Ticket'
            ResultSet rs = stmt.executeQuery();
            // show data

            while (rs.next()) {
                int flightID = rs.getInt("FlightID");
                int passengerID = rs.getInt("PassengerID");
                String Code = rs.getString("Code");
                Ticket t = new Ticket(flightID, passengerID, Code);
                result.add(t);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return result;
    }

    public Ticket createTicket(String FlightID, int PassengerID, String Code) {
        Ticket result = new Ticket();
        try {
            // connnect to database 'FMS_FlightManagementSystem'
            // crate statement
            // get data from table 'tbl Ticket'
            String sql = "Insert into [dbo].[Tickets]([FlightID],[PassengerID],[Code])"
                    + "values (?,?,?)";
            // show data
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            stmt.setString(1, FlightID);
            stmt.setInt(2, PassengerID);
            System.out.println(PassengerID);
            stmt.setString(3, Code);
            // get data from table 'tbl Ticket'
            // Execute the insert statement
            int affectedRows = stmt.executeUpdate();
            if (affectedRows > 0) {
                // Insert successful, retrieve the generated keys
                ResultSet generatedKeys = stmt.getGeneratedKeys();
                if (generatedKeys.next()) {
                    result = new Ticket(Integer.parseInt(FlightID), PassengerID, Code);
                    // Set other attributes if needed
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return result;
    }
}
