package hms.source.code;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("View/" + fxml + "View.fxml"));
        return fxmlLoader.load();
    }

    protected static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws SQLException {
        
        launch();
        
    }

}
