module javafxsample12 {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.web;

    opens com.example;
    opens com.example.controller;
    opens com.example.view;
}