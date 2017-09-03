/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ourproject;

/**
 *
 * @author Ahmed
 */

import java.io.File;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class mainScene {
      Button start,ranking,inst,copyright,exit;
      File image,image2;
      Image IM,IM2;
      ImageView MV,MV2;
      Scene scene;
       Pane root;
      public mainScene()
      {
        start = new Button("Start");
        ranking = new Button("Ranking");
        inst = new Button("Instructions");
        copyright = new Button("Copyright");
        exit= new Button("Exit");
        start.setLayoutX(190);
        start.setLayoutY(160);
        start.setMinSize(130, 30);
        start.setFont(Font.font("system", FontWeight.BOLD, FontPosture.REGULAR, 18));
        ranking.setLayoutX(190);
        ranking.setLayoutY(210);
        ranking.setMinSize(130, 30);
        ranking.setFont(Font.font("system", FontWeight.BOLD, FontPosture.REGULAR, 18));
         inst.setLayoutX(190);
        inst.setLayoutY(260);
        inst.setMinSize(130, 30);
        inst.setFont(Font.font("system", FontWeight.BOLD, FontPosture.REGULAR, 18));
        copyright.setLayoutX(190);
        copyright.setLayoutY(310);
        copyright.setMinSize(130, 30);
         copyright.setFont(Font.font("system", FontWeight.BOLD, FontPosture.REGULAR, 18));
        exit.setLayoutX(190);
        exit.setLayoutY(360);
        exit.setMinSize(130, 30);
        exit.setFont(Font.font("system", FontWeight.BOLD, FontPosture.REGULAR, 18));
        image = new File("main.jpg"); 
        IM = new Image(image.toURI().toString());
        MV = new ImageView(IM);
        image2 = new File("main2.png"); 
        IM2 = new Image(image2.toURI().toString());
        MV2 = new ImageView(IM2);   
        root = new Pane();
        MV.setFitHeight(615);
        MV.setFitWidth(615);    
        MV2.setFitHeight(120);
        MV2.setFitWidth(250);
        MV2.setLayoutX(130);
        MV2.setLayoutY(30);
        root.getChildren().add(MV);
        root.getChildren().add(MV2);
        root.getChildren().add(start);
        root.getChildren().add(ranking);
        root.getChildren().add(inst);
        root.getChildren().add(copyright);
        root.getChildren().add(exit);
       scene = new Scene(root,500 ,400);
      } 
      public Scene getScene()
      {
          return scene;
      }
              
}
