package fr.karl.jeu1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String nomJoueur1;
		String nomJoueur2;
		int typeJoueur1;
		int typeJoueur2;
		
		
		Scanner clavier = new Scanner(System.in);
		System.out.print("Joueur 1 choisissez un type de personnage. Taper 1 pour guerrier ou 2 pour magicien  : ");
		typeJoueur1 = clavier.nextInt();
		clavier.nextLine();
		
		if (typeJoueur1 == 1) {
		
		System.out.print("Joueur 1 saisir le nom de votre personnage : ");
		nomJoueur1 = clavier.nextLine();
		Guerrier joueur1 = new Guerrier(nomJoueur1);
		System.out.println("Votre personnage est un guerrier, s'appelle " + joueur1.getNom() + " et commence avec " + joueur1.getVie() + " point de vie");
		
		} else {
		
		System.out.print("Joueur 2 saisir le nom de votre personnage : ");
		nomJoueur1 = clavier.nextLine();
		Magicien joueur1 = new Magicien(nomJoueur1);
		System.out.println("Votre personnage est un magicien, s'appelle " + joueur1.getNom() + " et commence avec " + joueur1.getVie() + " point de vie");
		
		}
			
		
		clavier.close();
	}
}