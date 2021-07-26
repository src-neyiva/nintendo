package metier;

import java.time.LocalDate;

public class Console {

	private String nom;
    private int prix;
    private LocalDate sortie;  
    
	

	
	public String getNom() {
		return nom;
	}




	public void setNom(String nom) {
		this.nom = nom;
	}




	public int getPrix() {
		return prix;
	}




	public void setPrix(int prix) {
		this.prix = prix;
	}




	public LocalDate getSortie() {
		return sortie;
	}




	public void setSortie(LocalDate sortie) {
		this.sortie = sortie;
	}




	public Console(String nom, int prix, LocalDate sortie) {
		this.nom = nom;
		this.prix = prix;
		this.sortie = sortie;
	}




	@Override
	public String toString() {
		return "Console [nom=" + nom + ", prix=" + prix + ", sortie=" + sortie + "]";
	}

	
}
