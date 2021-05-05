package fr.karl.jeu1;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
	private Scanner clavier = new Scanner(System.in);
	
	private int[] Case;
	private int index;
	

	public Game() {
		Case = new int[64];
		index = 1;		
	}	

	public int[] getCase() {
		return Case;
	}

	public void setCase(int[] case1) {
		Case = case1;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public String toString() {
		return "Plateau [Case=" + Arrays.toString(Case) + ", index=" + index + "]";
	}	
	
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
}
