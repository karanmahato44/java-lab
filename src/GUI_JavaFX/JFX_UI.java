package GUI_JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class JFX_UI extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        MenuBar menuBar = new MenuBar();

        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu helpMenu = new Menu("Help");

        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");
        MenuItem exitItem = new MenuItem("Exit");

        fileMenu.getItems().addAll(openItem, saveItem, exitItem);

        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);

        Label label = new Label("Enter your name: ");
        TextField textField = new TextField();
        Tooltip tooltip = new Tooltip("Please enter you full name");


        Label chooseLang = new Label("Choose one lang (pro tip: don't choose java)");
        ToggleGroup toggleGroup = new ToggleGroup();

        RadioButton javaRadio = new RadioButton("Java");
        javaRadio.setToggleGroup(toggleGroup);

        RadioButton jsRadio = new RadioButton("JavaScript");
        jsRadio.setToggleGroup(toggleGroup);

        Button button = new Button("Submit");
        textField.setTooltip(tooltip);


        VBox root = new VBox();

        root.getChildren().add(menuBar);
        root.getChildren().add(label);
        root.getChildren().add(textField);
        root.getChildren().add(chooseLang);
        root.getChildren().add(javaRadio);
        root.getChildren().add(jsRadio);
        root.getChildren().add(button);


        Scene scene = new Scene(root, 250, 250);
        stage.setScene(scene);
        stage.setTitle("JFX_UI");
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}