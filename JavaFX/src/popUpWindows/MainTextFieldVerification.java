package popUpWindows;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainTextFieldVerification extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Program");

        TextField nameInput = new TextField();
        Button button = new Button("Submit");
        button.setOnAction(envt -> isInt(nameInput, nameInput.getText()));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(15,15,15,15));
        layout.getChildren().addAll(nameInput, button);


        Scene scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();
    }

    private boolean isInt(TextField input, String message) {
        try{
            int age = Integer.parseInt(input.getText());
            System.out.println("User is: " + age + " years old.");
            return true;
        } catch(NumberFormatException e) {
            System.err.println("Error: " + message + " is not a number.");
            return false;

        }

    }

}
