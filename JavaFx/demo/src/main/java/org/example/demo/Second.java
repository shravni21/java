package org.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Second extends Application {
    @Override
    public void start(Stage stage) {
        Button b = new Button("Click Me"); //child
        FlowPane fp = new FlowPane(); //Parent
        fp.getChildren().add(b);
        Scene sc = new Scene(fp); //scene

        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }


}
