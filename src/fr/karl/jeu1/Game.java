package fr.karl.jeu1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Game extends Case {

	private Scanner clavier = new Scanner(System.in);
	private List<Case> listCase = new ArrayList<Case>();
	private int positionJoueur;
	private int indexJoueur;

	public Game() {
		indexJoueur = 0;
		listCase.add(new Arme());
		listCase.add(new Sort());
		listCase.add(new Gobelin());
		listCase.add(new Dragon());
		listCase.add(new Sorcier());
		listCase.add(new GrandePotionVie());
		listCase.add(new PotionVieStandard());
		listCase.add(new CaseVide());

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

	@Override
	public String toString() {
		return "Game [clavier=" + clavier + ", listCase=" + listCase + ", positionJoueur=" + positionJoueur + ", indexJoueur="
				+ indexJoueur + "]";
	}

	// méthodes pour le déroulé du jeu
	public int lancerDes() {
		int lancerDe = 0;
		lancerDe = 1 + (int) (Math.random() * 6);
		return lancerDe;
	}

	public void avancerJoueur() {
		int playGamer;
		System.out.println("C'est à votre tour\n" + "Appuyer sur un chiffre pour jeter le dé ");
		playGamer = clavier.nextInt();
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
	
	public int randomIndexCase() {
		int indexCase = 0;	
			indexCase = (int) (Math.random() * listCase.size());
			System.out.println("Cette case contient :" + listCase.get(indexCase));					
		return indexCase;
	}
}
