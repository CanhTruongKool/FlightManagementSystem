package DAOS;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DataAccessObject implements Serializable{
    protected Connection connection;
    protected PreparedStatement preparedStatement;
    protected ResultSet resultSet;

    public DataAccessObject() {
        connection = getConnection();
    }

    
    
    @Override
    protected void finalize() throws Throwable {
        closeConnection();
        super.finalize();
    }



    private Connection getConnection(){
        Context context;
       
        try {
            context = new InitialContext();
            Context tomcatCtx = (Context) context.lookup("java:comp/env");
            DataSource ds = (DataSource) tomcatCtx.lookup("jdbc/MyAppDS");
            
            Connection con = ds.getConnection();
            return con;
        } catch (NamingException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null; 
    }

    private void closeConnection() throws Exception{
        if(resultSet != null)
            resultSet.close();
        if(preparedStatement != null)
            preparedStatement.close();
        if(connection != null)
            connection.close();
    }
    
    public static void main(String[] args) {
        DataAccessObject d = new DataAccessObject();
     //   Connection c = d.getConnection();
        if(d.connection == null) System.out.println("Connect Error");
        else System.out.println("Connect successfully");
    }
           
}