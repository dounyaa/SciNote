package main.java.modele;

import java.util.Properties;

import javax.naming.AuthenticationException;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

import main.java.exception.IncorrectAuthentification;

public class Connexion {

	private DirContext connection;
	private boolean isConnected;
	
	public Connexion() {
		this.connection = null;
	}

	public void authentification(String login, String pwd) throws IncorrectAuthentification {
		//TODO
	}
	

	public void logout() {
		try {
			this.connection.close();
			this.isConnected = false;
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	public boolean isConnected() {
		return isConnected;
	}
	
}