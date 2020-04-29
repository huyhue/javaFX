package main14;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.util.converter.NumberStringConverter;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    @FXML
    Slider slider;
    @FXML
    TextField textField;
    static final double INIT_VALUE = 50;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        slider.setValue(INIT_VALUE);
        textField.setText(String.valueOf(INIT_VALUE));   //vi textField luu kieu string nen phai chuyen
        slider.setMax(200);
        //rang buoc 2 chieu
        textField.textProperty().bindBidirectional(slider.valueProperty(), new NumberStringConverter());
    }
}

