package fr.karl.jeu1;

public class Ennemies extends Case {

	private String Nom;
	private int Vie;
	private int Atk;

	public Ennemies() {
	}

	public Ennemies(String nomEnnemies, int vieEnnemies, int atkEnnemies) {
		this.Nom = nomEnnemies;
		this.Vie = vieEnnemies;
		this.Atk = atkEnnemies;
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
		return "Ennemies [Nom=" + Nom + ", Vie=" + Vie + ", Atk=" + Atk + "]";
	}


}
