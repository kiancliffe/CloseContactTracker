package app;

// Kian Cliffe
// R00179744
// SD2 - B

import GUI.Tab1;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("CovidDB");
        try{
            BorderPane bp = new BorderPane();
            Group g = new Group();
            Scene scene = new Scene(g,1240,700);
            TabPane tp = new TabPane();

            tp.getTabs().add(new Tab1());

            bp.setCenter(tp);
            bp.prefHeightProperty().bind(scene.heightProperty());
            bp.prefWidthProperty().bind(scene.widthProperty());
            g.getChildren().add(bp);
            primaryStage.setScene(scene);primaryStage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
