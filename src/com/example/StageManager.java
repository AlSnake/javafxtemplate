package com.example;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

public class StageManager {
    private static final Map<Class, Stage> stages = new HashMap<>();

    public static void createStage(Class c, String url) {
        Stage open = stages.get(c);
        if(open != null)
            open.requestFocus();

        stages.computeIfAbsent(c, v -> {
            FXMLLoader loader = new FXMLLoader(StageManager.class.getResource(url));
            try {
                Parent parent = loader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(parent));
                stage.show();
                return stage;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

    public static void closeStage(Class c) {
        Stage stage = stages.get(c);
        if(stage != null) {
            stage.close();
            stages.remove(c);
        }
    }

    public static void closeAll() {
        for(Stage stage: stages.values())
            stage.close();
        stages.clear();
    }
}
