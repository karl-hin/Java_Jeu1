package fr.karl.jeu1;

public class PotionVieStandard extends Case {
	private int Vie;
	
	public PotionVieStandard() {
	}
	
	public PotionVieStandard(int viePotionStandard) {
		Vie = viePotionStandard;
	}

	public int getVie() {
		return Vie;
	}

	public void setVie(int vie) {
		Vie = vie;
	}

	@Override
	public String toString() {
		return "PotionVieStandard [Vie=" + Vie + "]";
	}
	
	
}
