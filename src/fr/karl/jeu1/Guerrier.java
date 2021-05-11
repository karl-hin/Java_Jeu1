package fr.karl.jeu1;

public class Guerrier extends Personnage {
	private Arme arme;

	public Guerrier() {
		super();
	}

	public Guerrier(String guerrierNom) {
		setNom(guerrierNom);
	}

	public Guerrier(String guerrierNom, int vie, int atk) {
		super(guerrierNom, "", vie, atk, null, "");
		setArme(new BatonGuerrier());
	}
	

	public Arme getArme() {
		return arme;
	}

	public void setArme(Arme arme) {
		this.arme = arme;
		setAtk(arme.getForce());
	}

	@Override
	public String toString() {
		return "Guerrier [arme=" + arme + ", getVie()=" + getVie() + ", getAtk()=" + getAtk() + "]";
	}
}
