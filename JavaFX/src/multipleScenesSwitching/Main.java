package multipleScenesSwitching;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        Label label1 = new Label("This is the first scene");
        Button btn = new Button("Go to scene 2");
        btn.setOnAction(evnt -> window.setScene(scene2));

        // Layout 1
        VBox vBoxLayout = new VBox(20); // all the objects are on top of each other
        vBoxLayout.getChildren().addAll(label1, btn);
        scene1 = new Scene(vBoxLayout, 200, 200);

        //---------------------------------------------------------------------

        Button btn2 = new Button("Go back to scene 1");
        btn2.setOnAction(evnt -> window.setScene(scene1));

        //Layout 2
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(btn2);
        scene2 = new Scene(stackPane, 400, 400);

        //---------------------------------------------------------------------

        window.setScene(scene1);
        window.setTitle("Program");
        window.show();


    }
}
