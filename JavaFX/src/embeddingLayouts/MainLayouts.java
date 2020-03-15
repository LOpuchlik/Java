package embeddingLayouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MainLayouts extends Application {

    Stage window;
    Button button;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Program");


        HBox topMenu = new HBox();
        Button b1 = new Button("File");
        Button b2 = new Button("Edit");
        Button b3 = new Button("View");
        topMenu.getChildren().addAll(b1, b2, b3);


        VBox leftMenu = new VBox();
        Button but1 = new Button("1");
        Button but2 = new Button("2");
        Button but3 = new Button("3");
        leftMenu.getChildren().addAll(but1, but2, but3);

        BorderPane mainLayout = new BorderPane();
        mainLayout.setTop(topMenu);
        mainLayout.setLeft(leftMenu);


        Scene scene = new Scene(mainLayout, 300, 200);
        window.setScene(scene);
        window.show();
    }
}

