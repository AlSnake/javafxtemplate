package com.example.controller;

import com.example.SceneManager;

public abstract class BaseController {
    protected SceneManager sceneManager;

    public void setSceneManager(SceneManager sceneManager) { this.sceneManager = sceneManager; }
}
