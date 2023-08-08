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
public class TicketDAO {

    private static String DB_URL = "jdbc:sqlserver://localhost:1433;"
            + "databaseName=FMS_FlightManagementSystem";
    private static String USER_NAME = "sa";
    private static String PASSWORD = "123";

    public TicketDAO() {
    }

    public int CountTicket(String FlightID) {
        int result = 0;
        try {
            // connnect to database 'FMS_FlightManagementSystem'
            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
            // crate statement
            String sql = "select count(*) from Tickets where FlightID = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            System.out.println(FlightID);
            stmt.setString(1, FlightID); //FMS-A01
            // get data from table 'tbl Ticket'
            ResultSet rs = stmt.executeQuery();
            // show data

            if (rs.next()) {
                result = rs.getInt(1); // Lấy giá trị từ cột đầu tiên của kết quả truy vấn
            }

            // close connection
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return result;
    }

    public Ticket searchTicket(String code) {
        try {
            // connnect to database 'FMS_FlightManagementSystem'
            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
            // crate statement
            // get data from table 'tbl Flight'
            String sql = "";

            PreparedStatement statement = conn.prepareStatement(sql);

            // Thực hiện truy vấn
            ResultSet rs = statement.executeQuery();
            // show data

            while (rs.next()) {
                int ID = rs.getInt("ID");
                String Departure = rs.getString("DeparturePlace");
                String Destination = rs.getString("Destination");
                LocalDateTime departureDate = rs.getTimestamp("DepartureDate").toLocalDateTime();
                int numberOfSeats = rs.getInt("NumberOfSeats");
                int maxCargoWeight = rs.getInt("MaxCargoWeight");
                float price = rs.getFloat("Price");
                Flight f = new Flight(ID, Departure, Destination, departureDate, numberOfSeats, maxCargoWeight, price);

            }

            // close connection
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }
    
     public Ticket createTicket(String FlightID,String PassengerID,String Code) {
        try {
            // connnect to database 'FMS_FlightManagementSystem'
            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
            // crate statement
            // get data from table 'tbl Flight'
            String sql = "";

            PreparedStatement statement = conn.prepareStatement(sql);

            // Thực hiện truy vấn
            ResultSet rs = statement.executeQuery();
            // show data

            while (rs.next()) {
                int ID = rs.getInt("ID");
                String Departure = rs.getString("DeparturePlace");
                String Destination = rs.getString("Destination");
                LocalDateTime departureDate = rs.getTimestamp("DepartureDate").toLocalDateTime();
                int numberOfSeats = rs.getInt("NumberOfSeats");
                int maxCargoWeight = rs.getInt("MaxCargoWeight");
                float price = rs.getFloat("Price");
                Flight f = new Flight(ID, Departure, Destination, departureDate, numberOfSeats, maxCargoWeight, price);

            }

            // close connection
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }
    
    public static Connection getConnection(String dbURL, String userName,
            String password) {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(dbURL, userName, password);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return conn;
    }

    public static void main(String[] args) {
        TicketDAO td = new TicketDAO();
        System.out.println(td.CountTicket("FMS-A01"));
    }
}
