module idk.source.code {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens idk.source.code to javafx.fxml;
    exports idk.source.code;
}
