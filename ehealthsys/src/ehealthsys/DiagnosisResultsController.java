/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ehealthsys;

import java.io.IOException;
import java.net.URL;
import java.util.*;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author Parth Kaushik
 */
public class DiagnosisResultsController implements Initializable {

    @FXML
    private Label txtLabel;
    
    
    
    
    
    
    public void setData(String data) {
        txtLabel.setText(data);
    }
   
   @FXML
private void handleActionBack(ActionEvent event) throws IOException{
    Parent Symptomspg = FXMLLoader.load(getClass().getResource("Symptoms.fxml"));
    Scene Symptomspgscene = new Scene(Symptomspg);
    Stage windowb3 = (Stage)((Node) event.getSource()).getScene().getWindow();
    windowb3.hide();
    windowb3.setScene(Symptomspgscene);
    windowb3.show();
}
    /**
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
