package com.example.pluginvital1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;

public class Controller  {

    @FXML
    private AnchorPane aP1;

    @FXML
    private Button connectButton;

    @FXML
    private ImageView logo;

    @FXML
    void initialize() {
        connectButton.setOnAction(event -> {
            connectButton.getScene().getWindow().hide();

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login-view.fxml"));
            Scene scene = null;
            try {
                scene = new Scene(fxmlLoader.load());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Stage stage = new Stage();
            stage.setTitle("Login!");
            stage.setScene(scene);
            stage.show();
        });
    }
}
