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

/**
 * FXML Controller class
 *
 * @author Parth Kaushik
 */
public class QuestionController implements Initializable {
@FXML

     private Label txtLabel; 
     @FXML
private void handleActionProceed(ActionEvent event) throws IOException{
Parent symptomspg = FXMLLoader.load(getClass().getResource("Symptoms.fxml"));
Scene symptomspgscene = new Scene(symptomspg);
Stage window1 = (Stage)((Node) event.getSource()).getScene().getWindow();
window1.hide();
window1.setScene(symptomspgscene);
window1.show();
}
    

@FXML
private void handleActionBack(ActionEvent event) throws IOException{
    Parent Registerpg = FXMLLoader.load(getClass().getResource("Register.fxml"));
    Scene Registerpgscene = new Scene(Registerpg);
    Stage windowb1 = (Stage)((Node) event.getSource()).getScene().getWindow();
    windowb1.hide();
    windowb1.setScene(Registerpgscene);
    windowb1.show();
}


    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
