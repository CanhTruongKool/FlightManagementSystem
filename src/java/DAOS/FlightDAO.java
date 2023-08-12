package DAOS;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import Model.Flight;

public class FlightDAO extends DataAccessObject {

    public ArrayList<Flight> flightList;
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    // LocalDateTime dateTime = LocalDateTime.parse(str, formatter);

    public FlightDAO() {
        flightList = readData();
    }

    public ArrayList<Flight> readData() {
        ArrayList<Flight> list = new ArrayList<>();
        try {
            // connnect to database 'FMS_FlightManagementSystem'
        
          String sql ="select ID, DeparturePlace,Destination,DepartureDate,NumberOfSeats,MaxCargoWeight,Price from Flights";
            // crate statement
            preparedStatement = connection.prepareStatement(sql);
            // get data from table 'tbl Flight'
            resultSet = preparedStatement.executeQuery();
            // show data
            while (resultSet.next()) {
                list.add(getEntity());
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
                list.add(getEntity());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return list;
    }

    public ArrayList<Flight> getFlight(int start, int end) {
        ArrayList<Flight> resultList = new ArrayList<>();
        for (int i = start; i < end; i++) {
            resultList.add(readData().get(i));
        }
        return resultList;
    }

    public ArrayList<Flight> getSearchFlight(String departure, String destination, String date, int start, int end) {
        ArrayList<Flight> resultList = new ArrayList<>();
        for (int i = start; i < end; i++) {
            resultList.add(searchFlight(departure, destination, date).get(i));
        }
        return resultList;
    }


    public Flight addFlight(Flight flight) throws SQLException{
        String sql = "INSERT INTO Flights\r\n" + //
                "(DeparturePlace, DepartureDate, Destination, NumberOfSeats, MaxCargoWeight, Price, CreatedBy, CreatedTime, ModifiedBy, LastModifiedTime, IsActivity)\r\n"
                + //
                "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, flight.getDeparturePlace());
        preparedStatement.setTimestamp(2, Timestamp.valueOf(flight.getDepartureDate()));
        preparedStatement.setString(3, flight.getDestination());
        preparedStatement.setInt(4, flight.getNumberOfSeats());
        preparedStatement.setInt(5, flight.getMaxCargoWeight());
        preparedStatement.setFloat(6, flight.getPrice());
        preparedStatement.setInt(7, flight.getCreatedBy());
        preparedStatement.setTimestamp(8, Timestamp.valueOf(flight.getCreatedTime()));
        preparedStatement.setInt(9, flight.getModifiedBy());
        preparedStatement.setTimestamp(10, Timestamp.valueOf(flight.getLastModifiedTime()));
        preparedStatement.setInt(11, flight.getIsActivity());

        preparedStatement.executeUpdate();
        return flight;

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

    private Flight getEntity() throws SQLException {
        int ID = resultSet.getInt("ID");
        String _departure = resultSet.getString("DeparturePlace");
        String _destination = resultSet.getString("Destination");
        LocalDateTime departureDate = resultSet.getTimestamp("DepartureDate").toLocalDateTime();
        int numberOfSeats = resultSet.getInt("NumberOfSeats");
        int maxCargoWeight = resultSet.getInt("MaxCargoWeight");
        float price = resultSet.getFloat("Price");
        int createdBy = resultSet.getInt("CreatedBy");
        LocalDateTime createdTime = resultSet.getTimestamp("CreatedTime").toLocalDateTime();
        int modifiedBy = resultSet.getInt("ModifiedBy");
        LocalDateTime lastModifiedTime = resultSet.getTimestamp("LastModifiedTime").toLocalDateTime();
        int isActivity = resultSet.getInt("IsActivity");
        return new Flight(createdBy, createdTime, modifiedBy, lastModifiedTime, isActivity, ID, _departure,
                _destination, departureDate, numberOfSeats, maxCargoWeight, price);
    }
}
