package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class MainLayoutController implements Initializable{
	@FXML
	private Button btn_login;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		btn_login.setOnAction(e->handleBtnLogin(e));
	}
	
	public void handleBtnLogin(ActionEvent e) {
		try {
			Parent login = FXMLLoader.load(getClass().getClassLoader().getResource("layout/LoginLayout.fxml"));
			StackPane root = (StackPane)btn_login.getScene().getRoot();
			root.getChildren().add(login);
			
			login.setTranslateX(350);
			
			Timeline timeline = new Timeline();
			KeyValue keyValue = new KeyValue(login.translateXProperty(), 0);
			KeyFrame keyFrame = new KeyFrame(Duration.millis(100), keyValue);
			timeline.getKeyFrames().add(keyFrame);
			timeline.play();
		}
		catch(Exception e2) {
			e2.printStackTrace();
		}
	}

}
