package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class ClassmateController {

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Justin just = new Justin(); 
    Josh josh = new Josh();
    Sim sim = new Sim();
    Lu lu = new Lu();
    Lance lance = new Lance();
    

    public void initialize() {

        just.setName("Justin");
        just.setGender("Male");

        josh.setName("Timmothy");
        josh.setGender("Male");

        sim.setName("Simmone");
        sim.setGender("Male");

        lu.setName("Christine");
        lu.setGender("Female");

        lance.setName("Lance ");
        lance.setGender("Male");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Hi I am " + josh.getName() + " and my gender is " + josh.getGender());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Hi I am " + sim.getName() + " and my gender is " + sim.getGender());
        }

        if (sourceButton == btn3) {
            //alert.setContentText("Hi I am " + lu.getName() + " and my gender is " + lu.getGender());
        }

        if (sourceButton == btn4) {
            alert.setContentText("Hi I am " + lance.getName() + " and my gender is " + lance.getGender());
        }

        if (sourceButton == btn5) {
            alert.setContentText("Hi I am " + just.getName() + " and my gender is " + just.getGender());
        }

        alert.showAndWait();

    }
}