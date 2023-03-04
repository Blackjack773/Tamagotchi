package model;

import utils.Utilitaires;

public class TamagotchiEnnemiC extends Tamagotchi {

	public TamagotchiEnnemiC(String nom, int energy, int force, int joie, int faim, int fatigue, int propreté,
			int nbDeVictoire, int malusForce) {
		super("TamagotchiC", Utilitaires.randomNumber(5, 10), force, Utilitaires.randomNumber(5, 10), Utilitaires.randomNumber(0, 5), Utilitaires.randomNumber(0, 5), Utilitaires.randomNumber(5, 10), nbDeVictoire, Utilitaires.randomNumber(0, 5));
		
	}

}
