module hms.source.code {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens hms.source.code to javafx.fxml;
    exports hms.source.code;
}
