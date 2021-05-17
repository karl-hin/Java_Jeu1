package fr.karl.jeu1;

/**
 * @author karlo
 * <b>Personnage est la classe parent de la classe Guerrier et Magicien</b>
 * 
 */
public abstract class Personnage {
	private String nom;
	private int vie;
	private int atk;
	int baseAtk;
	int baseVie;
	private String image;
	private String defense;
	
	/**
	 * Constructeur par défaut
	 */
	public Personnage() {
		this.nom = "";
		this.image = "";
		this.vie = 0; 
		this.atk = 0;
		this.defense = "";
	}

	/**
	 * @param Nom c'est le nom du personnage
	 */
	public Personnage(String Nom) {
		this.nom = Nom;
		this.image = "";
		this.vie = 0; 
		this.atk = 0;
		this.defense = "";
	}

	/**
	 * @param personnageNom c'est le nom du personnage
	 * @param personnageImage c'est l'image du personnage
	 * @param personnageVie c'est la vie du personnage
	 * @param personnageAtk c'est l'attaque du personnage
	 * @param personnageArme c'est l'arme du personnage
	 * @param personnageDefense c'est la défnese du personnage
	 */
	public Personnage(String personnageNom, String personnageImage, int personnageVie, int personnageAtk, Arme personnageArme, String personnageDefense) {
		this.nom = personnageNom;
		this.image = personnageImage;
		this.vie = personnageVie;
		this.baseVie = personnageVie;
		this.atk = personnageAtk;
		this.defense = personnageDefense;
		this.baseAtk = personnageAtk;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getVie() {
		return vie;
	}
	
	public void setVie(int vie) {
		this.vie = vie;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = this.baseAtk + atk;// quand le personnage tombera sur une case arme, ça gardera son atk de base et ça rajoute l'atk de l'arme
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDefense() {
		return defense;
	}

	public void setDefense(String defense) {
		this.defense = defense;
	}

	@Override
	public String toString() {
		return "Personnage [nom=" + nom + ", vie=" + vie + ", atk=" + atk + ", image=" + image + ", defense=" + defense
				+ "]";
	}

}
