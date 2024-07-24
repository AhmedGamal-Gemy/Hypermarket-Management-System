package Dao;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ahmedgamal
 */
public abstract class Dao implements DaoInterface{
    
    final private DatabaseConnection dbc;
    Connection conn;

    public Dao() {

        dbc = new DatabaseConnection();
        conn = dbc.connect();

    }
    
    protected ResultSet executeQuery(QueryObject queryObject) throws SQLException{
        
        PreparedStatement ps = conn.prepareStatement(queryObject.getQuery());
        List<Object> params = queryObject.getParameters();

        for (int i = 0; i < params.size(); i++) {
            
            ps.setObject(i+1, params.get(i));
            
        }
        
        return ps.executeQuery();
        
    }

    
}
