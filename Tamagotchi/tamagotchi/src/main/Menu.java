package main;
import java.io.IOException;
import model.Tamagotchi;
import model.TamagotchiEnnemiA;
import model.TamagotchiEnnemiB;
import model.TamagotchiEnnemiC;
import utils.Utilitaires;
public class Menu {
	public static void menu() throws IOException {
		int choixMenu;
		int choixSoin;
		int choixAdversaire;
		String choix;
		Tamagotchi ennemi = null;
		int actionRandom;
		int chanceJoueur;
		int chanceEnnemi;
		boolean menuOn = true;
		int nbTour = 0;
		
		System.out.println("Bonjour");
		System.out.println("Comment voulez vous nommez votre Tamagotchi");
		choix = Utilitaires.saisieString();
		Tamagotchi tama = new Tamagotchi(choix, 3, 3, 5, 5, 5, 5, 0, 0);
		
		//Choix utilisateur
		while(menuOn) {
			System.out.println("tour"+nbTour);
			System.out.println(tama.toString());
			
			System.out.println("Que voulez vous faire ?");
			System.out.println("1: s'occuper de votre Tamagotchi 2: affronter un autre Tamagotchi");
			choixMenu = Utilitaires.saisieInt();
			switch(choixMenu) {
			case 1:
				System.out.println("1: nourrir 2: sortir 3: laver 4: caresser 0: sauvegarder et quitter");
				choixSoin = Utilitaires.saisieInt();
				switch(choixSoin) {
				case 1:
					//TODO l'option "nourrir" doit remettre la faim a 0 et décrementer le malus de force
					tama.setFaim(0);
					tama.setMalusForce(tama.getMalusForce()-1);
					break;
				case 2:
					//TODO l'option "sortir" doit mettre la joie a 10 et incrementer la fatigue
					tama.setJoie(10);
					tama.setFatigue(tama.getFatigue()+1);
					break;
				case 3:
					//TODO l'option "laver" doit mettre la propreté à 10
					tama.setPropreté(10);
					break;
				case 4:
					//TODO l'option "caresser" doit faire en sorte que energy = force + joie - faim - fatigue, la fatigue devient ensuite  0
					tama.setEnergy((tama.getForce()+tama.getJoie()) - (tama.getFaim()-tama.getFatigue()));
					tama.setFatigue(0);
					break;
				case 0:
					Utilitaires.eraseTamagotchi("src/model/Tama.txt");
					Utilitaires.saveTamagotchi(tama, "src/model/Tama.txt");
					menuOn = false;
					break;
				default:
					System.out.println("veuillez saisir une entrée valide");
				}
				break;
			case 2:
				System.out.println("Qui voulez vous affrontez?");
				System.out.println("1: Tamagotchi aléatoire 2: Tamagotchi d'un autre joueur");
				choixAdversaire = Utilitaires.saisieInt();
				switch(choixAdversaire) {
				case 1:
					actionRandom = Utilitaires.randomNumber(1, 3);
					switch(actionRandom) {
					case 1:
						ennemi = new TamagotchiEnnemiA(choix, nbTour, nbTour, nbTour, choixMenu, 0, choixAdversaire, actionRandom, nbTour);
						ennemi.setForce(nbTour/10 - tama.getMalusForce());
						break;
					case 2:
						ennemi = new TamagotchiEnnemiB(choix, nbTour, nbTour, nbTour, choixMenu, 0, choixAdversaire, actionRandom, nbTour);
						ennemi.setForce(nbTour/10 - tama.getMalusForce());
						break;
					case 3:
						ennemi = new TamagotchiEnnemiC(choix, nbTour, nbTour, nbTour, choixMenu, 0, choixAdversaire, actionRandom, nbTour);
						ennemi.setForce(nbTour/10 - tama.getMalusForce());
						break;
					}
					System.out.println(ennemi.toString());
					chanceJoueur = Utilitaires.randomNumber(1, 10);
					chanceEnnemi = Utilitaires.randomNumber(1, 10);
					if (tama.getForce()+chanceJoueur>ennemi.getForce()+chanceEnnemi) {
						System.out.println(tama.getNom()+" a gagner !!!");
						tama.setNbDeVictoire(tama.getNbDeVictoire()+1);
					}else {
						System.out.println(tama.getNom()+" a perdu...");
					}
					break;
				case 2:
					
					ennemi = new TamagotchiEnnemiC(choix, nbTour, nbTour, nbTour, choixMenu, 0, choixAdversaire, nbTour, nbTour);
					ennemi.setForce(nbTour/10 - tama.getMalusForce());
					
					System.out.println(ennemi.toString());
					chanceJoueur = Utilitaires.randomNumber(1, 10);
					chanceEnnemi = Utilitaires.randomNumber(1, 10);
					if (tama.getForce()+chanceJoueur>ennemi.getForce()+chanceEnnemi) {
						System.out.println(tama.getNom()+" a gagner !!!");
						tama.setNbDeVictoire(tama.getNbDeVictoire()+1);
					}else {
						System.out.println(tama.getNom()+" a perdu...");
					}
					break;
				}
			}
			
			
			// Action de tour
			actionRandom = Utilitaires.randomNumber(1, 3);
			switch(actionRandom) {
			case 1:
				if(tama.getFaim()<10) {
					tama.setFaim(tama.getFaim()+1);
				}
				break;
			case 2:
				if(tama.getFatigue()<10) {
					tama.setFatigue(tama.getFatigue()+1);
				}
				break;
			case 3:
				if(tama.getPropreté()>0) {
					tama.setPropreté(tama.getPropreté()-1);
				}
				break;
			}
			
			nbTour++;
			
			// Action de contrainte
			if (tama.getFaim()>7) {
				tama.setJoie(tama.getJoie()-1);
				tama.setFatigue(tama.getFatigue()-1);
				tama.setEnergy(tama.getEnergy()-1);
			}
			
			if (tama.getFatigue()>7) {
				tama.setMalusForce(tama.getMalusForce()+1);
				tama.setEnergy(tama.getEnergy()-1);
			}
			
			if (tama.getPropreté()<3) {
				tama.setJoie(tama.getJoie()-1);
				tama.setEnergy(tama.getEnergy()-1);
				tama.setForce(tama.getForce()-1);
			}
			
			if (tama.getJoie()<3) {
				tama.setFatigue(tama.getFatigue()-1);
				tama.setEnergy(tama.getEnergy()-1);
				tama.setForce(tama.getForce()-1);
			}
		}
		
		
	}
	
}
