package com.example.cvbuilder;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PreviewController {
    @FXML Label titleName;
    @FXML Label labelEmail;
    private CreateModel model;

    void initModel(CreateModel model) {
        this.model = model;
        titleName.setText(model.name);
        labelEmail.setText(model.desiredJobPosition);
    }

    @FXML
    public void initialize() {
    }
}
