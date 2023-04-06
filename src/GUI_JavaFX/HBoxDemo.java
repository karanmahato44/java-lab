package GUI_JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HBoxDemo extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");

        HBox root = new HBox(10);

        root.getChildren().add(button1);
        root.getChildren().add(button2);
        root.getChildren().add(button3);
        root.getChildren().add(button4);
        root.getChildren().add(button5);

        Scene scene = new Scene(root, 400, 400);
        stage.setScene(scene);
        stage.setTitle("HBox Demo");
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}