package com.example.cvbuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CVApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        System.setProperty("prism.lcdtext", "false");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("home.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 560, 680);
        //String css = this.getClass().getResource("/styles/create.css").toExternalForm();
        //scene.getStylesheets().add(css);
        stage.setTitle("CVBuilder");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
}
