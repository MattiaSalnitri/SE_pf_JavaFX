package it.polimi.deib.MattiaSalnitri.JavaFX02_stage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Stage_02_modality extends Application {
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

        //set another stage
        Stage stage = new Stage();
        //optional, to set owner
        stage.initOwner(primaryStage);

        //stage.initModality(Modality.APPLICATION_MODAL);//block all other stage
        stage.initModality(Modality.WINDOW_MODAL);//block stage that "owns" this stage
        //stage.initModality(Modality.NONE);//no block



        //Displaying the contents of the stage
        primaryStage.show();
        //continues when the stage is closed
        stage.showAndWait();

        System.out.println("hello");
    }
    public static void main(String args[]){
        launch(args);
    }
}
