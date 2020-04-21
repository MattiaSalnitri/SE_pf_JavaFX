package it.polimi.deib.MattiaSalnitri.JavaFX01_intro;

import javafx.application.Application;
import javafx.stage.Stage;

public class Intro_01 extends Application {
    @Override
    public void start(Stage primaryStage)
    {

        //Setting title to the Stage
        primaryStage.setTitle("Sample Application");

        //Displaying the contents of the stage
        primaryStage.show();
    }

    public static void main(String args[]){
        Intro_01.launch();

        //args: set of string parameters
        //launch(args); //alternative call

    }
}
