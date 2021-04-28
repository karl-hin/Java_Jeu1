package fr.karl.jeu1;

public class Magicien {
	private String Nom;
	private int Vie = 6;
	private int Atk = 10;
	private String Image;
	
	public Magicien() {
		Nom = "";
	}
	
	public Magicien(String magicienNom) {
		Nom = magicienNom;
		
	}
	
	public Magicien(String magicienNom, String magicienImage, int magicienVie, int magicienAtk) {
		Nom = magicienNom;
		Image = magicienImage;
		Vie = magicienVie;
		Atk = magicienAtk;
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
		return "Magicien [Nom=" + Nom + ", Vie=" + Vie + ", Atk=" + Atk + "]";
	}
	
}
