package Dao;

import com.mysql.jdbc.Connection;
import hms.source.code.Model.Interfaces.UserModelInterface;
import hms.source.code.Model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ahmedgamal
 */
public class UserDao extends Dao{

    @Override
    public Object get(int thingId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public Object get(String email, String password_hash) {


        String sql = "SELECT * FROM `USERS` WHERE EMAIL = ? AND PASSWORD_HASH = ?";

        QueryObject queryObject = new QueryObject(sql);
        queryObject.addParameter( (Object) email);
        queryObject.addParameter( (Object) password_hash);
        
        ResultSet rs = null;
      
        try {
            
            rs = executeQuery(queryObject);

            if (rs.next()) {

                int id = rs.getInt(1);
                long SSN = rs.getLong(2);
                String name = rs.getString(3);
                String emailFromDatabase = rs.getString(4);
                String hashedPasswordFromDatabase = rs.getString(5);
                String address = rs.getString(6);
                int age = rs.getInt(7);
                String role = rs.getString(8);
                boolean isActive = rs.getBoolean(9);
                int departmentId = rs.getInt(10);

                UserModelInterface user = new User(id, SSN, name, emailFromDatabase, hashedPasswordFromDatabase, address, age, role, isActive, departmentId);
                return user;

            } else {

                return null;

            }

        } catch (SQLException ex) {
            return null;
        } finally {
            try {
                conn.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    @Override
    public void create(Object thing) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Object thing) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int thingId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
