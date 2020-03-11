package Planten;

import Planten.java.dao.Database;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.sql.Connection;


public class main extends Application {

    private double xOffset = 0;
    private double yOffset = 0;
    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("view/Zoekscherm.fxml"));
        primaryStage.setTitle("PlantenEncyclopedie");

        primaryStage.initStyle(StageStyle.UNDECORATED);


        root.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });
        //move around here
        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                primaryStage.setX(event.getScreenX() - xOffset);
                primaryStage.setY(event.getScreenY() - yOffset);
            }
        });



        primaryStage.setScene(new Scene(root, 1278, 858));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
        
    }
    
}
