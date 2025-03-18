package project.rpcs.javafxdemo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField txtField;

    @FXML
    private PasswordField pwField;

    @FXML
    private Button loginButton;

    private LoginModel loginModel = new LoginModel();

    @FXML
    private void printUsernameAndPassword() {
        String username = txtField.getText();
        String password = pwField.getText();
        boolean hasBeenUsed = false;

        loginModel.addUser(username, password, hasBeenUsed);
    }

}
