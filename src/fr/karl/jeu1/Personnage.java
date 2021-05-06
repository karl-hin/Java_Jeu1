package fr.karl.jeu1;

public abstract class Personnage extends Case {
	private String Nom;
	private int Vie;
	private int Atk;
	private String Image;

	public Personnage() {
	
	}

	public Personnage(String Nom) {
		this.Nom = Nom;
	}

	public Personnage(String personnageNom, String personnageImage, int personnageVie, int personnageAtk) {
		Nom = personnageNom;
		Image = personnageImage;
		Vie = personnageVie;
		Atk = personnageAtk;
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
		return "Personnage [Nom=" + Nom + ", Vie=" + Vie + ", Atk=" + Atk + ", Image=" + Image + "]";
	}
	
	

}
