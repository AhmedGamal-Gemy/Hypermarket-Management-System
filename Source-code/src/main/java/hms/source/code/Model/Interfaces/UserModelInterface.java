/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hms.source.code.Model.Interfaces;

/**
 *
 * @author ahmedgamal
 */
public interface UserModelInterface {
    
    public void setId(int id);
    public void setSSN(long ssn);
    public void setName(String name);
    public void setEmail(String email);
    public void setHashedPassword(String password);
    public void setAddress(String address);
    public void setAge(int age);
    public void setRole(String role);
    public void setIsActive(boolean isActive);
    public void setDepartmentId(int departmentId);
    
    public int getId();
    public long getSSN();
    public String getName();
    public String getEmail();
    public String getHashedPassword();
    public String getAddress();
    public int getAge();
    public String getRole();
    public boolean getIsActive();
    public int getDepartmentId();
    
}
