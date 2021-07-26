package metier;

import java.util.List;

public class Client {

	private String nom;
	private String prenom;
	private List<Achat> jeux;
	
	
	public Client(String nom, String prenom, List<Achat> jeux) {
		this.nom = nom;
		this.prenom = prenom;
		this.jeux = jeux;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public List<Achat> getJeux() {
		return jeux;
	}


	public void setJeux(List<Achat> jeux) {
		this.jeux = jeux;
	}


	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", jeux=" + jeux + "]";
	}
		
	
	
}
