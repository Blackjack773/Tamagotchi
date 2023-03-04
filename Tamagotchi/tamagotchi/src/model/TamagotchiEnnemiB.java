package model;

import utils.Utilitaires;

public class TamagotchiEnnemiB extends Tamagotchi {

	public TamagotchiEnnemiB(String nom, int energy, int force, int joie, int faim, int fatigue, int propreté,
			int nbDeVictoire, int malusForce) {
		super("TamagotchiB", Utilitaires.randomNumber(5, 10), force, Utilitaires.randomNumber(5, 10), Utilitaires.randomNumber(0, 5), Utilitaires.randomNumber(0, 5), Utilitaires.randomNumber(5, 10), nbDeVictoire, Utilitaires.randomNumber(0, 5));
		
	}

}
