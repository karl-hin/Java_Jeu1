package fr.karl.jeu1;

public class Guerrier extends Personnage {
	private Arme arme;

	public Guerrier() {
		super();
	}

	public Guerrier(String guerrierNom) {
		setNom(guerrierNom);
	}

	public Guerrier(String guerrierNom, int vie, int Atk) {
		setNom(guerrierNom);
		setVie(vie);
		setAtk(Atk);
		this.arme = new Epee();
	}
	
	

	public Arme getArme() {
		return arme;
	}

	public void setArme(Arme arme) {
		this.arme = arme;
	}

	@Override
	public String toString() {
		return "Guerrier [arme=" + arme + ", getVie()=" + getVie() + ", getAtk()=" + getAtk() + "]";
	}
}
