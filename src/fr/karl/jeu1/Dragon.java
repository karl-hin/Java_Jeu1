package fr.karl.jeu1;

public class Dragon extends Case {

	private String Nom;
	private int Vie;
	private int Atk;

	public Dragon() {
	}

	public Dragon(String nomDragon, int vieDragon, int atkDragon) {
		Nom = nomDragon;
		Vie = vieDragon;
		Atk = atkDragon;
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
		return "Dragon [Nom=" + Nom + ", Vie=" + Vie + ", Atk=" + Atk + "]";
	}

	
}
