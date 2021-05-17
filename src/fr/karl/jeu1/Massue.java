package fr.karl.jeu1;

/**
 * @author karlo
 * <b>la classe Massue hérite de la classe Arme </b>
 */
public class Massue extends Arme {
	private String nom;
	private int force;
	
	/**
	 * constructeur par défaut dont le nom et la force sont définit à l'intérieur
	 */
	public Massue() {
		this.nom = "Massue";
		this.force = 3;
	}
	
	/**
	 * @param nomMassue c'est le nom de la massue
	 * @param forceMassue c'est la force de la massue
	 */
	public Massue(String nomMassue, int forceMassue) {
		nom = nomMassue;
		force = forceMassue;		
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
		return "Massue [nom=" + nom + ", force=" + force + "]";
	}
	
	/**
	 * méthode hérité de la classe Case
	 * si le personnage est un Guerrier
	 * alors on rajoute la force de cette Massue à son Atk de base (voir dans class Personnage)
	 */
	@Override
	public void action(Personnage p) {
		if (p instanceof Guerrier) {
			((Guerrier)p).setArme(this);
		} else {
			System.out.println("Dommage, la massue ne peut être à vous");
		}		
	}
}
