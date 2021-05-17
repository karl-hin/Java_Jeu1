package fr.karl.jeu1;

/**
 * @author karlo
 * <b> la classe Guerrier hérite de la classe Personnage, on lui rajoute seulement l'attribut sort </b>
 */
public class Guerrier extends Personnage {
	private Arme arme;

	/**
	 * constructeur par défaut
	 */
	public Guerrier() {
		super();
	}

	/**
	 * @param guerrierNom c'est le nom du guerrier
	 */
	public Guerrier(String guerrierNom) {
		setNom(guerrierNom);
	}

	/**
	 * @param guerrierNom c'est le nom du guerrier
	 * @param vie c'est la vie du guerrier
	 * @param atk c'est l'attaque du guerrier
	 */
	public Guerrier(String guerrierNom, int vie, int atk) {
		super(guerrierNom, "", vie, atk, null, "");
		setArme(new BatonGuerrier());
	}
	

	public Arme getArme() {
		return arme;
	}

	public void setArme(Arme arme) {
		this.arme = arme;
		setAtk(arme.getForce()); // change l'atk en rajoutant la force de l'arme (voir setAtk class parent Personnage)
	}

	@Override
	public String toString() {
		return "Guerrier [arme=" + arme + ", getVie()=" + getVie() + ", getAtk()=" + getAtk() + "]";
	}
}
