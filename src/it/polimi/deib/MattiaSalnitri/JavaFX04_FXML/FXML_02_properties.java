package it.polimi.deib.MattiaSalnitri.JavaFX04_FXML;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;

public class FXML_02_properties extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(new URL("file:./resources/FXML/01_intro.fxml"));//relative path
        VBox vbox = loader.<VBox>load();

        //i can extract info from the element created with FXML
        String value = ((Label)vbox.getChildren().get(0)).getText();

        System.out.println(value);

        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
