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
    
public  RadioButton r1;
 

  @FXML
    
public RadioButton r2;
  
   @FXML
    
public RadioButton r3;
    @FXML
    
public RadioButton r4;
     @FXML
    
public RadioButton r5;
      @FXML
    
public RadioButton r6;
      
              
String data;

public void coldcough(){
  if()
}

public String check() {
 if (r1.isSelected()==TRUE){
      data ="radio1";

  }
 return data;
}
    
    
    

 

 
    // Code for Opening diagnosis results when user press submit button on symptoms page
    @FXML
private void handleActionSubmit(ActionEvent event) throws IOException{
    FXMLLoader loader = new FXMLLoader(getClass().getResource("Diagnosis Results.fxml"));
    Parent root = loader.load();
    DiagnosisResultsController control = loader.<DiagnosisResultsController>getController();
    String data1=check();
    control.setData(data1);

    
    //Parent Diagnosispg = FXMLLoader.load(getClass().getResource("Diagnosis Results.fxml"));
    Scene Diagnosispgscene = new Scene(root);
    Stage window2 = (Stage)((Node) event.getSource()).getScene().getWindow();
    window2.hide();
    window2.setScene(Diagnosispgscene);
    window2.show();
    
}
    
   
    @FXML
private void handleActionBack(ActionEvent event) throws IOException{
    Parent Questionpg = FXMLLoader.load(getClass().getResource("Question.fxml"));
    Scene Registerpgscene = new Scene(Questionpg);
    Stage windowb2 = (Stage)((Node) event.getSource()).getScene().getWindow();
    windowb2.hide();
    windowb2.setScene(Registerpgscene);
    windowb2.show();
}

        

  
    
   
    
   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        
    }    
    
    
   
    
}
