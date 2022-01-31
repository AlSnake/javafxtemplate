package com.example;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        SceneManager sceneManager = new SceneManager(stage);
        sceneManager.switchScene("view/MainWindow.fxml");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
