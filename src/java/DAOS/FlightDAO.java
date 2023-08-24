package DAOS;

import Controller.DTOS.FlightDTO;
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

            String sql = "select ID,  DeparturePlace, DepartureDate, Destination, NumberOfSeats, MaxCargoWeight, Price, CreatedBy, CreatedTime,"
                    + " ModifiedBy, LastModifiedTime, IsActivity from Flights where IsActivity = 1 order by DepartureDate Desc";
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

    public ArrayList<FlightDTO> getAllFlights() {

        ArrayList<FlightDTO> flightsList = new ArrayList<>();

        try {
            String sql = "SELECT f.ID,  DeparturePlace, DepartureDate, Destination, NumberOfSeats, MaxCargoWeight, Price, \n"
                    + "		ac.UserName as CreatedBy, CreatedTime, am.UserName as  ModifiedBy, LastModifiedTime, IsActivity \n"
                    + "FROM Flights AS f left join Admin AS am \n"
                    + "		ON f.ModifiedBy = am.ID left join Admin as ac \n"
                    + "		ON f.CreatedBy = ac.ID\n"
                    + "ORDER BY LastModifiedTime DESC";

            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                flightsList.add(getFlightDTO());
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return flightsList;
    }

    private FlightDTO getFlightDTO() throws SQLException {
        int ID = resultSet.getInt("ID");
        String departurePlace = resultSet.getString("DeparturePlace");
        String destination = resultSet.getString("Destination");
        LocalDateTime departureDate = resultSet.getTimestamp("DepartureDate").toLocalDateTime();
        int numberOfSeats = resultSet.getInt("NumberOfSeats");
        int maxCargoWeight = resultSet.getInt("MaxCargoWeight");
        float price = resultSet.getFloat("Price");
        String createdBy = resultSet.getString("CreatedBy");
        LocalDateTime createdTime = resultSet.getTimestamp("CreatedTime").toLocalDateTime();
        String modifiedBy = resultSet.getString("ModifiedBy");
        LocalDateTime lastModifiedTime = resultSet.getTimestamp("LastModifiedTime").toLocalDateTime();
        int isActivity = resultSet.getInt("IsActivity");

        return new FlightDTO(ID, departurePlace, destination, departureDate, numberOfSeats,
                maxCargoWeight, price, createdBy, createdTime, modifiedBy, lastModifiedTime, isActivity);
    }

    public ArrayList<Flight> searchFlight(String departure, String destination, String date) {
        ArrayList<Flight> list = new ArrayList<>();
        try {
            // connnect to database 'FMS_FlightManagementSystem'
            // crate statement
            // get data from table 'tbl Flight'
            String sql = "select ID, DeparturePlace, DepartureDate, Destination, NumberOfSeats, MaxCargoWeight, Price, CreatedBy, CreatedTime, ModifiedBy, LastModifiedTime, IsActivity "
                    + "from Flights where DeparturePlace = ? AND Destination = ? AND "
                    + "DepartureDate >= ? AND DepartureDate < ? and IsActivity = 1";

            // Parse the date string to a LocalDateTime object with time set to 00:00:00
            LocalDateTime startDate = LocalDateTime.parse(date + "T00:00:00");
            // Parse the date string to a LocalDateTime object with time set to 23:59:59
            LocalDateTime endDate = LocalDateTime.parse(date + "T23:59:59");

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, departure.trim());
            preparedStatement.setString(2, destination.trim());
            preparedStatement.setTimestamp(3, Timestamp.valueOf(startDate));
            preparedStatement.setTimestamp(4, Timestamp.valueOf(endDate));
            // Thực hiện truy vấn
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

    public ArrayList<Flight> getFlight(int start, int end, ArrayList<Flight> list) {
        ArrayList<Flight> resultList = new ArrayList<>();
        for (int i = start; i < end; i++) {
            resultList.add(list.get(i));
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

    public Flight addFlight(Flight flight) throws SQLException {
        String sql = "INSERT INTO Flights\r\n"
                + //
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
    }

    public Flight searchFlightByID(int FlightID) {
        Flight result = new Flight();
        try {
            // connnect to database 'FMS_FlightManagementSystem'
            // crate statement
            // get data from table 'tbl Flight'
            String sql = "select ID, DeparturePlace, DepartureDate, Destination, NumberOfSeats, MaxCargoWeight, Price, CreatedBy, CreatedTime, ModifiedBy, LastModifiedTime, IsActivity "
                    + "from Flights where ID = ? ";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, FlightID);

            // Thực hiện truy vấn
            resultSet = preparedStatement.executeQuery();
            // show data

            while (resultSet.next()) {
                int ID = resultSet.getInt("ID");
                String Departure = resultSet.getString("DeparturePlace");
                String Destination = resultSet.getString("Destination");
                LocalDateTime departureDate = resultSet.getTimestamp("DepartureDate").toLocalDateTime();
                int numberOfSeats = resultSet.getInt("NumberOfSeats");
                int maxCargoWeight = resultSet.getInt("MaxCargoWeight");
                float price = resultSet.getFloat("Price");
                int createdBy = resultSet.getInt("CreatedBy");
                LocalDateTime createdTime = resultSet.getTimestamp("CreatedTime").toLocalDateTime();
                int modifiedBy = resultSet.getInt("ModifiedBy");
                LocalDateTime lastModifiedTime = resultSet.getTimestamp("LastModifiedTime").toLocalDateTime();
                int isActivity = resultSet.getInt("IsActivity");
                result = new Flight(createdBy, createdTime, modifiedBy, lastModifiedTime, isActivity, ID, Departure, Destination, departureDate, numberOfSeats, maxCargoWeight, price);

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

    public void cancelFlight(int flightID, int adminID) throws SQLException {

        String sql = "BEGIN TRANSACTION;\n"
                + "UPDATE Flights\n"
                + "SET ModifiedBy = ?, LastModifiedTime = GETDATE(), IsActivity = 0\n"
                + "WHERE ID = ? and IsActivity = 1\n"
                + "\n"
                + "UPDATE Tickets\n"
                + "SET IsCancelled = 1\n"
                + "WHERE FlightID = ? and IsCancelled = 0\n"
                + "COMMIT;";
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, adminID);
        preparedStatement.setInt(2, flightID);
        preparedStatement.setInt(3, flightID);
        preparedStatement.executeUpdate();
    }
}
