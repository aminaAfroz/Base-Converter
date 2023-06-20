package com.example.baseconverter;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class NumberBaseConverterController {
    @FXML
    private TextField inputField;

    @FXML
    private Label convertedLabel;

    @FXML
    private void convertToHex() {
        try {
            int decimalNumber = Integer.parseInt(inputField.getText());
            String hexString = Integer.toHexString(decimalNumber);
            convertedLabel.setText(hexString);
        } catch (NumberFormatException e) {
            convertedLabel.setText("Not a Number");
        }
    }

    @FXML
    private void convertToBinary() {
        try {
            int decimalNumber = Integer.parseInt(inputField.getText());
            String binaryString = Integer.toBinaryString(decimalNumber);
            convertedLabel.setText(binaryString);
        } catch (NumberFormatException e) {
            convertedLabel.setText("Not a Number");
        }
    }

    @FXML
    private void convertToOctal() {
        try {
            int decimalNumber = Integer.parseInt(inputField.getText());
            String octalString = Integer.toOctalString(decimalNumber);
            convertedLabel.setText(octalString);
        } catch (NumberFormatException e) {
            convertedLabel.setText("Not a Number");
        }
    }

    @FXML
    private void clear() {
        inputField.clear();
        convertedLabel.setText("No Input");
    }

    @FXML
    private void exitApplication() {
        Platform.exit();
    }

    @FXML
    private void goToAnotherPage() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("RedirectedPageDesign.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Another Page");
            stage.show();

            // Close the current window
            Stage currentStage = (Stage) convertedLabel.getScene().getWindow();
            currentStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
