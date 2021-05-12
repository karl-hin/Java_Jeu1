package fr.karl.jeu1;

public class Sorcier extends Ennemies {

	private String Nom;
	private int Vie;
	private int Atk;

	public Sorcier() {
		this.Nom = "Sorcier";
		this.Vie = 9;
		this.Atk = 2;
	}

	public Sorcier(String nomSorcier, int vieSorcier, int atkSorcier) {
		this.Nom = nomSorcier;
		this.Vie = vieSorcier;
		this.Atk = atkSorcier;
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

	@Override
	public void action(Personnage p) {
		int resultPersoAtk = Vie - p.getAtk();
		p.setVie(p.getVie() - Atk);
		int resultSorcierAtk = p.getVie();
		System.out.println("Combat contre un sorcier");
		System.out.println(toString());
		System.out.println("personnage attaque");
		if (resultPersoAtk > 0) {
			System.out.println("le sorcier vient de passer à " + resultPersoAtk + " de vie");
			System.out.println("le sorcier contre-attaque attaque");
		} else {
			System.out.println("Vous avez tué le sorcier");
		}
		if (resultSorcierAtk > 0) {
			System.out.println("Vous êtes à " + resultSorcierAtk + " de vie");
			System.out.println("IL S'ENFUIT!!!!!!");
		} else {
			System.out.println("Vous êtes mort");
		}
	}
}
