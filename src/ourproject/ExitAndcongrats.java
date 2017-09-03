/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ourproject;

import java.io.File;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

/**
 *
 * @author waleed
 */
public class ExitAndcongrats {
    Scene scene;
    Button exit;
    Button back;
     File file;
     Pane inst;
     Image BG ;
     ImageView Back;
     Label x1;
    public ExitAndcongrats(boolean ex, boolean con, boolean replay){
        
        if(ex == true && con == false && replay == false){
        exit = new Button();
        exit.setText("Exit");
        back = new Button();
        back.setText("Back");
            
        inst = new Pane();
        file = new File("oo.jpg");
        BG = new Image(file.toURI().toString());
        Back = new ImageView(BG);
        Back.fitHeightProperty().bind(inst.heightProperty());
        Back.fitWidthProperty().bind(inst.widthProperty());
        exit.setLayoutX(20);
        exit.setLayoutY(100);
        back.setLayoutX(345);
        back.setLayoutY(100);
        exit.setMinSize(52, 26);
        back.setMinSize(52, 26);

        inst.getChildren().add(Back);
        inst.getChildren().add(exit);
        inst.getChildren().add(back);

        scene = new Scene(inst, 400, 160);
        }

        if(ex == false && con == true && replay == true){
        exit = new Button();
        exit.setText("Exit");
        back = new Button();
        back.setText("Play Again");
            
        inst = new Pane();
        file = new File("oo.jpg");
        BG = new Image(file.toURI().toString());
        Back = new ImageView(BG);
        Back.setFitHeight(200);
        Back.setFitWidth(450);
        exit.setLayoutX(209);
        exit.setLayoutY(135);
        back.setLayoutX(286);
        back.setLayoutY(135);
        exit.setMinSize(52, 26);
        back.setMinSize(52, 26);

        inst.getChildren().add(Back);
        inst.getChildren().add(exit);
        inst.getChildren().add(back);
        scene = new Scene(inst, 400, 160);
        }
    }
    public Scene getScene(){
       
        return scene;
    }
}
