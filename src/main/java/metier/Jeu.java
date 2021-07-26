package metier;

import java.util.ArrayList;
import java.util.List;

public class Jeu {

	private String titre;
	private List <Console> console= new ArrayList();
	
	
	
	public Jeu(String titre, List<Console> console) {
		this.titre = titre;
		this.console = console;
	}



	public String getTitre() {
		return titre;
	}



	public void setTitre(String titre) {
		this.titre = titre;
	}



	public List<Console> getConsole() {
		return console;
	}



	public void setConsole(List<Console> console) {
		this.console = console;
	}



	@Override
	public String toString() {
		return "Jeu [titre=" + titre + ", console=" + console + "]";
	}
	
	
}
