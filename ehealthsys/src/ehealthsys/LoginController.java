/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ehealthsys;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author hiren
 */
public class LoginController implements Initializable {
    
    @FXML
    private TextField txtUser;
    @FXML
    private Label txtLabel; 
    @FXML
    private TextField txtPassword;
    @FXML
    private void handleActionLogin(ActionEvent event) {
         if(txtUser.getText().equals("User")&&txtPassword.getText().equals("User")){
            txtLabel.setText("Sucess Login");
        }else{
            txtLabel.setText("Unsucess Login");
        }
    }
    @FXML
    private void handleActionNewUser(ActionEvent event) throws IOException{
        txtLabel.setText("NewUser");
        Parent root = FXMLLoader.load(getClass().getResource("Register.fxml"));
        Scene hompageParent = new Scene(root);
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.hide();
        stage.setScene(hompageParent);
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
