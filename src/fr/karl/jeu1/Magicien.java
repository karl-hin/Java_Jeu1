package fr.karl.jeu1;

public class Magicien extends Personnage {
	private static final int DEFAULT_LIFE = 5;
	private static final int DEFAULT_ATK = 13;
	private Arme arme;
	private String Defense;

	public Magicien() {
	}

	public Magicien(String magicienNom) {
	}

	public Magicien(String magicienNom, String magicienImage, Arme magicienarme,
			String magicienDefense) {
		//super est utilisé pour corrspondre aux paramètres de la classe parnet Personnage
		super(magicienNom, magicienImage, DEFAULT_LIFE, DEFAULT_ATK);
		arme = magicienarme;
		Defense = magicienDefense;		
	}

	public String getDefense() {
		return Defense;
	}

	public void setDefense(String defense) {
		Defense = defense;
	}

	@Override
	public String toString() {
		return "Magicien [Nom=" + getNom() + ", Vie=" + getVie() + ", Atk=" + getAtk() + ", Image=" + getImage() +" arme=" + arme + ", Defense=" + Defense + "]";
	}


}
