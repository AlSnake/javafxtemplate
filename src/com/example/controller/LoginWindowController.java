package com.example.controller;

import javafx.fxml.FXML;

public class LoginWindowController extends BaseController{
    @FXML
    void homeBtn() {
        sceneManager.switchScene("view/MainWindow.fxml");
    }
}
