
package hms.source.code.Model;

import hms.source.code.Model.Interfaces.AdminModelInterface;

/**
 *
 * @author ahmedgamal
 */
public class Admin extends User implements AdminModelInterface {
    
    public Admin(int id, int SSN, String name, String email, String hashedPassword, String address, int age, String role, boolean isActive, int departmentId) {
        super(id, SSN, name, email, hashedPassword, address, age, role, isActive, departmentId);
    }
    
}
