package com.example.ushtrimeprovim2023.DetyraNeLiber;

import javafx.application.Application;
import javafx.geometry.Insets;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.File;

public class Deryra10 extends Application {


    @Override
    public void start(Stage primaryStage)throws Exception{

        Pane pane=new HBox(10);
        pane.setPadding(new Insets(5,5,5,5));
        Image image=new Image(new File("com/example/ushtrimeprovim2023/DetyraNeLiber/Screenshot (103).png").toURI().toString());
        pane.getChildren().add(new ImageView(image));


        ImageView imageView2=new ImageView(image);
        imageView2.setFitHeight(100);
        imageView2.setFitWidth(100);

        pane.getChildren().add(imageView2);

        ImageView imageView3=new ImageView(image);
        imageView3.setRotate(90);
        pane.getChildren().add(imageView3);


        Scene scene=new Scene(pane);
        primaryStage.setTitle("Detyra e 10 ne liber");
        primaryStage.setScene(scene);
        primaryStage.show();


}

    public static void main(String[] args){
        launch(args);
    }






}
