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
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerLogin {

    @FXML
    private AnchorPane aP2;

    @FXML
    private Label labelLogin;

    @FXML
    private Button loginButton;

    @FXML
    private TextField loginName;

    @FXML
    private PasswordField loginPassword;

    @FXML
    private ImageView logo;

    @FXML
    void initialize() {
        loginButton.setOnAction(event -> {
            String name = loginName.getText().trim();
            String password = loginPassword.getText().trim();
            if (name.equals("") || password.equals("")) {

                loginButton.setOnAction(eventAction -> {
                    loginButton.getScene().getWindow().hide();

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
                System.out.println("good login");
            }
        });
    }
}