package hms.source.code.Controller;

import Dao.DatabaseConnection;
import hms.source.code.App;
import hms.source.code.Model.Interfaces.UserModelInterface;
import hms.source.code.Model.User;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class PrimaryController extends App {

    @FXML
    private ListView<String> itemsListView;

    @FXML
    private TextField email_input;

    @FXML
    private TextField password_input;

    @FXML
    private Text error_message;

    private void switchView(String userType){
        
        try {
// here i convert the first character to capital because it's capital in the views folder
            String firstLetter = userType.substring(0, 1).toUpperCase();
            String remaningWord = userType.substring(1);
            String result = firstLetter + remaningWord;
            App.setRoot(result);
        } catch (IOException ex) {
            Logger.getLogger(PrimaryController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @FXML
    private void loginBtn() {

        String enteredEmail = email_input.getText();
        String enteredPassword = password_input.getText();

        UserModelInterface currentUser = new User();

        UserController userController = new UserController();
        currentUser = userController.login(enteredEmail, enteredPassword);

        if (currentUser == null) {

            error_message.setText("Invalid Credentials");

        } else {

            String role = currentUser.getRole();
            switch (role) {
                
                case "cashier":
                    
                    switchView("Cashier");
                    
                    break;
                case "marketer":
                    
                    switchView("Marketer");

                    
                    break;
                case "admin":
                    
                    switchView("Admin");
                    
                    break;
                case "inventoryManager":
                    
                    switchView("InventoryManager");
                    
                    break;
                case "customer":
                    
                    switchView("Customer");
                    
                    break;
                default:
                error_message.setText("Something went wrong try again");
            }

        }

    }
}
