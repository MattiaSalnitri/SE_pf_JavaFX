package it.polimi.deib.MattiaSalnitri.JavaFX05_events;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;

public class Events_01_intro extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(new URL("file:./resources/FXML/01_intro.fxml"));//relative path
        VBox vbox = loader.<VBox>load();

        //associate event handlers
        ((Label)vbox.getChildren().get(0)).setOnMouseClicked(value ->  {
           System.out.println("clicked");
        });

        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
