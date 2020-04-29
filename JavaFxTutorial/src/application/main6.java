package application;

import javafx.stage.Stage;

public class main6 {

	public static void main(String[] args) {
		MyNumber example = new MyNumber();
        example.numberProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(observable);
            System.out.println(oldValue);
            System.out.println(newValue);
        });
        example.setNumber(10);  //su thay doi cac su kien
        example.setNumber(11);
	}
}
