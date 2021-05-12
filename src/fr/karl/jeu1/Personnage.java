package fr.karl.jeu1;

/*
 * <b>
 */

public abstract class Personnage {
	private String nom;
	private int vie;
	private int atk;
	int baseAtk;
	int baseVie;
	private String image;
	private String defense;

	public Personnage() {
		this.nom = "";
		this.image = "";
		this.vie = 0; 
		this.atk = 0;
		this.defense = "";
	}

	public Personnage(String Nom) {
		this.nom = Nom;
		this.image = "";
		this.vie = 0; 
		this.atk = 0;
		this.defense = "";
	}

	public Personnage(String personnageNom, String personnageImage, int personnageVie, int personnageAtk, Arme personnageArme, String personnageDefense) {
		this.nom = personnageNom;
		this.image = personnageImage;
		this.vie = personnageVie;
		this.baseVie = personnageVie;
		this.atk = personnageAtk;
		this.defense = personnageDefense;
		this.baseAtk = personnageAtk;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getVie() {
		return vie;
	}
	
	public void setVie(int vie) {
		this.vie = vie;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = this.baseAtk + atk;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}



	public String getDefense() {
		return defense;
	}

	public void setDefense(String defense) {
		this.defense = defense;
	}

	@Override
	public String toString() {
		return "Personnage [nom=" + nom + ", vie=" + vie + ", atk=" + atk + ", image=" + image + ", defense=" + defense
				+ "]";
	}

}
