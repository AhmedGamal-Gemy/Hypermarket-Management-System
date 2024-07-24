package hms.source.code.Model.Interfaces;

import java.sql.Date;

/**
 *
 * @author ahmedgamal
 */
public interface ProductModelInterface {
    
    
    public void setProductId(int productId);
    public void setProductName(String ProductName);
    public void setDescription(String description);
    public void setPrice(double price);
    public void setCategoryId(int categoryId);
    public void setImagePath(String imagePath);
    public void setAddingDate(Date addingDate);
    
    public int getProductId();
    public String getProductName();
    public String getDescription();
    public double getPrice();
    public int getCategoryId();
    public String getImagePath();
    public Date getAddingDate();
    
    
}
