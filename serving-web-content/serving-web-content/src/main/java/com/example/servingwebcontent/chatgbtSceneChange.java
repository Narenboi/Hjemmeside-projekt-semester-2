package com.example.servingwebcontent;

public class chatgbtSceneChange {
}

/*    NR 1
import javafx.application.Application;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.layout.StackPane;
        import javafx.stage.Stage;

public class SceneSwitcher extends Application {

    public void start(Stage primaryStage) {
        // Create scenes
        Scene scene1 = createScene("Scene 1");
        Scene scene2 = createScene("Scene 2");

        // Create a button to switch between scenes
        Button switchButton = new Button("Switch Scene");
        switchButton.setOnAction(e -> primaryStage.setScene(scene2));

        // Add button to the first scene
        StackPane root1 = (StackPane) scene1.getRoot();
        root1.getChildren().add(switchButton);

        // Show the initial scene
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    private Scene createScene(String title) {
        // Create a scene with a single button and a label
        Button backButton = new Button("Back");
        backButton.setOnAction(e -> ((Stage) backButton.getScene().getWindow()).close());
        StackPane root = new StackPane(new Button(title), backButton);
        return new Scene(root, 400, 300);
    }

    public static void main(String[] args) {
        launch(args);
    }
}



NUMMER 2



        import java.util.HashMap;
        import java.util.Map;
        import javafx.application.Application;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.layout.StackPane;
        import javafx.stage.Stage;

public class SceneSwitcher extends Application {

    private Map<String, Scene> scenes = new HashMap<>();

    public void start(Stage primaryStage) {
        // Define scenes
        Scene scene1 = new Scene(new StackPane(new Button("Scene 1")));
        Scene scene2 = new Scene(new StackPane(new Button("Scene 2")));

        // Add scenes to map
        scenes.put("scene1", scene1);
        scenes.put("scene2", scene2);

        // Set initial scene
        primaryStage.setScene(scene1);

        // Switch scenes on button click
        Button switchButton = new Button("Switch Scene");
        switchButton.setOnAction(e -> {
            Scene newScene = scenes.get("scene2");
            primaryStage.setScene(newScene);
        });

        // Add button to scene
        StackPane root = (StackPane) scene1.getRoot();
        root.getChildren().add(switchButton);

        // Show stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

 */