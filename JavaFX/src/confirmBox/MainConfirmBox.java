package confirmBox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class MainConfirmBox extends Application {

    Stage window;
    Button button;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Program");


        button = new Button("Click me!");
        button.setOnAction(evnt -> {
            boolean result = ConfirmBox.display("ConfirmBox", "Are you sick?");
            if (result)
                System.out.println("Yes");
            else
                System.out.println("No");
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();
    }
}

