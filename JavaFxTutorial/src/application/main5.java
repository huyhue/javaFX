package application;

import javafx.application.Application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.Stage;

public class main5 extends Application {

	@Override
	public void start(Stage primaryStage) {
		 Label label = new Label("Programming Language");
		 
	        CheckBox box1 = new CheckBox("Java");
	        CheckBox box2 = new CheckBox("C#");
	        CheckBox box3 = new CheckBox("Python");
	        
	        box1.setSelected(true);  //chay chuong trinh box 1 duoc chon
	        
	        Button button = new Button("Submit");  //tao su kien
	        button.setOnAction(e -> {
	            String message = "Your language: ";
	            if (box1.isSelected())
	                message += box1.getText();
	            if (box2.isSelected())
	                message += box2.getText();
	            if (box3.isSelected())
	                message += box3.getText();
	            System.out.println(message);
	        });
	        HBox layoutH = new HBox(10);   //khoang cach bang 10, HBox ngang
	        layoutH.getChildren().addAll(box1, box2, box3);
	        
	        VBox layoutV = new VBox(10);   //Vbox doc
	        layoutV.getChildren().addAll(label, layoutH, button);
	        Scene scene = new Scene(layoutV, 300, 200);
	        primaryStage.setScene(scene);
	        primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
