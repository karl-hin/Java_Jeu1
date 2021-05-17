package fr.karl.jeu1;

/**
 * @author karlo
 * <b> Arme est la classe parent de la classe Epee, Massue et BatonGuerrier</b>
 * <b> elle possède 2 attribut </b>
 */
public abstract class Arme extends Case{
	private String nom;
	private int force;
	
	/**
	 * constructeur par défaut
	 */
	public Arme() {
	}
	
	/**
	 * @param nomArme c'est le nom de l'arme
	 * @param forceArme c'est la force de l'arme
	 */
	public Arme(String nomArme, int forceArme) {
		this.nom = nomArme;
		this.force = forceArme;
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
		return "Arme [nom=" + nom + ", force=" + force + "]";
	}
	
}
