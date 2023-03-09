package com.blueoceanhotel.pos.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

import static com.sun.deploy.uitoolkit.ToolkitStore.dispose;

public class AdminFormController {
    public AnchorPane adminFormContext;

    public void exitOnAction(ActionEvent actionEvent) throws Exception {

            exitOnAction();



    }

    private void exitOnAction() {
        System.exit(0);
    }



    private void setUi(String ui) throws IOException {
        Stage stage=(Stage) adminFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+ui+".fxml"))));
        stage.centerOnScreen();
    }

    public void adminOnAction(ActionEvent actionEvent) throws IOException {
        setUi("loginForm");
    }

    public void receptionistOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ReceptionistForm");
    }
}
