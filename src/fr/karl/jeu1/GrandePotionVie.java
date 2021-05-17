package fr.karl.jeu1;

/**
 * @author karlo
 * <b>la classe GrandePotionVie hérite de la classe Case </b>
 */
public class GrandePotionVie extends Case {
	private int grandePotionVie;
	
	/**
	 * constructeur par défaut dont la vie est définit à l'intérieur
	 */
	public GrandePotionVie() {
		this.grandePotionVie = 5;
	}
	
	/**
	 * @param vieGrandePotionVie c'est la vie que contient cette potion
	 */
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

	/**
	 * méthode hérité de la classe Case
	 * on rajoute la vie de cette grandePotionVie à la vie du personnage
	 */
	@Override
	public void action(Personnage p) {
		System.out.println("une grande fiole pour vous soigner de 5 PV");
		p.setVie(this.getGrandePotionVie() + p.getVie());		
	}	
}
