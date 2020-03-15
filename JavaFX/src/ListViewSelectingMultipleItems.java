import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListViewSelectingMultipleItems extends Application {
    Stage window;
    Scene scene;
    Button button;
    ListView<String> listView;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("ListView");
        button = new Button("Submit");



        VBox layout = new VBox(10);
        layout.setPadding(new Insets(15,15,15,15));
        layout.getChildren().addAll(listView, button);

        scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();


    }

}

