package com.example.demo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;
import java.util.Scanner;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class Controller extends Main {
    @FXML
    private Button startButton;
    @FXML
    private AnchorPane scenePane;
    @FXML
    private RadioButton redbutton,greenbutton,bluebutton;
    @FXML
    private TextField userid;

    @FXML
    private ChoiceBox choice;

    Main obj = new Main();
    writefile obj2 = new writefile();

    public void logout(ActionEvent event) throws IOException {

        Account obj1 = new Account(userid.getText());
        obj2.writeusername(obj1.getUserName());
        System.out.printf("%s", obj1.getUserName());
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        obj.star2048(window);

    }

    public void redset(ActionEvent event) throws IOException {
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        obj.setred(window, 1);

    }

    public void blueset(ActionEvent event) throws IOException {
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        obj.setred(window, 2);

    }

    public void greenset(ActionEvent event) throws IOException {
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        obj.setred(window, 3);

    }


}
