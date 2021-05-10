package fr.karl.jeu1;

public class Gobelin extends Ennemies {
	private String Nom;
	private int Vie;
	private int Atk;
	
	public Gobelin() {
		this.Nom ="Gobelin";
		this.Vie = 6;
		this.Atk= 1;
	}
	
	public Gobelin(String nomGobelin, int vieGobelin, int atkGobelin) {
		this.Nom = nomGobelin;
		this.Vie = vieGobelin;
		this.Atk = atkGobelin;
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
