package org.example.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Event_handeling extends Application {
    Button b;
    int cnt = 0;


    @Override
    public void start(Stage stage) {
        b = new Button("Click!");

        // ---------------------- Lambda expression ----------------------------------
//        b.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                cnt++;
//                b.setText("" + cnt);
//
//            }
//        });

        // ---------------- Annonymous inner class -------------------------
        b.setOnAction(e->{cnt++; b.setText(""+cnt);});

        b.setPrefSize(100, 30);

        FlowPane f1 = new FlowPane(b);
        Scene sc = new Scene(f1, 400, 400);
        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }


}
