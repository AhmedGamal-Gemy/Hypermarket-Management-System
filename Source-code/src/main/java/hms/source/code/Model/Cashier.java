
package hms.source.code.Model;

import hms.source.code.Model.Interfaces.CashierModelInterface;


/**
 *
 * @author ahmedgamal
 */
public class Cashier extends User implements CashierModelInterface{
    
    public Cashier(int id, int SSN, String name, String email, String hashedPassword, String address, int age, String role, boolean isActive, int departmentId) {
        super(id, SSN, name, email, hashedPassword, address, age, role, isActive, departmentId);
    }
    
}
