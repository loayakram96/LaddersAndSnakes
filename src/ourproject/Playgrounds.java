/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ourproject;

import java.io.File;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

/**
 *
 * @author waleed
 */
public class Playgrounds {
    Scene scene;
    Button back;
    ImageView Back2,Back1,Back;
    File f,f1,f2;
    Image BG,BG1,BG2;
    Text x1,x2;
    public Playgrounds(){
        back = new Button();
        back.setText("Back");
        back.setLayoutX(330);
        back.setLayoutY(260);
        back.setMinSize(52, 20);
        
        Pane inst = new Pane();
        
        f = new File("board2.jpg");
        BG = new Image(f.toURI().toString());
        Back = new ImageView(BG);
        Back.setLayoutX(0);
        Back.setLayoutY(0);
        
        
        f1 = new File("board1.jpg");
        BG1 = new Image(f1.toURI().toString());
        Back1 = new ImageView(BG1);
        Back1.setLayoutX(415);
        Back1.setLayoutY(0);
        
        
        f2 = new File("die.gif");
        BG2 = new Image(f2.toURI().toString());
        Back2 = new ImageView(BG2);
        Back2.setFitHeight(300);
        Back2.setFitWidth(310);
        Back2.setLayoutX(200);
        Back2.setLayoutY(0);
        
        x1 = new Text("Choose One");
        x2 = new Text("<--Left Right-->");
        x1.setLayoutX(301);
        x1.setLayoutY(25);
        
        x2.setLayoutX(282);
        x2.setLayoutY(55);
        
        x1.setFont(Font.font("system", FontWeight.BOLD, FontPosture.REGULAR,20));
        x1.setStyle("-fx-stroke: white;");   
        x1.setTextAlignment(TextAlignment.LEFT);
          
        x2.setFont(Font.font("system", FontWeight.BOLD, FontPosture.REGULAR,20));
        x2.setStyle("-fx-stroke: white;");   
        x2.setTextAlignment(TextAlignment.LEFT);   


        inst.getChildren().add(Back2);
        inst.getChildren().add(Back);
        inst.getChildren().add(Back1);
        inst.getChildren().add(x1);
        inst.getChildren().add(x2);
        inst.getChildren().add(back);
        scene = new Scene(inst,705,290);
    }
    public Scene getScene(){
       
        return scene;
    }

}
