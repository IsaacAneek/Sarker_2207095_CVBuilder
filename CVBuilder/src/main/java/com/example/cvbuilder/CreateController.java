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
    @FXML TextField textFieldName;
    @FXML TextField textFieldFamilyName;
    @FXML TextField textFieldDesiredJobPosition;
    @FXML TextField textFieldAddress;
    @FXML TextField textFieldCity;
    @FXML TextField textFieldEducation;
    @FXML TextField textFieldEmailAddress;
    @FXML TextField textFieldEmployer;
    @FXML TextField textFieldGender;
    @FXML TextField textFieldLinkedIn;
    @FXML TextField textFieldNationality;
    @FXML TextField textFieldPhoneNumber;
    @FXML TextField textFieldPosition;
    @FXML TextField textFieldSchool;
    @FXML TextField textFieldSkill1;
    @FXML TextField textFieldSkill2;
    @FXML TextField textFieldSkill3;
    @FXML TextField textFieldWorkCity;

    private CreateModel model;

    @FXML
    void initialize() {
    }

    @FXML
    void onGenerateCVClicked(ActionEvent event) throws IOException {

        System.out.println("Generate button clicked");
        model = new CreateModel();
        model.textFieldName = textFieldName.getText();
        model.textFieldDesiredJobPosition = textFieldDesiredJobPosition.getText();
        model.textFieldFamilyName = textFieldFamilyName.getText();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("preview.fxml"));
        Parent root = fxmlLoader.load();

        PreviewController previewController = (PreviewController) fxmlLoader.getController();
        previewController.initModel(model);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 560, 680));

    }
}
