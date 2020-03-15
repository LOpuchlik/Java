package popUpWindows;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class MainProperClosing extends Application {

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("JavaFX - program");

        window.setOnCloseRequest(evnt -> {
            evnt.consume();
            closeProgram();
        });

        button = new Button("Close button");
        button.setOnAction(evnt -> closeProgram());


        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();
    }

    private void closeProgram() {
        Boolean answer = ProperClosing.display("Pop up saving", "Are you sure you want to close this program?");
        if (answer)
            window.close();
    }
}

