package org.example.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextBox_radiobutton_Hbox_Vbox_Layout extends Application implements EventHandler<ActionEvent> {
    Text t;
    RadioButton r1, r2, r3,r4,r5;
    CheckBox c1, c2, c3;
    ChoiceBox<Integer> cb;

    @Override
    public void handle(ActionEvent actionEvent) {
        FontWeight fw = FontWeight.NORMAL;
        FontPosture fp = FontPosture.REGULAR;
        if (r1.isSelected()) t.setFill(Paint.valueOf("Red"));
        if (r2.isSelected()) t.setFill(Paint.valueOf("Green"));
        if (r3.isSelected()) t.setFill(Paint.valueOf("Blue"));
        if (r4.isSelected()) t.setFill(Paint.valueOf("Magenta"));
        if (r5.isSelected()) t.setFill(Paint.valueOf("Orange"));

        if (c2.isSelected()) fw = FontWeight.BOLD;
        if (c3.isSelected()) fp = FontPosture.ITALIC;

        Font font = Font.font("Times New Roman", fw, fp, cb.getValue());
        t.setFont(font);
    }

    @Override
    public void start(Stage stage) {
        t = new Text("Hello User!");
        HBox hb1 = new HBox();
        hb1.getChildren().addAll(t);

        r1 = new RadioButton("Red");
        r2 = new RadioButton("green");
        r3 = new RadioButton("blue");
        r4 = new RadioButton("Magenta");
        r5 = new RadioButton("orange");

        ToggleGroup tg = new ToggleGroup();

        r1.setToggleGroup(tg);
        r2.setToggleGroup(tg);
        r3.setToggleGroup(tg);
        r4.setToggleGroup(tg);
        r5.setToggleGroup(tg);

        HBox hb2 = new HBox();
        hb2.getChildren().addAll(r1, r2, r3,r4,r5);
        hb2.setSpacing(15);
        hb2.setPadding(new Insets(10, 10, 10, 10));

        c1 = new CheckBox("Normal");
        c2 = new CheckBox("Bold");
        c3 = new CheckBox("Italics");

        HBox hb3 = new HBox();
        hb3.getChildren().addAll(c1, c2, c3);
        hb3.setSpacing(15);
        hb3.setPadding(new Insets(10, 10, 10, 10));

        cb = new ChoiceBox<>();
        cb.getItems().addAll(10, 20, 30, 50);

        VBox vb = new VBox();
        vb.getChildren().addAll(hb1, hb2, hb3, cb);

        r1.setOnAction(this);
        r2.setOnAction(this);
        r3.setOnAction(this);
        r4.setOnAction(this);
        r5.setOnAction(this);
        c1.setOnAction(this);
        c2.setOnAction(this);
        c3.setOnAction(this);
        cb.setOnAction(this);

        Scene sc = new Scene(vb, 500, 500);
        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }


}
