package DAOS;

import Controller.DTOS.PassengerDTO;
import Model.Passenger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class PassengerDAO extends DataAccessObject {

    public PassengerDAO() {
    }

    public ArrayList<PassengerDTO> getPassengersByFlightID(String flightID) throws SQLException {
        ArrayList<PassengerDTO> passengerList = new ArrayList<>();
        String sql = "SELECT t.PassengerID, c.Name, c.PhoneNumber, c.IdentifyNumber, t.Code, t.BuyTime, t.ModifiedTime, t.IsCancelled\n"
                + "FROM Tickets AS t join Customers AS c on t.PassengerID = c.ID \n"
                + "WHERE FlightID = ?";

        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, flightID);
        resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            passengerList.add(getPassengerDTO());
        }
        return passengerList;
    }

    private PassengerDTO getPassengerDTO() throws SQLException {
        int passengerID = resultSet.getInt("PassengerID");
        String name = resultSet.getString("Name");
        String phoneNumber = resultSet.getString("PhoneNumber");
        String identifyNumber = resultSet.getString("IdentifyNumber");
        String ticketCode = resultSet.getString("Code");
        LocalDateTime buyTime = resultSet.getTimestamp("BuyTime").toLocalDateTime();
        LocalDateTime modifiedTime = resultSet.getTimestamp("ModifiedTime").toLocalDateTime();
        int status = resultSet.getInt("IsCancelled");
        return new PassengerDTO(passengerID, name, phoneNumber, identifyNumber, ticketCode, buyTime, modifiedTime, status);
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

            stmt.setString(1, name.trim());
            stmt.setString(2, identifyNumber.trim());
            //    System.out.println(name + " " + identifyNumber + " " + phone);
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

    public void editPassenger(String Name, String identifyNumber) {
        try {
            String sql = "update Customers set Name = ? where IdentifyNumber = ? ";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, Name.trim()); //FMS-A01
            stmt.setString(2, identifyNumber.trim());
            // get data from table 'tbl Ticket'
            stmt.executeUpdate();
            // show data
        } catch (Exception ex) {
            ex.printStackTrace();
        }
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

    public int getPassengerByIdentifyNumber(String identifyNumber) {
        int passengerID = 0;
        try {
            // connnect to database 'FMS_FlightManagementSystem'
            // crate statement
            String sql = "select ID, Name,PhoneNumber,IdentifyNumber from Customers "
                    + "where IdentifyNumber = ? ";
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, identifyNumber.trim());
            //    System.out.println(name + " " + identifyNumber + " " + phone);
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
}
