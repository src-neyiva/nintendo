package test;

import java.util.ArrayList;
import java.util.List;

import metier.Adresse;
import metier.Boutique;
import metier.Client;
import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {
		Console c1 = new Console("wii");
		Console c2 = new Console("switch");
		Console c3 = new Console("gamecube");
		
		
		Jeu j1 = new Jeu("mario_galaxy",c1);
		Jeu j2 = new Jeu("zelda twilight princess",c1);
		Jeu j3 = new Jeu("pokemon unite",c2);
		Jeu j4 = new Jeu("metroid prime 2",c3);
		Jeu j5 = new Jeu("pokemon let's go evoli",c2);
		List<Jeu> jeuxBoutique = new ArrayList();
		
		List<Jeu> jeuxClient = new ArrayList();
		
		jeuxBoutique.add(j1);
		jeuxBoutique.add(j2);
		jeuxBoutique.add(j3);
		jeuxBoutique.add(j4);
		jeuxBoutique.add(j5);
		
		jeuxClient.add(j3);
		jeuxClient.add(j4);
		
		Adresse a = new Adresse(5, "Rue Saint-Rome", "Toulouse");
		
		Boutique b = new Boutique("EscrocMania", a, jeuxBoutique);
		Client c = new Client("Courtades", "Andy", jeuxClient);
           
	}

}
