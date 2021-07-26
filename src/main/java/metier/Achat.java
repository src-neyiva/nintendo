package metier;

import java.time.LocalDate;

public class Achat {

	private Jeu jeu;
	private LocalDate date;
	private int prix;
	private Boutique boutique;
	
	
	public Achat(Jeu jeu, LocalDate date, int prix, Boutique boutique) {
		this.jeu = jeu;
		this.date = date;
		this.prix = prix;
		this.boutique = boutique;
	}
	public Jeu getJeu() {
		return jeu;
	}
	public void setJeu(Jeu jeu) {
		this.jeu = jeu;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public Boutique getBoutique() {
		return boutique;
	}
	public void setBoutique(Boutique boutique) {
		this.boutique = boutique;
	}
	@Override
	public String toString() {
		return "Achat [jeu=" + jeu + ", date=" + date + ", prix=" + prix + ", boutique=" + boutique + "]";
	}
	
	
	
}
