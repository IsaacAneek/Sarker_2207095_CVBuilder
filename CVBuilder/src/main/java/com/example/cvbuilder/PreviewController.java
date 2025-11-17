package com.example.cvbuilder;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class PreviewController {
    @FXML Label titleName;
    @FXML Label labelEmail;
    @FXML Label labelAddress;
    @FXML Label labelEducation;
    @FXML Label labelEmployer;
    @FXML Label labelGender;
    @FXML Label labelLinkedIn;
    @FXML Label labelNationality;
    @FXML Label labelPhoneNumber;
    @FXML Label labelPosition;
    @FXML Label labelSchool;
    @FXML Label labelSkill1;
    @FXML Label labelSkill2;
    @FXML Label labelSkill3;
    @FXML Label labelWorkCity;

    @FXML ProgressBar barSkill1;
    @FXML ProgressBar barSkill2;
    @FXML ProgressBar barSkill3;

    private CreateModel model;

    void initModel(CreateModel model) {
        this.model = model;
        titleName.setText(model.textFieldName);
        labelEmail.setText(model.textFieldDesiredJobPosition);
        barSkill1.setProgress(model.skillLevel1);
        barSkill2.setProgress(model.skillLevel2);
        barSkill3.setProgress(model.skillLevel3);
    }

    @FXML
    public void initialize() {
    }
}
