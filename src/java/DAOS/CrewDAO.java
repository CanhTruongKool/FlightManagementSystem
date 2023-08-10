package DAOS;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Crew;

public class CrewDAO extends DataAccessObject {
    public List<Crew> GetAll() throws SQLException {
        List<Crew> crews = new ArrayList<>();
        String sql = "Select ID, Name, PhoneNumber, Position From Crew";
        preparedStatement = connection.prepareStatement(sql);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Crew crew = new Crew();
            crew.setID(resultSet.getInt("ID"));
            crew.setName(resultSet.getString("Name"));
            crew.setPhoneNumber(resultSet.getString("PhoneNumber"));
            crew.setPosition(resultSet.getString("Position"));
            crews.add(crew);
        }
        return crews;
    }
}
