package fr.karl.jeu1;

public class Sorcier extends Case {

	private String Nom;
	private int Vie;
	private int Atk;

	public Sorcier() {
	}

	public Sorcier(String nomSorcier, int vieSorcier, int atkSorcier) {
		Nom = nomSorcier;
		Vie = vieSorcier;
		Atk = atkSorcier;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public int getVie() {
		return Vie;
	}

	public void setVie(int vie) {
		Vie = vie;
	}

	public int getAtk() {
		return Atk;
	}

	public void setAtk(int atk) {
		Atk = atk;
	}

	@Override
	public String toString() {
		return "Sorcier [Nom=" + Nom + ", Vie=" + Vie + ", Atk=" + Atk + "]";
	}

	
}
