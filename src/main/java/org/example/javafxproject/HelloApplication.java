package org.example.javafxproject;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);

        stage.setScene(scene);

        stage.setTitle("Stage Demo Nahum");

        stage.setWidth(420);
        stage.setHeight(420);

        stage.setResizable(false);

        stage.setX(50);
        stage.setY(50);

        Image icon = new Image("file:icon.png");
        stage.getIcons().add(icon);

        stage.setFullScreen(true);
        stage.setFullScreenExitHint("You can't escape unless you press q");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        stage.show();
    }
}