package com.example.baseconverter;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class RedirectedPageController {
    @FXML
    private Button goBackButton;

//    @FXML
//    private void goBackToMainPage() {
//        Stage currentStage = (Stage) goBackButton.getScene().getWindow();
//        currentStage.close();
//    }
    @FXML
    private void goBackToMainPage() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BasePageDesign.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Base Converter");
            stage.show();

            // Close the current window
            Stage currentStage = (Stage) goBackButton.getScene().getWindow();
            currentStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
