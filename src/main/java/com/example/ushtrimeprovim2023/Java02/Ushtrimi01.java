package com.example.ushtrimeprovim2023.Java02;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Ushtrimi01 extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
//        Line line=new Line();
//        line.setStartX(0);
//        line.setStartY(0);
//        line.setEndX(100);
//        line.setEndY(100);
//
//        MyLine line2=new MyLine();
//        line2.setStartPoint(0,0);
//        line2.setEndPoints(100,100);
//
//        MyLine line3=new MyLine();
//        line3.setStartPoint(100,100);
//        line3.setEndPoints(200,200);


        MyRect rect = new MyRect();
        rect.setWidth(50);
        rect.setHeight(10);


        Pane pane=new Pane();
        pane.getChildren().addAll(rect);

        Scene scene = new Scene(pane, 500, 500);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Detyra e pare ne javen e dyte");
        primaryStage.show();


    }



    public static void main(String[] args){
        launch(args);
    }

}


class MyLine extends Line{
    public void setStartPoint(double x,double y){
        super.setStartX(x);
        super.setStartY(y);
    }

    public void setEndPoints(double x,double y){
        super.setEndX(x);
        super.setEndY(y);
    }
}

class MyRectange extends Pane{
    private void draw(){
        Rectangle rect=new Rectangle();
        rect.setX(10);
        rect.setY(10);
        rect.setWidth(super.getWidth());
        rect.setHeight(super.getHeight());
        rect.setFill(null);

        Line line1,line2;
        line1=new  Line(rect.getX(), rect.getY(),
                rect.getX() + rect.getWidth(),
                rect.getY() + rect.getHeight());

        line2=new Line(rect.getX()+rect.getWidth(),rect.getY(),rect.getX(),rect.getY()+rect.getHeight());

        super.getChildren().clear();
        super.getChildren().addAll(rect,line1,line2);
    }

    public void setWidth(double width) {
        super.setWidth(width);
        this.draw();
    }

    public void setHeight(double height) {
        super.setHeight(height);
        this.draw();
    }


}
class MyRectangleAdvanced extends Pane {
    private void draw() {
        Rectangle rect = new Rectangle();
        rect.setX(10);
        rect.setY(10);
        rect.setWidth(super.getWidth());
        rect.setHeight(super.getHeight());
        rect.setFill(null);
        rect.setStroke(Color.BLACK);

        double x0, x1, x2, x3, x4;
        double y0, y1, y2, y3, y4;

        x0 = rect.getX();
        y0 = rect.getY();
        x1 = rect.getX() + rect.getWidth();
        y1 = y0;
        x2 = x1;
        y2 = y0 + rect.getHeight();
        x3 = x0;
        y3 = y0 + rect.getHeight();
        x4 = x0 + rect.getWidth() / 2;
        y4 = y0 + rect.getHeight() / 2;

        Polygon pg1, pg2, pg3, pg4;

        pg1 = new Polygon(x0, y0, x4, y4, x3, y3);
        pg1.setFill(Color.RED);
        pg2 = new Polygon(x0, y0, x4, y4, x1, y1);
        pg2.setFill(Color.GREEN);
        pg3 = new Polygon(x1, y1, x4, y4, x2, y2);
        pg3.setFill(Color.BLUE);
        pg4 = new Polygon(x2, y2, x4, y4, x3, y3);
        pg4.setFill(Color.DARKMAGENTA);

        super.getChildren().clear();
        super.getChildren().addAll(rect, pg1, pg2, pg3, pg4);
    }

    public void setWidth(double width) {
        super.setWidth(width);
        this.draw();
    }

    public void setHeight(double height) {
        super.setHeight(height);
        this.draw();
    }
}
class MyFan extends Pane {
    private int num = 4;

    private void draw() {
        double x,y,radius;
        x = 10 + super.getWidth() / 2;
        y = 10 + super.getHeight() / 2;
        radius = super.getWidth() / 2;

        Circle circle = new Circle(x, y, radius);
        circle.setFill(null);
        circle.setStroke(Color.BLACK);

        Group group = new Group();
        for(int i = 0; i < this.num; i++) {
            double startPosition = 360 / this.num;
            double length = startPosition / 2;
            Arc arc = new Arc(x, y, radius - 10,
                    radius - 10, i * startPosition, length);
            arc.setFill(null);
            arc.setStroke(Color.GREEN);
            arc.setStrokeWidth(3);
            arc.setType(ArcType.ROUND);

            group.getChildren().add(arc);
        }

        super.getChildren().clear();
        super.getChildren().addAll(circle, group);
    }

    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width);
        this.draw();
    }

    public void setNumberOfArcs(int num) {
        this.num = num;
        this.draw();
    }

}

class MyRect extends Pane {

    private void vizato() {
        Group group = new Group();
        for (int i = 0; i < 6; i++) {
            Rectangle r = new Rectangle(150, 150, 200, 50);
            r.setRotate(i * 360 / 10);
            r.setStroke(Color.color(Math.random(), Math.random(),Math.random()));
            r.setFill(null);
            group.getChildren().add(r);
        }

        super.getChildren().clear();
        super.getChildren().add(group);

    }

    public void setWidth(double width) {
        super.setWidth(width);
        this.vizato();
    }

    public void setHeight(double height) {
        super.setHeight(height);
        this.vizato();
    }
}