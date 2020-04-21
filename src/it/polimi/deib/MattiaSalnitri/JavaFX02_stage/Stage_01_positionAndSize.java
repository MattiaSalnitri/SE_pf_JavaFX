package it.polimi.deib.MattiaSalnitri.JavaFX02_stage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Stage_01_positionAndSize extends Application {
    @Override
    public void start(Stage primaryStage)
    {
        //create an object
        Label label = new Label("Hello World, JavaFX !");
        //create a scene with the object
        Scene scene = new Scene(label, 400, 200);
        //add a scente to the stage
        primaryStage.setScene(scene);

        //Setting title to the Stage
        primaryStage.setTitle("Sample Application");

        //Adding scene to the stage
        primaryStage.setScene(scene);

        primaryStage.setX(50);
        primaryStage.setY(100);

        //size of the stage
        primaryStage.setWidth(600);
        primaryStage.setHeight(100);

        //Displaying the contents of the stage
        primaryStage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}
