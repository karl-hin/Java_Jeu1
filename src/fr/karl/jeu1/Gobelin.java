package fr.karl.jeu1;

import java.util.Scanner;

/**
 * @author karlo <b>la classe Gobelin hérite de la class Ennemies </b>
 */
public class Gobelin extends Ennemies {
	private Scanner clavier = new Scanner(System.in);

	private String Nom;
	private int Vie;
	private int Atk;

	/**
	 * constructeur par défaut dont le nom, la vie et l'attaque sont définit à
	 * l'intérieur
	 */
	public Gobelin() {
		this.Nom = "Gobelin";
		this.Vie = 6;
		this.Atk = 1;
	}

	/**
	 * @param nomGobelin c'est le nom du gobelin
	 * @param vieGobelin c'est le vie du gobelin
	 * @param atkGobelin c'est l'attaque du gobelin
	 */
	public Gobelin(String nomGobelin, int vieGobelin, int atkGobelin) {
		this.Nom = nomGobelin;
		this.Vie = vieGobelin;
		this.Atk = atkGobelin;
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
		return "Gobelin [Nom=" + Nom + ", Vie=" + Vie + ", Atk=" + Atk + "]";
	}

	/**
	 * méthode hérité de la classe Case cette méthode permet le combat entre le
	 * personnage et le gobelin
	 */
	@Override
	public void action(Personnage p, Game game) {
		int choix = 1;
		System.out.println("Combat contre un gobelin");
		System.out.println(toString());
		System.out.println("1ère attaque");
		while (choix == 1 && (getVie() > 0 && p.getVie() > 0)) {
			this.setVie(this.getVie() - p.getAtk()); // fait que le niveau de vie du dragon soit persistant
			
			if (this.getVie() > 0) {
				System.out.println("le gobelin vient de passer à " + this.getVie() + " de vie");
				System.out.println("le gobelin contre-attaque");
			} else {
				System.out.println("Vous avez tué le gobelin");
				break;
			}
			if (p.getVie() > 0) {
				p.setVie(p.getVie() - Atk);
				System.out.println("Vous êtes à " + p.getVie() + " de vie");
				System.out.println("Voulez-vous attaquer le gobelin ou fuir?\n 1 pour attaquer\n 2 pour fuir");
				choix = clavier.nextInt();
			} else {
				System.out.println("Vous êtes mort");
				break;
			}
		}
		if (choix == 2) {
			System.out.println("Vous reculez à la case " + game.reculerJoueur() + " cases");
			
		} else {
			System.out.println("Fin du combat");
		}
	}
}
