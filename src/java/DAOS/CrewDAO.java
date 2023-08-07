/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Crew;

/**
 *
 * @author Administrator
 */
public class CrewDAO extends DataAccessObject {
    public List<Crew> GetAll() throws SQLException {
        List<Crew> crews = new ArrayList<>();
        String sql = "Select ID, Name, PhoneNumber, Position From Crew";
        preparedStatement = connection.prepareStatement(sql);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
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
