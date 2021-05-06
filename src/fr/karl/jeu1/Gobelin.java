package fr.karl.jeu1;

public class Gobelin extends Case {
	private String Nom;
	private int Vie;
	private int Atk;
	
	public Gobelin() {
	}
	
	public Gobelin(String nomGobelin, int vieGobelin, int atkGobelin) {
		Nom = nomGobelin;
		Vie = vieGobelin;
		Atk = atkGobelin;
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
		return "Gobelin [Nom=" + Nom + ", Vie=" + Vie + ", Atk=" + Atk + "]";
	}
	
	
	
}
