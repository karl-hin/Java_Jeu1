package fr.karl.jeu1;

public class GrandePotionVie extends Case {
	private int Vie;
	
	public GrandePotionVie() {
	}
	
	public GrandePotionVie(int vieGrandePotionVie) {
		Vie = vieGrandePotionVie;
	}

	public int getVie() {
		return Vie;
	}

	public void setVie(int vie) {
		Vie = vie;
	}

	@Override
	public String toString() {
		return "GrandePotionVie [Vie=" + Vie + "]";
	}
	
}
