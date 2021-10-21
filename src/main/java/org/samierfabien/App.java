package org.samierfabien;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println(getClass());
        System.out.println(getClass().getResource("vues/mainVue.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("vues/mainVue.fxml"));


        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("TableView");
        primaryStage.setMinWidth(600);
        primaryStage.setMinHeight(500);
        primaryStage.show();
    }
}
