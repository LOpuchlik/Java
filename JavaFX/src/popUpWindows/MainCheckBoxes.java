package popUpWindows;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainCheckBoxes extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Grocery store");


        // Checkboxes
        CheckBox box1 = new CheckBox("Chocolate");
        box1.setSelected(true); // this one is checked by default, it can be changed later
        CheckBox box2 = new CheckBox("Whipped cream");
        CheckBox box3 = new CheckBox("Strawberry");
        CheckBox box4 = new CheckBox("Pinapple");

        // Button
        Button button = new Button("Order now");
        button.setOnAction(evnt -> handleOptions(box1, box2, box3, box4));


        VBox layout = new VBox(10);
        layout.setPadding(new Insets(15,15,15,15));
        layout.getChildren().addAll(box1, box2, box3, box4, button);


        Scene scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();
    }

    private void handleOptions(CheckBox box1, CheckBox box2, CheckBox box3, CheckBox box4) {
        String message = "The order is:\n";
        if (box1.isSelected())
            message += "chocolate\n";
        if (box2.isSelected())
            message += "whipped cream\n";
        if (box3.isSelected())
            message += "strawberry\n";
        if (box4.isSelected())
            message += "pineapple\n";
        System.out.println(message);

    }
}