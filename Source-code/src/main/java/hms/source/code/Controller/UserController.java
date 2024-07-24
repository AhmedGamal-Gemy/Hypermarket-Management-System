/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hms.source.code.Controller;

import Dao.UserDao;
import hms.source.code.App;
import hms.source.code.Model.Interfaces.UserModelInterface;
import hms.source.code.Model.User;
import javafx.fxml.FXML;

/**
 *
 * @author ahmedgamal
 */
public class UserController extends App{
    
    @FXML 
    protected UserModelInterface login(String email,String password){
        
        UserModelInterface user = new User();
        
        UserDao userDao = new UserDao();
        
        user = (UserModelInterface) userDao.get(email, password);

        if(user == null){
            
            System.out.println("Incorrect credentials");
            return null;
            
        }else{
            
            System.out.println("Correct credentials");
            return user;
            
        }
        
    }
    
    
}
