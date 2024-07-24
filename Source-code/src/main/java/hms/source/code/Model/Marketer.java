
package hms.source.code.Model;

import hms.source.code.Model.Interfaces.MarketerModelInterface;

/**
 *
 * @author ahmedgamal
 */
public class Marketer extends User implements MarketerModelInterface{
    
    public Marketer(int id, int SSN, String name, String email, String hashedPassword, String address, int age, String role, boolean isActive, int departmentId) {
        super(id, SSN, name, email, hashedPassword, address, age, role, isActive, departmentId);
    }
    
}
