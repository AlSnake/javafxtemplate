package com.example.controller;

import com.example.StageManager;
import javafx.fxml.FXML;

public class OptionsWindowController extends BaseController {
    @FXML
    void cancelBtn() {
        StageManager.closeStage(OptionsWindowController.class);
    }

    @FXML
    void saveBtn() {
    }
}
