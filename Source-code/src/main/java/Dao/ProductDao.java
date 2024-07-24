package Dao;

import hms.source.code.Model.Product;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ahmedgamal
 */
public class ProductDao extends Dao{

    
    @Override
    public Object get(int thingId) {

        String sql = "SELECT * FROM PRODUCT WHERE PRODUCT_ID = ?;";
        
        QueryObject queryObject = new QueryObject(sql);
        
        queryObject.addParameter(thingId);
        
        ResultSet rs = null;
        try {
            
            rs = executeQuery(queryObject);
            
            if( rs.next() ){
                
                int product_id = rs.getInt(1);
                String product_name = rs.getString(2);
                String description = rs.getString(3);
                double price = rs.getDouble(4);
                int category_id = rs.getInt(5);
                String image_path = rs.getString(6);
                Date adding_date = rs.getDate(7);
                
                Product product = new Product(product_id, product_name, description, price, category_id, image_path, adding_date);
                return product;
                
            }
            
        } catch (SQLException e) {
            
            System.out.println("SOME THING WRONG IN PRODUCT DAO CATCH");
            
        }
        
        
        return null;
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
