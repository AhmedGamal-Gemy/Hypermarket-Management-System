package hms.source.code.Controller;

import Dao.ProductDao;
import hms.source.code.App;
import hms.source.code.Model.Interfaces.UserModelInterface;
import hms.source.code.Model.Product;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author ahmedgamal
 */
public class CashierController extends UserController implements Initializable {

    @FXML
    TextField productIdInput;

    @FXML
    Text productIdInvalid;

    @FXML
    Text productNotFound;
    
    @FXML 
    VBox products_container;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    protected void switchToView(UserModelInterface user) {
        try {
            App.setRoot("cashierView");
        } catch (IOException ex) {
            Logger.getLogger(CashierController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    private void addProductToUI(Product product){
        
        InputStream stream = new FileInputStream(product.getImagePath());
        
        
        
        HBox productHbox = new HBox();
        
    }
    
    @FXML
    private void fadingEffect(Text targetedText) {

        targetedText.setText("Product not found in the system");
        targetedText.setOpacity(0); // Initially invisible

        FadeTransition fade = new FadeTransition(Duration.seconds(2), targetedText);
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.play();

        // Create another FadeTransition to fade out after 2 seconds
        FadeTransition fadeOut = new FadeTransition(Duration.seconds(3), targetedText);
        fadeOut.setFromValue(1);
        fadeOut.setToValue(0);
        fadeOut.setDelay(Duration.seconds(5)); // Start after 2 seconds
        fadeOut.play();

    }

    @FXML
    private void addProduct() {

        int productId;

        try {

            productId = Integer.parseInt(productIdInput.getText());

            ProductDao productDao = new ProductDao();

            Product product = (Product) productDao.get(productId);

            if (product == null) {

                System.out.println("Product not found in the system");
                fadingEffect(productNotFound);

            } else {

                System.out.println(product.getProductName());
                addProductToUI(product);

            }

        } catch (Exception e) {

            System.out.println("Enter a valid id");
            System.out.println(e);
            productIdInvalid.setText("Enter a valid id");

        }

    }

}
