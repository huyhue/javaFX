package main17;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class Controller {
    @FXML
    private AnchorPane ap;
    @FXML
    private ImageView imageView;

    public void ChooseImage (ActionEvent e){
        Stage stage = (Stage) ap.getScene().getWindow();
        FileChooser fc = new FileChooser();
        fc.setTitle("Choose a image");
        
        //chi chon file anh hien thi thoi
        FileChooser.ExtensionFilter imageFilter = new FileChooser.ExtensionFilter("Image Files", "*.jpg", "*.png");
        fc.getExtensionFilters().add(imageFilter);  //dua vao file vao FileChooser
        File file = fc.showOpenDialog(stage);
        if (file != null){
            Image image = new Image(file.toURI().toString(), 311.0,231.0, false, true);
            imageView.setImage(image);
        }
    }
}
