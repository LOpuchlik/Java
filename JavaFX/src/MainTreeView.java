
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainTreeView extends Application {
    Stage window;
    Scene scene;
    TreeView<String> tree;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("TreeView");


        TreeItem<String> root, jagoda, michal;

        // root
        root = new TreeItem<>();  // container for all the branches
        root.setExpanded(true); // all subtrees and subflies are visible

        // Jagoda branch
        jagoda = makeBranch("Jagoda", root);
        makeBranch("javaFX", jagoda);
        makeBranch("movies", jagoda);


        // Michal branch
        michal = makeBranch("Michal", root);
        makeBranch("history", michal);
        makeBranch("kettlebell", michal);

        // Create tree
        tree = new TreeView<>(root);
        tree.setShowRoot(false);


        StackPane layout = new StackPane();
        layout.getChildren().add(tree);
        scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();


    }
    // Create branches
    private TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }
}

