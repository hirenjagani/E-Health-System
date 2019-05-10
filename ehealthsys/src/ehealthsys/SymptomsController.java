/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ehealthsys;

import java.io.IOException;
import static java.lang.Boolean.TRUE;
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
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;
import org.w3c.dom.css.Counter;

/**
 * FXML Controller class
 *
 * @author Parth Kaushik
 */
public class SymptomsController implements Initializable {
 @FXML
    private Label txtLabel; 
 @FXML
    
public  RadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15,r16,r17,r18;
          
String data;



public int countc=0,countd=0,countcp=0,countf=0;
    public void countcough(){
        if (r1.isSelected())
            countc++;
        if (r2.isSelected())
            countc++;
        if (r3.isSelected())
            countc++;
        if (r4.isSelected())
            countc++;
        if (r5.isSelected())
            countc++;
        if (r6.isSelected())
            countc++;
        System.out.println("cc :"+countc);
    }
    public void countdiahorea(){
        if (r7.isSelected())
            countd++;
        if (r8.isSelected())
            countd++;
        if (r9.isSelected())
            countd++;
        if (r10.isSelected())
            countd++;
        if (r11.isSelected())
            countd++;
        if (r6.isSelected())
            countd++;        
        System.out.println("cd "+countd);
    }
    public void countconstipation(){
        if (r12.isSelected())
            countcp++;
        if (r13.isSelected())
            countcp++;
        if (r9.isSelected())
            countcp++;
        if (r14.isSelected())
            countcp++;
        if (r15.isSelected())
            countcp++;        
        System.out.println("cp "+countcp);
    }
    public void countfleu(){
        if (r15.isSelected())
            countf++;
        if (r16.isSelected())
            countf++;
        if (r6.isSelected())
            countf++;
        if (r17.isSelected())
            countf++;
        if (r18.isSelected())
            countf++;
        if (r1.isSelected())
            countf++;
        if (r4.isSelected())
            countf++;
        if (r5.isSelected())
            countf++;
        System.out.println("f "+countf);
    }
   public int[] countarr = new int[3];
   
   
   int max=0;
   
   public void findmax(){
       
   }
    
   @FXML
   public void handlecoughcold(){
       r7.setSelected(false);
       r8.setSelected(false);
       r9.setSelected(false);
       r10.setSelected(false);
       r11.setSelected(false);
       r13.setSelected(false);
   }
   @FXML
   public void handlediahorea(){
       r1.setSelected(false);
       r2.setSelected(false);
       r3.setSelected(false);
       r4.setSelected(false);
       r5.setSelected(false);
       r13.setSelected(false);
   }
   
   @FXML
   public void handleconsipation(){
       r1.setSelected(false);
       r2.setSelected(false);
       r3.setSelected(false);
       r4.setSelected(false);
       r5.setSelected(false);
       r6.setSelected(false);
       r8.setSelected(false);
       r10.setSelected(false);
       r11.setSelected(false);
       r16.setSelected(false);
       r17.setSelected(false);
       r18.setSelected(false);
   }
      
   @FXML
   public void handlefever(){
       r7.setSelected(false);
       r8.setSelected(false);
       r9.setSelected(false);
       r10.setSelected(false);
       r11.setSelected(false);
       r12.setSelected(false);
       r13.setSelected(false);
   }
   
   public String diseasedisplay(){
       
        if (r10.isSelected()){
            data = "diahorea";
        }else if (r13.isSelected()){
            data = "constipation";
        }else{
            data = "fleu and cold and cough";
        }
//       countcough();
//       countdiahorea();
//       countconstipation();
//       countfleu();
//       countarr[0]=countc;
//       countarr[1]=countd;
//       countarr[2]=countcp;
//       countarr[3]=countf;
//       System.out.println(countarr.length);
//       for (int i=0;i<countarr.length;i++){
//          if (countarr[i]>=max){
//              System.out.println(countarr[i]);
//              max=countarr[i];
//              System.out.println(max);
//          }        
//       }
//           
//           System.out.println("MAX : "+max);
//           System.out.println("arr1 : "+countarr[0]);
//           System.out.println("arr2 : "+countarr[1]);
//           System.out.println("arr3 : "+countarr[2]);
//           System.out.println("arr4 : "+countarr[3]);
//           if (max == countarr[0]){
//               data = "Suffering from cold and cough";
//           }
//           else if (max == countarr[1]){
//               data = " Suffering form Diahorea";
//           }
//           else if (max == countarr[2]){
//               data = "Suffering from consipation";
//           }
//           else {
//               data = "suffering from fleu";
//           }
//           
//           
//       
       return data;
   }
   

    // Code for Opening diagnosis results when user press submit button on symptoms page
    @FXML
private void handleActionSubmit(ActionEvent event) throws IOException{
    FXMLLoader loader = new FXMLLoader(getClass().getResource("Diagnosis Results.fxml"));
    Parent root = loader.load();
    DiagnosisResultsController control = loader.<DiagnosisResultsController>getController();
    String data1=diseasedisplay();
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
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        
    }    
    
    
   
    
}
