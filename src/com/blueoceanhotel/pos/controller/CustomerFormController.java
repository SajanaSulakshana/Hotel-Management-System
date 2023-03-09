package com.blueoceanhotel.pos.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerFormController {
    public AnchorPane loginboardContext;

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AdminForm");
    }
    private void setUi(String ui) throws IOException {
        Stage stage=(Stage) loginboardContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+ui+".fxml"))));
        stage.centerOnScreen();
    }

}
