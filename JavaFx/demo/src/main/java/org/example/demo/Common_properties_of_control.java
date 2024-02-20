package org.example.demo;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Common_properties_of_control extends Application {
    public void start(Stage stage) {

        Button b = new Button("Click _ME");
        b.setTextFill(Color.MAROON);
        b.setMnemonicParsing(true);
        Tooltip tp = new Tooltip("It is a button");
        b.setTooltip(tp);
        b.setStyle("-fx-border-color:green");

        Alert a = new Alert(Alert.AlertType.INFORMATION, "Button is Clicked!");
        b.setOnAction(e -> a.show());

        FlowPane fp = new FlowPane(b);
        Scene sc = new Scene(fp, 400, 400);
        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }


}
