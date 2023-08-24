package DAOS;

import java.sql.SQLException;

import Controller.DTOS.LoginDTO;
import Model.Admin;

public class AdminDAO extends DataAccessObject {

    public Admin Get(LoginDTO loginDto) throws SQLException {
        Admin admin = new Admin();
        if (connection != null) {
            String sql = "Select ID, UserName, Password From Admin"
                    + " Where Username = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, loginDto.getUserName());
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                admin.setPassword(resultSet.getString("Password"));
                if (admin.getPassword().equals(loginDto.getPassword())) {
                    admin.setID(resultSet.getInt("ID"));
                    admin.setUserName(resultSet.getString("UserName"));
                    return admin;
                }
            }
        }
        return null;
    }
}
