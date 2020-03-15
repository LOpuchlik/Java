package popUpWindows;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javax.swing.*;

public class ConfirmBox {

    static boolean answer;

    public static boolean display(String title, String message ){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL); // the window stays on top, does not disappear
        window.setTitle(title);
        window.setMinWidth(200);
        Label label = new Label();
        label.setText(message);


        Button buttonYes = new Button("Yes");
        buttonYes.setOnAction(evnt -> {
            answer = true;
            window.close();
        });


        Button buttonNo = new Button("No");
        buttonNo.setOnAction(evnt -> {
            answer = false;
            window.close();
        });


        HBox layout = new HBox(10);
        layout.getChildren().addAll(label, buttonYes, buttonNo);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();


        return answer;

    }
}
