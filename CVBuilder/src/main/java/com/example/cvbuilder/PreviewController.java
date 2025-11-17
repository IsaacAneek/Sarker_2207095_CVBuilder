package com.example.cvbuilder;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
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


    private CreateModel model;

    void initModel(CreateModel model) {
        this.model = model;
        titleName.setText(model.textFieldName);
        labelEmail.setText(model.textFieldDesiredJobPosition);
    }

    @FXML
    public void initialize() {
    }
}
