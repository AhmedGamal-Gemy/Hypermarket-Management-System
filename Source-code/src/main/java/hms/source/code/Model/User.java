package hms.source.code.Model;

import hms.source.code.Model.Interfaces.UserModelInterface;

public class User implements UserModelInterface {

    private int id;
    private long SSN;
    private String name;
    private String email;
    private String hashedPassword;
    private String address;
    private int age;
    private String role;
    private boolean isActive;
    private int departmentId;

    public User(int id, long SSN, String name ,String email,String hashedPassword, String address, int age, String role, boolean isActive, int departmentId){
        
        this.id = id;
        this.SSN = SSN;
        this.name = name;
        this.email = email;
        this.hashedPassword = hashedPassword;
        this.address = address;
        this.age = age;
        this.role = role;
        this.isActive = isActive;
        this.departmentId = departmentId;
        
        
    }

    public User() {

    }
    
    @Override
    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public void setSSN(long ssn) {
        this.SSN = ssn;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    
    
    
    
    
    
    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public long getSSN() {
        return this.SSN;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public String getHashedPassword() {
        return this.hashedPassword;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getRole() {
        return this.role;
    }

    @Override
    public boolean getIsActive() {
        return this.isActive;
    }

    @Override
    public int getDepartmentId() {
        return this.departmentId;
    }

    
  

}
