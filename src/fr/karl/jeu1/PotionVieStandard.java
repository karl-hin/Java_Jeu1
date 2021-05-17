package fr.karl.jeu1;

/**
 * @author karlo
 * <b>la classe GrandePotionVie hérite de la classe Case </b>
 */
public class PotionVieStandard extends Case {
	private int VieStandard;
	
	/**
	 * constructeur par défaut dont la vie est définit à l'intérieur
	 */
	public PotionVieStandard() {
		this.VieStandard = 2;
	}
	
	/**
	 * @param viePotionStandard c'est la vie que contient cette potion
	 */
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

	/**
	 * méthode hérité de la classe Case
	 * on rajoute la vie de cette VieStandard à la vie du personnage
	 */
	@Override
	public void action(Personnage p) {
		System.out.println("une petiite fiole pour vous soigner de 2 PV");
		p.setVie(this.getVieStandard() + p.getVie());
	}

	
	
}
