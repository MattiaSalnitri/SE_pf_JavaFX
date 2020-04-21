package it.polimi.deib.MattiaSalnitri.JavaFX02_stage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Stage_03_decorator extends Application {
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

        //in this case it is bigger than the element
        primaryStage.setWidth(600);
        primaryStage.setHeight(100);

        primaryStage.initStyle(StageStyle.DECORATED);    //standard window with OS decorations (title bar and minimize / maximize / close buttons), and a white background.
        //primaryStage.initStyle(StageStyle.UNDECORATED);  //standard window without OS decorations, but still with a white background.
        //primaryStage.initStyle(StageStyle.TRANSPARENT);  //undecorated window with transparent background.
        //primaryStage.initStyle(StageStyle.UNIFIED);      //decorated stage, except it has no border between the decoration area and the main content area.
        //primaryStage.initStyle(StageStyle.UTILITY);      //decorated window, but with minimal decorations. no minimise/expand buttons

        //Displaying the contents of the stage
        primaryStage.show();

    }
    public static void main(String args[]){
        launch(args);
    }
}
