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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Parth Kaushik
 */
public class SymptomsController implements Initializable {

    ObservableList<String> headche = FXCollections.observableArrayList("Severe","Mild");
    
     ObservableList<String> CC = FXCollections.observableArrayList("Severe","Mild");
    
@FXML
    
    private ChoiceBox Headche;
   
    private ChoiceBox Cough;
    

  
    @FXML
    private void loaddata1(){
     String c="Severe";
          String d = "Mild";
          
      CC.removeAll(CC);
          CC.addAll(c,d);
          Cough.getItems().addAll(CC);
    
    
    }
      @FXML 
      private void loaddata(){
          String a ="Severe";
          String b  = "Mild";
          
          headche.removeAll(headche);
          headche.addAll(a,b);
          Headche.getItems().addAll(headche);
          
        
      
      }
    
    
   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        loaddata();
        loaddata1();
       
        
    }    
    
    
   
    
}
