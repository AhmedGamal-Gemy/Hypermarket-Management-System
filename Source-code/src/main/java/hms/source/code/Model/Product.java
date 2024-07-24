package hms.source.code.Model;

import hms.source.code.Model.Interfaces.ProductModelInterface;
import java.sql.Date;

/**
 *
 * @author ahmedgamal
 */
public class Product implements ProductModelInterface{

    private int productId;
    private String productName;
    private String description;
    private double price;
    private int categoryId;
    private String imagePath;
    private Date addingDate;
    
    public Product(int productId,String productName,String description, double price, int categoryId, String imagePath, Date addingDate){        

        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.categoryId = categoryId;
        this.imagePath = imagePath;
        this.addingDate = addingDate;
        
    }
    
    @Override
    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;   
    }

    @Override
    public void setPrice(double price) {
        this.price = price;    
    }

    @Override
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;    
    }

    @Override
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;    
    }

    @Override
    public void setAddingDate(Date addingDate) {
        this.addingDate = addingDate;
    }

    
    
    
    
    
    
    
    
    @Override
    public int getProductId() {
        return this.productId;
    }

    @Override
    public String getProductName() {
        return this.productName;  
    }

    @Override
    public String getDescription() {
        return this.description;   
    }

    @Override
    public double getPrice() {
        return this.price;    
    }

    @Override
    public int getCategoryId() {
        return this.categoryId;   
    }

    @Override
    public String getImagePath() {
        return this.imagePath;   
    }

    @Override
    public Date getAddingDate() {
        return this.addingDate;
    }
    
}
