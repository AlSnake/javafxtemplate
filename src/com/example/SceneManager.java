package com.example;

import com.example.controller.BaseController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.HashMap;
import java.util.Map;

public class SceneManager {
    private final Stage root;
    private final Map<String, Scene> scenes = new HashMap<>();

    public SceneManager(Stage root) {
        if(root == null)
            throw new IllegalArgumentException();
        this.root = root;
    }

    public void switchScene(String url) {
        Scene scene = scenes.computeIfAbsent(url, u -> {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(u));
            try {
                Parent parent = loader.load();
                BaseController controller = loader.getController();
                controller.setSceneManager(this);
                return new Scene(parent);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        root.setScene(scene);
    }
}
