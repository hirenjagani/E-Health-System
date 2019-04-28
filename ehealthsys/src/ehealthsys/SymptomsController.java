/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ehealthsys;

import java.io.IOException;
import static java.lang.Character.UnicodeBlock.of;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Parth Kaushik
 */
public class SymptomsController implements Initializable {
 @FXML
    private Label txtLabel; 
 @FXML
    
private RadioButton r1;
 

  @FXML
    
private RadioButton r2;
  
   @FXML
    
private RadioButton r3;
    @FXML
    
private RadioButton r4;
     @FXML
    
private RadioButton r5;
      @FXML
    
private RadioButton r6;
      
     
    
    @FXML
    
    private void handleActionradio(ActionEvent event) {
    if(r1.isSelected() && r4.isSelected() && r5.isSelected()){
    
     txtLabel.setText("You are suffering from Cold & Cough");
    
    
    }
    else{
    
    txtLabel.setText("Bad selection");
    
            }
    }
 
 
 
 
    // Code for Opening diagnosis results when user press submit button on symptoms page
    @FXML
private void handleActionSubmit(ActionEvent event) throws IOException{
    
    
    Parent Diagnosispg = FXMLLoader.load(getClass().getResource("Diagnosis Results.fxml"));
    Scene Diagnosispgscene = new Scene(Diagnosispg);
    Stage window2 = (Stage)((Node) event.getSource()).getScene().getWindow();
    window2.hide();
    window2.setScene(Diagnosispgscene);
    window2.show();
}
    
   
    

        

  
    
   
    
   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        
    }    
    
    
   
    
}
