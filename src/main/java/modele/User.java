package main.java.modele;


public class User {

	private String login;
	private Connexion connexion;

	
	public User() {
		connexion = new Connexion();
	}

	
	public User(String login) {
		this.login = login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getLogin() {
		return login;
	}
	
	public Connexion getConnexion() {
		return connexion;
	}

	public void setConnexion(Connexion connexion) {
		this.connexion = connexion;
	}
	

	public boolean isConnected() {
		return this.connexion.isConnected();
	}

	public void disconnectUser() {
		this.connexion.logout();
	}
}