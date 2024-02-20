package org.example.demo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.transform.Scale;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

import java.util.*;
import java.io.*;

public class TextArea_and_Slider extends Application {
    @Override
    public void start(Stage stage) {

        TextArea ta = new TextArea();
        ta.setPrefColumnCount(100);
        ta.setPrefRowCount(20);

        Slider sl = new Slider(10, 50, 10); // font size, min,max
        sl.setMajorTickUnit(5);
        sl.showTickLabelsProperty();
        sl.setShowTickMarks(true);
        sl.valueProperty().addListener(e -> ta.setFont(Font.font(sl.getValue())));

        //DatePicker
        DatePicker dp = new DatePicker();
        dp.setShowWeekNumbers(true);
        dp.setOnAction(e ->{
            String currentDate= "Date: "+ dp.getValue()+"\n";
            String text= ta.getText();
            int idx= text.indexOf("Date:");
            if(idx!=-1){
                int end= text.indexOf("\n",idx);
                ta.deleteText(idx, end==-1?text.length():end);
            }
            ta.insertText(0,currentDate);
        });

        //Color picker
        ColorPicker cp = new ColorPicker();
        cp.setOnAction(e -> {

            Color color = cp.getValue();
            String hex = String.format("#%02x%02x%02x",
                    (int) (color.getRed() * 255),
                    (int) (color.getGreen() * 255),
                    (int) (color.getBlue() * 255));
            ta.setStyle("-fx-text-fill: " + hex + ";");
            ta.setText(cp.getValue()+"\n"+ta.getText());
        });

        //FILE BUTTON
        Button b = new Button("Open File");
        b.setOnAction(e -> {
            FileChooser fc = new FileChooser();
            File file = fc.showOpenDialog(stage);

            try (Scanner sc = new Scanner(new FileInputStream(file))) {
                String str = "";
                while (sc.hasNext()) {
                    str = str + sc.nextLine() + "\n";
                }
                ta.setText(str);
            } catch (Exception ec) {
                ta.setText("Select valid File!");
            }
        });

        VBox vb = new VBox();
        vb.setAlignment(Pos.TOP_CENTER);
        vb.getChildren().addAll(ta, sl, dp, cp, b);

        Scene sc = new Scene(vb, 500, 500);
        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }


}
