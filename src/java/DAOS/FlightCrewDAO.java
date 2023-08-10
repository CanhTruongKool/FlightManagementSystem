package DAOS;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

import javax.naming.NamingException;

import Model.FlightCrew;

public class FlightCrewDAO extends DataAccessObject {
    public FlightCrewDAO() throws NamingException, SQLException {
        super();
    }

    public List<FlightCrew> getAll() throws SQLException {
        String sql = "SELECT ID, FlightID, CrewID, CreatedBy, CreatedTime, ModifiedBy, LastModifiedTime, IsActivity\n" +
                "FROM FlightCrew;\n";
        preparedStatement = connection.prepareStatement(sql);
        resultSet = preparedStatement.executeQuery();
        List<FlightCrew> flightCrews = new LinkedList<>();
        while (resultSet.next()) {
            flightCrews.add(getEntity());
        }
        return flightCrews;
    }

    public FlightCrew create(FlightCrew flightCrew) throws SQLException {
        String sql = "INSERT INTO FlightCrew\n" +
                "(FlightID, CrewID, CreatedBy, CreatedTime, ModifiedBy, LastModifiedTime, IsActivity)\n" +
                "VALUES(?, ?, ?, ?, ?, ?, ?)\n";
        preparedStatement = connection.prepareStatement(sql);
        setEntity(flightCrew);
        preparedStatement.executeUpdate();
        return flightCrew;
    }

    private FlightCrew getEntity() throws SQLException {
        int createdBy = resultSet.getInt("CreatedBy");
        LocalDateTime createdTime = resultSet.getTimestamp("CreatedTime").toLocalDateTime();
        int modifiedBy = resultSet.getInt("ModifiedBy");
        LocalDateTime lastModifiedTime = resultSet.getTimestamp("LastModifiedTime").toLocalDateTime();
        int isActivity = resultSet.getInt("IsActivity");
        int flightID = resultSet.getInt("FlightID");
        int crewID = resultSet.getInt("CrewID");
        return new FlightCrew(createdBy, createdTime, modifiedBy, lastModifiedTime, isActivity, flightID, crewID);
    }

    private void setEntity(FlightCrew flightCrew) throws SQLException {
        preparedStatement.setInt(1, flightCrew.getFlightID());
        preparedStatement.setInt(2, flightCrew.getCrewID());
        preparedStatement.setInt(3, flightCrew.getCreatedBy());
        preparedStatement.setString(4, flightCrew.getCreatedTime().toString());
        preparedStatement.setInt(5, flightCrew.getModifiedBy());
        preparedStatement.setString(6, flightCrew.getLastModifiedTime().toString());
        preparedStatement.setInt(7, flightCrew.getIsActivity());
    }
}
