/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notelazy.Ctrl;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import notelazy.View.ViewMaster;

/**
 * FXML Controller class
 *
 * @author sonny
 */
public class GradesController implements Initializable {

    private ViewMaster application;
    
    public void setApp(ViewMaster application){
        this.application = application;
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        application.setTitle(rb.getString("title"),rb.getString("title.edition.grade"));
    }    
    
    public void selectLesson(){
        
    }
    
    public void back(){
        application.goToMainView(); 
    }
    
    public void addGrade(){
        
    }
    
    public void deleteGrade(){
        
    }
    
}