package com.blueoceanhotel.pos.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.net.URL;

public class MainFormController {


    public AnchorPane mainFoamContext;

    public void nextPageOnAction(ActionEvent actionEvent) throws IOException {
       setUi("AdminForm");

    }
    private void setUi(String ui) throws IOException {
        Stage stage=(Stage) mainFoamContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+ui+".fxml"))));
        stage.centerOnScreen();

    }
}
