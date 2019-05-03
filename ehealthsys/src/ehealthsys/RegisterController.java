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
import javafx.stage.Stage;
import javax.swing.JButton;

/**
 * FXML Controller class
 *
 * @author hiren
 */







  

public class RegisterController implements Initializable {
@FXML

private Label txtLabel; 
  
      
  



@FXML
private void handleActionSubmit(ActionEvent event) throws IOException{
    Parent questionpg = FXMLLoader.load(getClass().getResource("Question.fxml"));
    Scene questionpgscene = new Scene(questionpg);
    Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();
    window.hide();
    window.setScene(questionpgscene);
    window.show();
}




@FXML
private void handleActionBack(ActionEvent event) throws IOException{
    Parent Loginpg = FXMLLoader.load(getClass().getResource("Login.fxml"));
    Scene Loginpgscene = new Scene(Loginpg);
    Stage windowb = (Stage)((Node) event.getSource()).getScene().getWindow();
    windowb.hide();
    windowb.setScene(Loginpgscene);
    windowb.show();
}



    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
