package model;

public class Tamagotchi {

	String Nom;
	int Energy;
	int Force;
	int Joie;
	int Faim;
	int Fatigue;
	int Proprete;
	int nbDeVictoire;
	int MalusForce;

	public Tamagotchi(String nom, int energy, int force, int joie, int faim, int fatigue, int propreté,
			int nbDeVictoire, int malusForce) {
		super();
		Nom = nom;
		Energy = energy;
		Force = force;
		Joie = joie;
		Faim = faim;
		Fatigue = fatigue;
		Proprete = propreté;
		this.nbDeVictoire = nbDeVictoire;
		MalusForce = malusForce;
	}

	@Override
	public String toString() {
		return "Tamagotchi [Nom=" + Nom + ", Energy=" + Energy + ", Force=" + Force + ", Joie=" + Joie + ", Faim="
				+ Faim + ", Fatigue=" + Fatigue + ", Proprete=" + Proprete + ", nbDeVictoire=" + nbDeVictoire
				+ ", MalusForce=" + MalusForce + "]";
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public int getEnergy() {
		return Energy;
	}

	public void setEnergy(int energy) {
		Energy = energy;
	}

	public int getForce() {
		return Force;
	}

	public void setForce(int force) {
		Force = force;
	}

	public int getJoie() {
		return Joie;
	}

	public void setJoie(int joie) {
		Joie = joie;
	}

	public int getFaim() {
		return Faim;
	}

	public void setFaim(int faim) {
		Faim = faim;
	}

	public int getFatigue() {
		return Fatigue;
	}

	public void setFatigue(int fatigue) {
		Fatigue = fatigue;
	}

	public int getPropreté() {
		return Proprete;
	}

	public void setPropreté(int propreté) {
		Proprete = propreté;
	}

	public int getNbDeVictoire() {
		return nbDeVictoire;
	}

	public void setNbDeVictoire(int nbDeVictoire) {
		this.nbDeVictoire = nbDeVictoire;
	}

	public int getMalusForce() {
		return MalusForce;
	}

	public void setMalusForce(int malusForce) {
		MalusForce = malusForce;
	}

}
