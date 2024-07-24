package hms.source.code.Model;

import hms.source.code.Model.Interfaces.InventoryManagerModelInterface;

/**
 *
 * @author ahmedgamal
 */
public class InventoryManager extends User implements InventoryManagerModelInterface{
    
    public InventoryManager(int id, int SSN, String name, String email, String hashedPassword, String address, int age, String role, boolean isActive, int departmentId) {
        super(id, SSN, name, email, hashedPassword, address, age, role, isActive, departmentId);
    }
    
    
    
}
