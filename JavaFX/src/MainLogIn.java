import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class MainLogIn extends Application {

    Stage window;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Program");


        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(15,15,15,15));
        gridPane.setVgap(10);
        gridPane.setHgap(15);

        // Name label
        Label nameLabel = new Label("Username:");
        GridPane.setConstraints(nameLabel, 0, 0);

        // Name field
        TextField name = new TextField();
        name.setPromptText("username");
        GridPane.setConstraints(name, 1, 0);

        // Password label
        Label passLabel = new Label("Password:");
        GridPane.setConstraints(passLabel, 0, 1);

        // Password field
        TextField pass = new TextField();
        pass.setPromptText("password");
        GridPane.setConstraints(pass, 1, 1);

        // Log in button
        Button logIn = new Button("Log In");
        GridPane.setConstraints(logIn, 1, 2);

        gridPane.getChildren().addAll(nameLabel, name, passLabel, pass, logIn);
        Scene scene = new Scene(gridPane, 300, 200);
        window.setScene(scene);
        window.show();
    }
}

