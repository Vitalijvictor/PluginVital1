module com.example.pluginvital1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pluginvital1 to javafx.fxml;
    exports com.example.pluginvital1;
}