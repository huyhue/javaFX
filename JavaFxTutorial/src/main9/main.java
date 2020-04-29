package main9;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Stage;

public class main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try{
            Parent root = FXMLLoader.load(this.getClass().getResource("sample.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
	}

	public static void main(String[] args) {
		launch(args);
	}
}
