package fr.karl.jeu1;

public class Guerrier extends Personnage {

	private static final int DEFAULT_LIFE = 10;
	private static final int DEFAULT_ATK = 8;	
	private String Arme;
	private String Defense;

	public Guerrier() {
	}

	public Guerrier(String guerrierNom) {
		this(guerrierNom, "", "Epee", null);
		Defense = "Bouclier";
	}

	public Guerrier(String guerrierNom, String guerrierImage, String guerrierArme,
			String guerrierDefense) {
		super(guerrierNom, guerrierImage, DEFAULT_LIFE, DEFAULT_ATK);
		Arme = guerrierArme;
		Defense = guerrierDefense;
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
		return "Guerrier [Arme=" + Arme + ", Defense=" + Defense + "]";
	}




}
