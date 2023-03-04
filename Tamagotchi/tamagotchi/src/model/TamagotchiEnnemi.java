package model;

import utils.Utilitaires;

public class TamagotchiEnnemi extends Tamagotchi {

	public TamagotchiEnnemi(String nom, int energy, int force, int joie, int faim, int fatigue, int propreté,
			int nbDeVictoire, int malusForce) {
		super("TamagotchiA", Utilitaires.randomNumber(5, 10), force, Utilitaires.randomNumber(5, 10), Utilitaires.randomNumber(0, 5), Utilitaires.randomNumber(0, 5), Utilitaires.randomNumber(5, 10), nbDeVictoire, Utilitaires.randomNumber(0, 5));
		
	}

	@Override
	public String toString() {
		return "TamagotchiEnnemi [Nom=" + Nom + ", Energy=" + Energy + ", Force=" + Force + ", Joie=" + Joie
				+ ", Faim=" + Faim + ", Fatigue=" + Fatigue + ", Proprete=" + Proprete + ", nbDeVictoire="
				+ nbDeVictoire + ", MalusForce=" + MalusForce + "]";
	}

}