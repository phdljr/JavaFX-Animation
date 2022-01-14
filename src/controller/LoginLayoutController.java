package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class LoginLayoutController implements Initializable{
	@FXML
	private BorderPane login;
	@FXML
	private Button btn_main;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		btn_main.setOnAction(e->handleBtnMain(e));
	}
	
	public void handleBtnMain(ActionEvent e) {
		try {
			StackPane root = (StackPane)btn_main.getScene().getRoot();
			
			login.setOpacity(1);
			
			Timeline tl = new Timeline();
			KeyValue kv = new KeyValue(login.opacityProperty(), 0);
			KeyFrame kf = new KeyFrame(Duration.millis(100), new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					root.getChildren().remove(login);
				}
			}, kv);
			tl.getKeyFrames().add(kf);
			tl.play();
		}
		catch(Exception e2) {
			e2.printStackTrace();
		}
	}

}
