package Dao;

/**
 *
 * @author ahmedgamal
 */

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DatabaseConnection{

    // init database constants
    private static final String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3308/HMS";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String MAX_POOL = "250";

    // init connection object
    private Connection connection;
    
    // init properties object
    private Properties properties;

    // init the statement
    private Statement statement;
    
    // create properties
    private Properties getProperties()
    {
        if (properties == null)
        {
            properties = new Properties();
        
            properties.setProperty("user", USERNAME);
            
            properties.setProperty("password", PASSWORD);
            
            properties.setProperty("MaxPooledStatements", MAX_POOL);
        }
        
        return properties;
    }

    public Connection connect()
    {
        if (connection == null)
        {         
            try
            {
                Class.forName(DATABASE_DRIVER);
                
                connection = (Connection) DriverManager.getConnection(DATABASE_URL, getProperties());
            }
            catch (ClassNotFoundException | SQLException e)
            {
                e.printStackTrace();
            }
        }
        return connection;
    }


    void disconnect()
    {
        if (connection != null)
        {
            try
            {
                connection.close();
             
                connection = null;
                
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }
    
   
    
}