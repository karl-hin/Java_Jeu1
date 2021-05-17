package fr.karl.jeu1;

/**
 * @author karlo
 * <b>la classe Sorcier hérite de la class Ennemies </b>
 */
public class Sorcier extends Ennemies {

	private String Nom;
	private int Vie;
	private int Atk;

	/**
	 *   constructeur par défaut dont le nom, la vie et l'attaque sont définit à l'intérieur
	 */
	public Sorcier() {
		this.Nom = "Sorcier";
		this.Vie = 9;
		this.Atk = 2;
	}

	/**
	 * @param nomSorcier c'est le nom du sorcier
	 * @param vieSorcier c'est la vie du sorcier
	 * @param atkSorcier c'est l'attaque du sorcier
	 */
	public Sorcier(String nomSorcier, int vieSorcier, int atkSorcier) {
		this.Nom = nomSorcier;
		this.Vie = vieSorcier;
		this.Atk = atkSorcier;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public int getVie() {
		return Vie;
	}

	public void setVie(int vie) {
		Vie = vie;
	}

	public int getAtk() {
		return Atk;
	}

	public void setAtk(int atk) {
		Atk = atk;
	}

	@Override
	public String toString() {
		return "Sorcier [Nom=" + Nom + ", Vie=" + Vie + ", Atk=" + Atk + "]";
	}

	/**
	 * méthode hérité de la classe Case
	 * cette méthode permet le combat entre le personnage et le sorcier
	 */
	@Override
	public void action(Personnage p) {
		this.setVie(Vie - p.getAtk()); // change la vie du sorcier pour que le niveau de vie soit persistant
		int resultPersoAtk = getVie();
		p.setVie(p.getVie() - Atk);
		int resultSorcierAtk = p.getVie();
		System.out.println("Combat contre un sorcier");
		System.out.println(toString());
		System.out.println("personnage attaque");
		if (resultPersoAtk > 0) {
			System.out.println("le sorcier vient de passer à " + resultPersoAtk + " de vie");
			System.out.println("le sorcier contre-attaque");
		} else {
			System.out.println("Vous avez tué le sorcier");
		}
		if (resultSorcierAtk > 0) {
			System.out.println("Vous êtes à " + resultSorcierAtk + " de vie");
			System.out.println("IL S'ENFUIT!!!!!!");
		} else {
			System.out.println("Vous êtes mort");
		}
	}
}
