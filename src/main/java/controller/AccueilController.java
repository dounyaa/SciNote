package main.java.controller;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import main.java.modele.User;
import javafx.collections.*;

/**
 * Base controller for Application homepage
 */
public class AccueilController {


	@FXML
	private Button deconnexionButton;

	Parent root = null;

	private User user;

	//public static final String PATH_ACCUEIL = "../../ressources/accueil.fxml";

	public AccueilController(User u) {
		this.user = u;
	}

	public void deconnect() {
		//TODO
	}

}