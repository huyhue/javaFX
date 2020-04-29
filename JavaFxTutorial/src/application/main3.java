package application;

import java.util.Optional;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class main3 extends Application {

	Button button;
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Alert Example");
		button = new Button();
		button.setText("Close");
		button.setOnAction((event) -> {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmation");
            alert.setHeaderText("Alert Information");
            alert.setContentText("choose your option");
            
            ButtonType buttonTypeYes = new ButtonType("Yes",ButtonBar.ButtonData.YES);
            ButtonType buttonTypeNo = new ButtonType("No", ButtonBar.ButtonData.NO);
            ButtonType buttonTypeCancel = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);
            
            alert.getButtonTypes().setAll(buttonTypeYes, buttonTypeNo, buttonTypeCancel);
            
            Optional<ButtonType> result = alert.showAndWait();
            
            if(result.get() == buttonTypeYes) {
            	System.out.println("Code for yes");
            }else if(result.get().getButtonData() == ButtonBar.ButtonData.NO) {
            	System.out.println("Code for no");
            }else {
            	System.out.println("Code for cancel");
            }
            String message = result.get().getText();
            Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
            alert1.setTitle("Information");
            alert1.setHeaderText("Notification");
            alert1.setContentText(message);
            alert1.show();
        });
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();	
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
