package it.polimi.deib.MattiaSalnitri.JavaFX01_intro;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Intro_02_controls extends Application {
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

        //Displaying the contents of the stage
        primaryStage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}
