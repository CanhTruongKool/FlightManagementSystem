/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import Model.Flight;
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
public class FlightDAO {

    public ArrayList<Flight> flightList = readData();
    private static String DB_URL = "jdbc:sqlserver://localhost:1433;"
            + "databaseName=FMS_FlightManagementSystem";
    private static String USER_NAME = "sa";
    private static String PASSWORD = "123";

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    // LocalDateTime dateTime = LocalDateTime.parse(str, formatter);

    public FlightDAO() {
    }

    public ArrayList<Flight> readData() {
        ArrayList<Flight> list = new ArrayList<>();
        try {
            // connnect to database 'FMS_FlightManagementSystem'
            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
            // crate statement
            Statement stmt = conn.createStatement();
            // get data from table 'tbl Flight'
            ResultSet rs = stmt.executeQuery("select ID, DeparturePlace,Destination,DepartureDate,NumberOfSeats,MaxCargoWeight,Price from Flights");
            // show data

            while (rs.next()) {
                int ID = rs.getInt("ID");
                String departure = rs.getString("DeparturePlace");
                String destination = rs.getString("Destination");
                LocalDateTime departureDate = rs.getTimestamp("DepartureDate").toLocalDateTime();
                int numberOfSeats = rs.getInt("NumberOfSeats");
                int maxCargoWeight = rs.getInt("MaxCargoWeight");
                float price = rs.getFloat("Price");
                Flight f = new Flight("FMS-A0" + ID, departure, destination, departureDate, numberOfSeats, maxCargoWeight,price);

                list.add(f);
            }

            // close connection
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return list;
    }

    public ArrayList<Flight> searchFlight(String departure, String destination, String date) {
        ArrayList<Flight> list = new ArrayList<>();
        try {
            // connnect to database 'FMS_FlightManagementSystem'
            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
            // crate statement
            // get data from table 'tbl Flight'
            String sql = "select ID, DeparturePlace,Destination,DepartureDate,NumberOfSeats,MaxCargoWeight,Price "
                    + "from Flights where DeparturePlace = ? AND Destination = ? AND "
                    + "DepartureDate >= ? AND DepartureDate < ? ";;

            // Parse the date string to a LocalDateTime object with time set to 00:00:00
            LocalDateTime startDate = LocalDateTime.parse(date + "T00:00:00");
            // Parse the date string to a LocalDateTime object with time set to 23:59:59
            LocalDateTime endDate = LocalDateTime.parse(date + "T23:59:59");

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, departure.trim());
            statement.setString(2,destination.trim());
            statement.setTimestamp(3, Timestamp.valueOf(startDate));
            statement.setTimestamp(4, Timestamp.valueOf(endDate));
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
                Flight f = new Flight("FMS-A0" + ID, Departure, Destination, departureDate, numberOfSeats, maxCargoWeight,price);

                list.add(f);
            }

            // close connection
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return list;
    }

    public ArrayList<Flight> getFlight(int start, int end) {
        ArrayList<Flight> resultList = new ArrayList();
        for (int i = start; i < end; i++) {
            resultList.add(readData().get(i));
        }
        return resultList;
    }

    public ArrayList<Flight> getSearchFlight(String departure, String destination, String date, int start, int end) {
        ArrayList<Flight> resultList = new ArrayList();
        for (int i = start; i < end; i++) {
            resultList.add(searchFlight(departure, destination, date).get(i));
        }
        return resultList;
    }

    public static Connection getConnection(String dbURL, String userName,
            String password) {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(dbURL, userName, password);
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }

    public static void main(String[] args) {
        FlightDAO fd = new FlightDAO();
        ArrayList<Flight> list = fd.searchFlight(" Ha Noi", " Ho Chi Minh", "2023-08-20");
        for (Flight i : list) {
            System.out.println(i);
        }
    }
}
