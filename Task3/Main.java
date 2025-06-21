import Person.BankAccount;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {
    private BankAccount account = new BankAccount("123456789", "MarkBunyi", 1500.0);
    @Override
    public void start(Stage primaryStage) {
        Label infoLabel = new Label(account.displayAccountInfo());
        infoLabel.getStyleClass().add("label-title");
        TextField depositField = new TextField();
        depositField.setPromptText("Enter deposit amount");
        depositField.getStyleClass().add("text-field");
        TextField withdrawField = new TextField();
        withdrawField.setPromptText("Enter withdrawal amount");
        withdrawField.getStyleClass().add("text-field");
        Button depositButton = new Button("Deposit");
        depositButton.getStyleClass().add("button");
        Button withdrawButton = new Button("Withdraw"); 


        withdrawButton.getStyleClass().add("button");
        depositButton.setOnAction(e -> {
            try {
                double amount =
                Double.parseDouble(depositField.getText());
                account.deposit(amount);
                infoLabel.setText(account.displayAccountInfo());
                depositField.clear();
            } catch (NumberFormatException ex) {
                infoLabel.setText("Invalid deposit amount.");
            }
        });
        withdrawButton.setOnAction(e -> {
            try {
                double amount =
                Double.parseDouble(withdrawField.getText());
                account.withdraw(amount);
                infoLabel.setText(account.displayAccountInfo());
                withdrawField.clear();
            } catch (NumberFormatException ex) {
                infoLabel.setText("Invalid withdrawal amount.");
            }
        });
        VBox layout = new VBox(10, infoLabel, depositField,
        depositButton, withdrawField, withdrawButton);

        layout.setStyle("-fx-padding: 20; -fx-alignment: center; -fx-background-color: #ecf0f1;");

        Scene scene = new Scene(layout, 400, 350);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        primaryStage.setTitle("Bank Account Manager");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
         // Create a BankAccount object
        //  BankAccount account = new BankAccount("123456789", "Mark Bunyi", 3500.00);
        //  account.displayAccountInfo();
        //  account.deposit(500.0);
        //  account.withdraw(200.0);
        //  account.displayAccountInfo();    
    }
    
}
