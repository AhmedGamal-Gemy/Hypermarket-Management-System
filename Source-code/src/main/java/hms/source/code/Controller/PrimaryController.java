package hms.source.code.Controller;

import hms.source.code.App;
import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController extends App{

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
