package hms.source.code.Model;

import hms.source.code.Model.Interfaces.CustomerModelInterface;

/**
 *
 * @author ahmedgamal
 */
public class Customer extends User implements CustomerModelInterface{
    
    public Customer(int id, int SSN, String name, String email, String hashedPassword, String address, int age, String role, boolean isActive, int departmentId) {
        super(id, SSN, name, email, hashedPassword, address, age, role, isActive, departmentId);
    }
    
}
