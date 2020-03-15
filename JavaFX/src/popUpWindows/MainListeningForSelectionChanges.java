package popUpWindows;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainListeningForSelectionChanges extends  Application{

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Choice Box");
        Button button = new Button("Click");

        ChoiceBox<String> strChoiceBox = new ChoiceBox<>();
        strChoiceBox.getItems().addAll("Apples", "Bananas", "Lemons", "Strwaberries", "Blueberries");
        strChoiceBox.setValue("Apples"); // Set a default value

        button.setOnAction(evnt -> getChoice(strChoiceBox));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(15,15,15,15));
        layout.getChildren().addAll(strChoiceBox, button);


        Scene scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();
    }

    private void getChoice(ChoiceBox<String> strChoiceBox) {
        String food = strChoiceBox.getValue();
        System.out.println(food);
    }
}


