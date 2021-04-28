package fr.karl.jeu1;

public class Guerrier {
	private String Nom;
	private int Vie = 10;
	private int Atk = 5;
	private String Image;
	
	public Guerrier() {
		Nom = "";
	}
	
	public Guerrier(String guerrierNom) {
		Nom = guerrierNom;
		
	}
	
	public Guerrier(String guerrierNom, String guerrierImage, int guerrierVie, int guerrierAtk) {
		Nom = guerrierNom;
		Image = guerrierImage;
		Vie = guerrierVie;
		Atk = guerrierAtk;
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

	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}

	@Override
	public String toString() {
		return "Guerrier [Nom=" + Nom + ", Vie=" + Vie + ", Atk=" + Atk + "]";
	}
	
	
}
