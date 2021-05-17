package fr.karl.jeu1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author karlo <b> la classe Game s'occupe du déroulé du jeu </b>
 */
public class Game {

	private int nbCase;
	private Scanner clavier = new Scanner(System.in);
	private List<Case> listCase;
	private int indexJoueur;

	/**
	 * Cette méthode s'occupe de populer les cases du plateau par différent objets
	 * appelés aléatoirement selon la position du joueur
	 */
	public Game() {
		this.listCase = new ArrayList<Case>();
		indexJoueur = 0;
		nbCase = 64;
		for (int i = 0; i < nbCase; i++) {
			int random = 1 + (int) (Math.random() * 8);
			switch (random) {
			case 1:
				listCase.add(new Massue());
				break;
			case 2:
				listCase.add(new Eclair());
				break;
			case 3:
				listCase.add(new Gobelin());
				break;
			case 4:
				listCase.add(new Dragon());
				break;
			case 5:
				listCase.add(new Sorcier());
				break;
			case 6:
				listCase.add(new GrandePotionVie());
				break;
			case 7:
				listCase.add(new PotionVieStandard());
				break;
			case 8:
				listCase.add(new BoulesDeFeu());
				break;
			case 9:
				listCase.add(new Epee());
				break;
			case 10:
				listCase.add(new CaseVide());
				break;
			default:
				break;
			}
		}
	}

	/**
	 * @param joueur         c'est le joueur choisit par l'utilisateur dans la class
	 *                       Menu
	 * @param positionJoueur c'est la position du joueur sur le plateau
	 * @return le joueur après interaction avec la méthode action() dans une class
	 *         qui est choisit dans la méthode Game()
	 */
	public Personnage interaction(Personnage joueur, int positionJoueur) {
		Case caseChoisit = listCase.get(positionJoueur);
		System.out.println(caseChoisit.getClass());
		caseChoisit.action(joueur, this);
		this.supprimerEnnemi();
		System.out.println(listCase.get(positionJoueur).getClass().getName());
		return joueur;
	}

	private void supprimerEnnemi() {
		if (listCase.get(indexJoueur) instanceof Dragon && ((Dragon) listCase.get(indexJoueur)).getVie() < 1) {
			this.replaceCase(indexJoueur);
		}
		if (listCase.get(indexJoueur) instanceof Gobelin && ((Gobelin) listCase.get(indexJoueur)).getVie() < 1) {
			this.replaceCase(indexJoueur);
		}
		if (listCase.get(indexJoueur) instanceof Sorcier && ((Sorcier) listCase.get(indexJoueur)).getVie() < 1) {
			this.replaceCase(indexJoueur);
		}

	}

	public List<Case> getListCase() {
		return listCase;
	}

	public void setListCase(List<Case> listCase) {
		this.listCase = listCase;
	}

	public int getIndexJoueur() {
		return indexJoueur;
	}

	public void setIndexJoueur(int index) {
		this.indexJoueur = index;
	}

	public int getNbCase() {
		return nbCase;
	}

	public void setNbCase(int nbCase) {
		this.nbCase = nbCase;
	}

	@Override
	public String toString() {
		return "Game [nbCase=" + nbCase + ", clavier=" + clavier + ", listCase=" + listCase + ", indexJoueur="
				+ indexJoueur + "]";
	}

	/**
	 * méthodes pour lancer le dé
	 * 
	 * @return un chiffre entre 1 et 6
	 */
	public int lancerDes() {
		int lancerDe = 0;
		lancerDe = 1 + (int) (Math.random() * 6);
		return lancerDe;
	}

	/**
	 * méthode pour demander à l'utilisateur de lancer le dé
	 */
	public int avancerJoueur() {
		System.out.println("C'est à votre tour\n" + "Appuyer sur un chiffre pour jeter le dé ");
		clavier.nextInt();
		clavier.nextLine();
		int positionJoueur = lancerDes();
		System.out.println("Lancé de dé: " + positionJoueur);
		this.indexJoueur += positionJoueur;
		return this.indexJoueur;
	}

	/**
	 * méthode qui demande à l'utilisateur de faire un choix sur rejouer ou quitter
	 * 
	 * @return un int pour l'utiliser dans la méthode PlayGame() dans la class Menu
	 */
	public int rejouer() {
		int joueurRejoue;
		do {
			System.out.println("Taper 0 pour joueurRejoue\n" + "Taper 1 pour quitter");
			joueurRejoue = clavier.nextInt();
			clavier.nextLine();
			if (joueurRejoue != 0 && joueurRejoue != 1) {
				System.out.println("Taper 0 pour joueurRejoue\n" + "Taper 1 pour quitter");
			}
		} while (joueurRejoue != 0 && joueurRejoue != 1);
		return joueurRejoue;
	}

	public void replaceCase(int position) {
		this.listCase.set(position, new CaseVide());
	}
	
	public int reculerJoueur() {
		int positionJoueur = lancerDes();
		this.indexJoueur -= positionJoueur;
		return this.indexJoueur;
	}

}
