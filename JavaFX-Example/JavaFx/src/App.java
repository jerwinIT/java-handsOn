import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
    TextField num1 = new TextField();

    TextField num2 = new TextField();
    Button addButton = new Button("Add");
    addButton.getStyleClass().add("my-button"); // CSS class
    Label resultLabel = new Label("Result will appear here");
    resultLabel.getStyleClass().add("result-label");
    addButton.setOnAction(e -> {
    try {
    int a = Integer.parseInt(num1.getText());
    int b = Integer.parseInt(num2.getText());
    int sum = a + b;
    resultLabel.setText("Sum: " + sum);
    } catch (NumberFormatException ex) {
    resultLabel.setText("Please enter valid integers");
    }
    });
    VBox root = new VBox(10, num1, num2, addButton, resultLabel);
    root.setPadding(new Insets(20));
    Scene scene = new Scene(root, 300, 200);
    scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
    primaryStage.setTitle("Add Two Numbers with JavaFX and CSS");
    primaryStage.setScene(scene);
    primaryStage.show();
    }
    
    public static void main(String[] args) {
    launch(args);
    }
}