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
import javax.naming.InitialContext;
import javax.naming.NamingException;
/**
 *
 * @author Administrator
 */
public class FlightDAO extends DataAccessObject{
    
    public ArrayList<Flight> flightList = readData();

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    // LocalDateTime dateTime = LocalDateTime.parse(str, formatter);

    public FlightDAO() {
    }

    public ArrayList<Flight> readData() {
        ArrayList<Flight> list = new ArrayList<>();
        try {
            // connnect to database 'FMS_FlightManagementSystem'
        
          String sql ="select ID, DeparturePlace,Destination,DepartureDate,NumberOfSeats,MaxCargoWeight,Price from Flights";
            // crate statement
            PreparedStatement stmt = connection.prepareStatement(sql);
            // get data from table 'tbl Flight'
            ResultSet rs = stmt.executeQuery();
            // show data

            while (rs.next()) {
                int ID = rs.getInt("ID");
                String departure = rs.getString("DeparturePlace");
                String destination = rs.getString("Destination");
                LocalDateTime departureDate = rs.getTimestamp("DepartureDate").toLocalDateTime();
                int numberOfSeats = rs.getInt("NumberOfSeats");
                int maxCargoWeight = rs.getInt("MaxCargoWeight");
                float price = rs.getFloat("Price");
                Flight f = new Flight(ID, departure, destination, departureDate, numberOfSeats, maxCargoWeight,price);

                list.add(f);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return list;
    }

    public ArrayList<Flight> searchFlight(String departure, String destination, String date) {
        ArrayList<Flight> list = new ArrayList<>();
        try {
            // connnect to database 'FMS_FlightManagementSystem'
            // crate statement
            // get data from table 'tbl Flight'
            String sql = "select ID, DeparturePlace,Destination,DepartureDate,NumberOfSeats,MaxCargoWeight,Price "
                    + "from Flights where DeparturePlace = ? AND Destination = ? AND "
                    + "DepartureDate >= ? AND DepartureDate < ? ";;

            // Parse the date string to a LocalDateTime object with time set to 00:00:00
            LocalDateTime startDate = LocalDateTime.parse(date + "T00:00:00");
            // Parse the date string to a LocalDateTime object with time set to 23:59:59
            LocalDateTime endDate = LocalDateTime.parse(date + "T23:59:59");

            PreparedStatement statement = connection.prepareStatement(sql);
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
                Flight f = new Flight(ID, Departure, Destination, departureDate, numberOfSeats, maxCargoWeight,price);

                list.add(f);
            }
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

    public Flight searchFlightByID(int FlightID) {
        Flight result = new Flight();
        try {
            // connnect to database 'FMS_FlightManagementSystem'
            // crate statement
            // get data from table 'tbl Flight'
            String sql = "select ID, DeparturePlace,Destination,DepartureDate,NumberOfSeats,MaxCargoWeight,Price "
                    + "from Flights where ID = ? ";


            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, FlightID);

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
                result = new Flight(ID, Departure, Destination, departureDate, numberOfSeats, maxCargoWeight,price);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return result;
    }

}
