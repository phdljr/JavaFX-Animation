package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

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
		}
		catch(Exception e2) {
			e2.printStackTrace();
		}
	}

}
