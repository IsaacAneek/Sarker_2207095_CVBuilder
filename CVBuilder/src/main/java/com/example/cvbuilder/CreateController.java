package com.example.cvbuilder;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class CreateController {
    @FXML private TextField textFieldName;
    @FXML private TextField textFieldFamilyName;
    @FXML private TextField textFieldDesiredJobPosition;

    private CreateModel model;

    @FXML
    void initialize() {
    }

    @FXML
    void onGenerateCVClicked(ActionEvent event) throws IOException {

        System.out.println("Generate button clicked");
        model = new CreateModel();
        model.name = textFieldName.getText();
        model.desiredJobPosition = textFieldDesiredJobPosition.getText();
        model.familyName = textFieldFamilyName.getText();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("preview.fxml"));
        Parent root = fxmlLoader.load();

        PreviewController previewController = (PreviewController) fxmlLoader.getController();
        previewController.initModel(model);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 560, 680));

    }
}
