package org.example.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.HashMap;

class Customer {
    private int custid;
    private String name;
    private String address;

    public Customer(int c, String n, String a) {
        custid = c;
        name = n;
        address = a;
    }

    public int getCustid() {
        return custid;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String add) {
        address = add;
    }
}

public class ComboBox_FormApplication extends Application {
    int cnt = 0;

    @Override
    public void start(Stage stage) {
        HashMap<Integer, Customer> hm = new HashMap<>();
        Font f = new Font("Times new roman", 20);
        Label l1 = new Label("Customer ID");
        l1.setFont(f);
        Label l2 = new Label("Name ");
        l2.setFont(f);
        Label l3 = new Label("Address ");
        l3.setFont(f);

        ComboBox<Integer> cust = new ComboBox<>();
        cust.setStyle("-fx-font-size:20");
        TextField name = new TextField();
        name.setFont(f);
        TextField ad = new TextField();
        ad.setFont(f);
        name.setPrefColumnCount(15);
        ad.setPrefColumnCount(20);

        Button save = new Button("Save");
        save.setFont(f);
        Button create = new Button("Create");
        create.setFont(f);

        create.setOnAction(e -> {
            ++cnt;
            cust.getItems().add(cnt);
            cust.setValue(cnt);
            name.setText("");
            ad.setText("");
        });

        save.setOnAction(e -> {
            Customer c = new Customer(cnt, name.getText(), ad.getText());
            hm.put(cnt, c);
            try (PrintStream ps = new PrintStream(new FileOutputStream("Customer1.txt"))) {
                for (Customer ct : hm.values()) {
                    ps.println(ct.getCustid());
                    ps.println(ct.getName());
                    ps.println(ct.getAddress());
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        });



        HBox hb1 = new HBox();
        hb1.setAlignment(Pos.CENTER);
        hb1.setPadding(new Insets(10, 10, 10, 10));
        HBox hb2 = new HBox();
        hb2.setAlignment(Pos.CENTER);
        hb2.setPadding(new Insets(10, 10, 10, 10));
        HBox hb3 = new HBox();
        hb3.setAlignment(Pos.CENTER);
        hb3.setPadding(new Insets(10, 10, 10, 10));
        HBox hb4 = new HBox();
        hb4.setAlignment(Pos.CENTER);
        hb4.setPadding(new Insets(10, 10, 10, 10));
        hb1.getChildren().addAll(l1, cust);
        hb2.getChildren().addAll(l2, name);
        hb3.getChildren().addAll(l3, ad);
        hb4.getChildren().addAll(create, save);
        VBox vb = new VBox();
        vb.setAlignment(Pos.CENTER);
        hb1.setPadding(new Insets(10, 10, 10, 10));
        vb.getChildren().addAll(hb1, hb2, hb3, hb4);

        Scene sc = new Scene(vb, 500, 500);
        stage.setScene(sc);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
