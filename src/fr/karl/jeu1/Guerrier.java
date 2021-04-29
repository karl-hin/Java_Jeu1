package fr.karl.jeu1;

public class Guerrier {
	private String Nom;
	private int Vie;
	private int Atk;
	private String Image;
	private String Arme;
	private String Defense;

	public Guerrier() {
		Nom = "";
	}

	public Guerrier(String guerrierNom) {
		Nom = guerrierNom;
		Vie = 9;
		Atk = 7;
		Arme ="Epée";
		Defense = "Bouclier";
	}

	public Guerrier(String guerrierNom, String guerrierImage, int guerrierVie, int guerrierAtk, String guerrierArme,
			String guerrierDefense) {
		Nom = guerrierNom;
		Image = guerrierImage;
		Vie = guerrierVie;
		Atk = guerrierAtk;
		Arme = guerrierArme;
		Defense = guerrierDefense;
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

	public String getEpee() {
		return Arme;
	}

	public void setEpee(String epee) {
		Arme = epee;
	}

	public String getBouclier() {
		return Defense;
	}

	public void setBouclier(String bouclier) {
		Defense = bouclier;
	}

	@Override
	public String toString() {
		return "Guerrier [Nom=" + Nom + ", Vie=" + Vie + ", Atk=" + Atk + ", Image=" + Image + ", Arme=" + Arme
				+ ", Defense=" + Defense + "]";
	}


}
