package com.example.controller;

import com.example.StageManager;
import javafx.fxml.FXML;

public class MainWindowController extends BaseController {
    @FXML
    void loginBtn() {
        sceneManager.switchScene("view/LoginWindow.fxml");
    }

    @FXML
    void optionsBtn() {
        StageManager.createStage(OptionsWindowController.class, "view/OptionsWindow.fxml");
    }
}
