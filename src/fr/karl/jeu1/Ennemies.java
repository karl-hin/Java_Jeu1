package fr.karl.jeu1;

/**
 * @author karlo <b>la class Ennemies hérite de la class Case </b>
 */
public class Ennemies implements Case {

	private String nom;
	private int vie;
	private int atk;

	public Ennemies() {
	}

	/**
	 * @param nomEnnemies c'est le nom de l'ennemi
	 * @param vieEnnemies c'est la vie de l'ennemi
	 * @param atkEnnemies c'est l'attaque de l'ennemi
	 */
	public Ennemies(String nomEnnemies, int vieEnnemies, int atkEnnemies) {
		this.nom = nomEnnemies;
		this.vie = vieEnnemies;
		this.atk = atkEnnemies;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		nom = nom;
	}

	public int getVie() {
		return vie;
	}

	public void setVie(int vie) {
		vie = vie;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		atk = atk;
	}

	@Override
	public String toString() {
		return "Ennemies [Nom=" + nom + ", Vie=" + vie + ", Atk=" + atk + "]";
	}

	@Override
	public void action(Personnage p, Game game) {
		// TODO Auto-generated method stub
		
	}

}
