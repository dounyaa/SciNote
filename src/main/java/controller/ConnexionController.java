package main.java.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.java.exception.IncorrectAuthentification;
import main.java.modele.User;


public class ConnexionController {
	
	@FXML
	private Button inscriptionButton;
	
	@FXML
	private Button connexionButton;
	
	@FXML
	private TextField loginField;
	
	@FXML
	private TextField pwdField;

	Parent root = null;
	
	User user;
	
	public ConnexionController() {
		user = new User();
	}

	public void connect() throws IncorrectAuthentification {
		//TODO
	}
	
	private void loadHomePage() {
		//TO DO
	}
	
	private void createScene(String sceneRoot) {
		//TODO

	}
	
	public void inscription() {
		//TODO
	}
}
