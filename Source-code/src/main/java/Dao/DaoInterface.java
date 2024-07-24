/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

import com.mysql.jdbc.Connection;

/**
 *
 * @author ahmedgamal
 */
public interface DaoInterface<T>{
    
    
    T get(int thingId);
    void create(T thing);
    void update(T thing);
    void delete(int thingId);
    
    
}
