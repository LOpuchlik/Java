import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainComboBox extends Application {

    Stage window;
    Scene scene;
    Button button;
    ComboBox<String> comboBox;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("ComboBox");
        button = new Button("Submit");

        comboBox = new ComboBox<>();
        comboBox.getItems().addAll(
                "La casa de papel",
                            "Sex education",
                             "Orange is the new black"
        );
        comboBox.setPromptText("What is your favourite series?");


        comboBox.setEditable(true);  // user can submit not only the options given in the choice but also type own option (series)

        // same action on clicking the button and selecting something from combobox
        button.setOnAction(evnt -> printMovie());
        comboBox.setOnAction(evnt -> System.out.println("User selected: " + comboBox.getValue()));


        VBox layout = new VBox(10);
        layout.setPadding(new Insets(15,15,15,15));
        layout.getChildren().addAll(comboBox, button);

        scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();


    }

    private void printMovie() {
        System.out.println(comboBox.getValue());

    }
}
