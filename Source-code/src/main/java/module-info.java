module hms.source.code {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens hms.source.code.Controller to javafx.fxml;
    exports hms.source.code;
    exports hms.source.code.Controller;
    requires mysql.connector.java;
    requires java.sql;
}
