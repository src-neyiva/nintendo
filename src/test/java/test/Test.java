package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import metier.Achat;
import metier.Adresse;
import metier.Boutique;
import metier.Client;
import metier.Console;
import metier.Hybride;
import metier.Jeu;
import metier.Salon;

public class Test {

	public static void main(String[] args) {
		Console c1 = new Salon("wii");
		Console c2 = new Hybride("switch");
		Console c3 = new Salon("gamecube");
		
		List<Console> consoles = new ArrayList();
		consoles.add(c1);
		consoles.add(c2);
		consoles.add(c3);
		
		
		Jeu j1 = new Jeu("mario_galaxy",consoles);
		Jeu j2 = new Jeu("zelda twilight princess",consoles);
		Jeu j3 = new Jeu("pokemon unite",consoles);
		Jeu j4 = new Jeu("metroid prime 2",consoles);
		Jeu j5 = new Jeu("pokemon let's go evoli",consoles);
		List<Jeu> jeuxBoutique = new ArrayList();
		
		Adresse a = new Adresse(5, "Rue Saint-Rome", "Toulouse");
		
		Boutique b = new Boutique("EscrocMania", a, jeuxBoutique);
		List<Achat> jeuxClient = new ArrayList();
		
		jeuxBoutique.add(j1);
		jeuxBoutique.add(j2);
		jeuxBoutique.add(j3);
		jeuxBoutique.add(j4);
		jeuxBoutique.add(j5);
		
		Achat a1 = new Achat(j3, LocalDate.now(),50, b);
		Achat a2 = new Achat(j4, LocalDate.now(),50, b);
		
		jeuxClient.add(a1);
		jeuxClient.add(a2);
		
		
		
		Client c = new Client("Courtades", "Andy", jeuxClient);
           
	}

}
