package fr.karl.jeu1;

public class Guerrier extends Personnage {

	private static final int DEFAULT_LIFE = 10;
	private static final int DEFAULT_ATK = 8;	
	private Arme arme;
	private String Defense;

	public Guerrier() {
	}

	public Guerrier(String guerrierNom) {
		
	}

	public Guerrier(String guerrierNom, String guerrierImage, Arme guerrierarme,
			String guerrierDefense) {
		super(guerrierNom, guerrierImage, DEFAULT_LIFE, DEFAULT_ATK);
		arme = guerrierarme;
		Defense = guerrierDefense;
	}

	public String getBouclier() {
		return Defense;
	}

	public void setBouclier(String bouclier) {
		Defense = bouclier;
	}

	@Override
	public String toString() {
		return "Guerrier [Nom=" + getNom() + ", Vie=" + getVie() + ", Atk=" + getAtk() + ", Image=" + getImage() +" arme=" + arme + ", Defense=" + Defense + "]";
	}




}
