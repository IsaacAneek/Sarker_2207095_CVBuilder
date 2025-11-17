package com.example.cvbuilder;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PreviewController {
    @FXML Label titleName;
    @FXML Label labelEmail;


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
