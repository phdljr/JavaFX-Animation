package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

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
			root.getChildren().remove(login);
		}
		catch(Exception e2) {
			e2.printStackTrace();
		}
	}

}
