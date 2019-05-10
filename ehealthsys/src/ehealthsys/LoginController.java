package ehealthsys;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    
    Statement stmt;
    
    @FXML
    private void handleActionLogin(ActionEvent event) throws SQLException, IOException {
        ResultSet rs;
        String user =txtUser.getText();
        System.out.println(user);
        String password = txtPassword.getText();
        System.out.println(password);
        String Emailid = null, Paswrd = null;
        String sqlselect = "SELECT email, password FROM temphp WHERE email="+"'"+user+"'";
        System.out.println(sqlselect);
        try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Loaded driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://www.papademas.net:3307/510labs", "db510", "510");
             
                System.out.println("Connected to MySQL");
                stmt = con.createStatement();
                rs = stmt.executeQuery(sqlselect);
                System.out.println(rs);
                while (rs.next()) {
                Emailid = rs.getString(1);
                Paswrd = rs.getString(2);
            }
                con.close();
         } 
         catch (Exception ex) {
                ex.printStackTrace();
         }
        
        System.out.println(Emailid);
        System.out.println(Paswrd);
       
       
       if (user.equals(Emailid)&&password.equals(Paswrd)){
           System.out.println("Success");
           Parent questionpg = FXMLLoader.load(getClass().getResource("Question.fxml"));
           Scene questionpgscene = new Scene(questionpg);
           Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();
           window.hide();
           window.setScene(questionpgscene);
           window.show();
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
