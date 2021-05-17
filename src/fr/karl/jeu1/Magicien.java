package fr.karl.jeu1;

/**
 * @author karlo
 * <b> la classe Magicien hérite de la classe Personnage, on lui rajoute seulement l'attribut sort </b>
 */
public class Magicien extends Personnage {
	private Sort sort;

	/**
	 * constructeur par défaut
	 */
	public Magicien() {
		super();
	}

	/**
	 * @param magicienNom c'est le nom du magicien
	 */
	public Magicien(String magicienNom) {
		setNom(magicienNom);
	}

	/**
	 * @param magicienNom c'est le nom du magicien
	 * @param vie c'est la vie du magicien
	 * @param atk c'est l'attaque du magicien
	 */
	public Magicien(String magicienNom,  int vie, int atk) {
		super(magicienNom, "", vie, atk, null, "");
		setSort(new BatonMage()); // le Magicien à un sort de base qui à pour force zéro
	}

	public Sort getSort() {
		return sort;
	}

	public void setSort(Sort sort) {
		this.sort = sort;
		setAtk(sort.getForce()); // change l'atk en rajoutant la force de l'arme (voir setAtk class parent Personnage)
	}

	@Override
	public String toString() {
		return "Magicien [sort=" + sort + ", getVie()=" + getVie() + ", getAtk()=" + getAtk() + "]";
	}
}
