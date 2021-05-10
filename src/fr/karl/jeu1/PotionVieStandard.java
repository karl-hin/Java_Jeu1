package fr.karl.jeu1;

public class PotionVieStandard extends Case {
	private int VieStandard;
	
	public PotionVieStandard() {
		this.VieStandard = 2;
	}
	
	public PotionVieStandard(int viePotionStandard) {
		VieStandard = viePotionStandard;
	}

	public int getVieStandard() {
		return VieStandard;
	}

	public void setVieStandard(int vieStandard) {
		VieStandard = vieStandard;
	}

	@Override
	public String toString() {
		return "PotionVieStandard [VieStandard=" + VieStandard + "]";
	}

	
	
}
