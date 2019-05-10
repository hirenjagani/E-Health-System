/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ehealthsys;

import java.io.IOException;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author hiren
 */
public class Ehealthsys extends Application {
    
    @Override
    public void start(Stage stage) throws IOException {
        try{
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        }catch(IOException e){
        }      
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) throws SQLException {
        launch(args);
    }
    
}
