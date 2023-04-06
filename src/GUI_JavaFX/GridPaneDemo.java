package GUI_JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class GridPaneDemo extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");

        GridPane root = new GridPane();

        root.setHgap(5);
        root.setVgap(5);
        root.add(button1, 0, 0);
        root.add(button2, 0, 1);
        root.add(button3, 1, 0);
        root.add(button4, 1, 1);
        root.add(button5, 2, 3);

        Scene scene = new Scene(root, 200, 200);
        stage.setScene(scene);
        stage.setTitle("GridPane Demo");
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}