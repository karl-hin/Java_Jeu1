package fr.karl.jeu1;

public class Magicien {
	private String Nom;
	private int Vie;
	private int Atk;
	private String Image;
	private String Arme;
	private String Defense;

	public Magicien() {
		Nom = "";
	}

	public Magicien(String magicienNom) {
		Nom = magicienNom;
		Vie = 6;
		Atk = 10;
		Arme = "Sort";
		Defense = "Philtre";
	}

	public Magicien(String magicienNom, String magicienImage, int magicienVie, int magicienAtk, String magicienArme,
			String magicienDefense) {
		Nom = magicienNom;
		Image = magicienImage;
		Vie = magicienVie;
		Atk = magicienAtk;
		Arme = magicienArme;
		Defense = magicienDefense;
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

	public String getArme() {
		return Arme;
	}

	public void setArme(String arme) {
		Arme = arme;
	}

	public String getDefense() {
		return Defense;
	}

	public void setDefense(String defense) {
		Defense = defense;
	}

	@Override
	public String toString() {
		return "Magicien [Nom=" + Nom + ", Vie=" + Vie + ", Atk=" + Atk + ", Image=" + Image + ", Arme=" + Arme
				+ ", Defense=" + Defense + "]";
	}

	




}
