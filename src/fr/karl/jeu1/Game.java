package fr.karl.jeu1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Game {

	private int nbCase;
	private Scanner clavier = new Scanner(System.in);
	private List<Case> listCase;
	private int indexJoueur;

	public Personnage interaction(Personnage joueur, int positionJoueur) {
		Case caseChoisit = listCase.get(positionJoueur);
		System.out.println(caseChoisit.getClass());
		caseChoisit.action(joueur);
		return joueur;
	}


	public Game() {
		listCase = new ArrayList<Case>();
		// indexJoueur = 0;
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

	// méthodes pour le déroulé du jeu
	public int lancerDes() {
		int lancerDe = 0;
		lancerDe = 1 + (int) (Math.random() * 6);
		return lancerDe;
	}

	public void avancerJoueur() {
		System.out.println("C'est à votre tour\n" + "Appuyer sur un chiffre pour jeter le dé ");
		clavier.nextInt();
		clavier.nextLine();
		System.out.println("Lancé de dé: " + lancerDes());
	}

	public int rejouer() {
		int joueurRejoue;
		do {
			// pour joueurRejoue
			System.out.println("Taper 0 pour joueurRejoue\n" + "Taper 1 pour quitter");
			joueurRejoue = clavier.nextInt();
			clavier.nextLine();
			if (joueurRejoue != 0 && joueurRejoue != 1) {
				System.out.println("Taper 0 pour joueurRejoue\n" + "Taper 1 pour quitter");
			}
		} while (joueurRejoue != 0 && joueurRejoue != 1);
		return joueurRejoue;
	}

}
