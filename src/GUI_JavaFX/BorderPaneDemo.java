package GUI_JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class BorderPaneDemo extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");

        BorderPane root = new BorderPane();

        root.setTop(button1);
        root.setBottom(button2);
        root.setLeft(button3);
        root.setRight(button4);
        root.setCenter(button5);

        Scene scene = new Scene(root, 200, 200);
        stage.setScene(scene);
        stage.setTitle("BorderPane Demo");
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}