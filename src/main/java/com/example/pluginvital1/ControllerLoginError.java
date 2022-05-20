package com.example.pluginvital1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerLoginError {

    @FXML
    private AnchorPane aP4;

    @FXML
    private Label labelLoginError;

    @FXML
    private Button loginButtonError;

    @FXML
    private TextField loginNameError;

    @FXML
    private PasswordField loginPasswordError;

    @FXML
    private ImageView logo;

    @FXML
    private Text textError;

    @FXML
    void initialize() {
        loginButtonError.setOnAction(event -> {
            String name = loginNameError.getText().trim();
            String password = loginPasswordError.getText().trim();
            if (name.equals("") || password.equals("")) {

                loginButtonError.setOnAction(eventAction -> {
                    loginButtonError.getScene().getWindow().hide();

                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("loginError-view.fxml"));
                    Scene scene = null;
                    try {
                        scene = new Scene(fxmlLoader.load());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    Stage stage = new Stage();
                    stage.setTitle("Login Error!");
                    stage.setScene(scene);
                    stage.show();
                });
            } else {
                System.out.println("Good Error!");
            }
        });
    }
}