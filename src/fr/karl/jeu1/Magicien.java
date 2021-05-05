package fr.karl.jeu1;

public class Magicien extends Personnage {
	private static final int DEFAULT_LIFE = 5;
	private static final int DEFAULT_ATK = 13;
	private String Arme;
	private String Defense;

	public Magicien() {
	}

	public Magicien(String magicienNom) {
		this(magicienNom, "", "Sort", null);
		Defense = "Philtre";
	}

	public Magicien(String magicienNom, String magicienImage, String magicienArme,
			String magicienDefense) {
		//super est utilisé pour corrspondre aux paramètres de la classe parnet Personnage
		super(magicienNom, magicienImage, DEFAULT_LIFE, DEFAULT_ATK);
		Arme = magicienArme;
		Defense = magicienDefense;		
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
		return "Magicien [Nom=" + getNom() + ", Vie=" + getVie() + ", Atk=" + getAtk() + ", Image=" + getImage() +" Arme=" + Arme + ", Defense=" + Defense + "]";
	}


}
