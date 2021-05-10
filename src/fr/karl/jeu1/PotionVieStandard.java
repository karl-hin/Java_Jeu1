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

	@Override
	public void action(Personnage p) {
		System.out.println("une petiite fiole pour vous soigner de 2 PV");
		p.setVie(p.getVie() + this.getVieStandard());
	}

	
	
}
