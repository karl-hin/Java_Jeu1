package fr.karl.jeu1;

/**
 * @author karlo
 * <b>la classe BatonMage hérite de la classe Arme </b>
 */
public class BatonMage extends Sort {
	private String nom;
	private int force;
	
	/**
	 * constructeur par défaut dont le nom et la force sont définit à l'intérieur
	 */
	public BatonMage() {
		this.nom = "Baton";
		this.force = 0;
	}
	
	/**
	 * @param nomBatonMage c'est le nom du BatonMage
	 * @param forceBatonMage c'est la force du BatonMage
	 */
	public BatonMage(String nomBatonMage, int forceBatonMage) {
		nom = nomBatonMage;
		force = forceBatonMage;		
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	@Override
	public String toString() {
		return "BatonMage [nom=" + nom + ", force=" + force + "]";
	}

	@Override
	protected void action(Personnage p, Game game) {
		// TODO Auto-generated method stub
		
	}

}
