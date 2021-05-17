package fr.karl.jeu1;

/**
 * @author karlo
 * <b>la classe Epee hérite de la classe Arme </b>
 */
public class Epee extends Arme{
	private String nom;
	private int force;
	
	/**
	 * constructeur par défaut dont le nom et la force sont définit à l'intérieur
	 */
	public Epee() {
		this.nom = "Epée";
		this.force = 5;
	}
	
	/**
	 * @param nomEpee c'est le nom de l'épée
	 * @param forceEpee c'est la force de l'épée
	 */
	public Epee(String nomEpee, int forceEpee) {
		this.nom = nomEpee;
		this.force = forceEpee;		
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
		return "Epee [nom=" + nom + ", force=" + force + "]";
	}
	
	/**
	 * méthode hérité de la classe Case
	 * si le personnage est un Guerrier
	 * alors on rajoute la force de cette Epee à son Atk de base (voir dans class Personnage)
	 */
	@Override
	public void action(Personnage p) {
		if (p instanceof Guerrier) {
			((Guerrier)p).setArme(this);
		} else {
			System.out.println("Dommage, l'épée ne peut être à vous");
		}
	}
}
