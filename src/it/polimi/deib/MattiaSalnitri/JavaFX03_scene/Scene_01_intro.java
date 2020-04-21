package it.polimi.deib.MattiaSalnitri.JavaFX03_scene;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Scene_01_intro extends Application {
    @Override
    public void start(Stage primaryStage)
    {
        VBox vBox = new VBox(new Label("A JavaFX Label"));
        Scene scene = new Scene(vBox);//each scene contains a tree graph and it is associate with a root node, in this case a VBOX

        //i cas set the cursor image
        scene.setCursor(Cursor.CROSSHAIR);

//        Cursor.OPEN_HAND
//        Cursor.CLOSED_HAND
//        Cursor.CROSSHAIR
//        Cursor.DEFAULT
//        Cursor.HAND
//        Cursor.WAIT
//        Cursor.H_RESIZE
//        Cursor.V_RESIZE
//        Cursor.MOVE
//        Cursor.TEXT

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


        //Displaying the contents of the stage
        primaryStage.show();

    }
    public static void main(String args[]){
        launch(args);
    }
}
