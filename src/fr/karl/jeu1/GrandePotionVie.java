package fr.karl.jeu1;

public class GrandePotionVie extends Case {
	private int grandePotionVie;
	
	public GrandePotionVie() {
		this.grandePotionVie = 5;
	}
	
	public GrandePotionVie(int vieGrandePotionVie) {
		grandePotionVie = vieGrandePotionVie;
	}

	public int getGrandePotionVie() {
		return grandePotionVie;
	}

	public void setGrandePotionVie(int grandePotionVie) {
		this.grandePotionVie = grandePotionVie;
	}

	@Override
	public String toString() {
		return "GrandePotionVie [grandePotionVie=" + grandePotionVie + "]";
	}

	
}
