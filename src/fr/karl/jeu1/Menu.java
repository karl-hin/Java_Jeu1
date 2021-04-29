package fr.karl.jeu1;

import java.util.Scanner;

public class Menu {
	public void execute() {
		String nomJoueur1;
		String joueur1Guerrier1;
		int typeJoueur1;
		int exitJoueur;

		Scanner clavier = new Scanner(System.in);
		System.out.print("Choisissez un type de personnage\n" + "Taper 1 pour guerrier\n" + "Taper 2 pour magicien\n"
				+ "Taper 3 si vous souhaiter quitter le jeu\n" + "Votre choix: ");
		typeJoueur1 = clavier.nextInt();
		clavier.nextLine();

		switch (typeJoueur1) {
		case 1:

			System.out.print("Veuillez saisir le nom de votre personnage : ");
			nomJoueur1 = clavier.nextLine();
			Guerrier joueur1Guerrier = new Guerrier(nomJoueur1);
			System.out.println("Votre personnage est un guerrier, s'appelle " + joueur1Guerrier.getNom()
					+ ", commence avec " + joueur1Guerrier.getVie() + " point de vie, " + joueur1Guerrier.getAtk()
					+ " points d'attaque, " + joueur1Guerrier.toString());
			break;

		case 2:

			System.out.print("Veuillez saisir le nom de votre personnage : ");
			nomJoueur1 = clavier.nextLine();
			Magicien joueur1Magicien = new Magicien(nomJoueur1);
			System.out.println("Votre personnage est un magicien, s'appelle " + joueur1Magicien.getNom()
					+ ", commence avec " + joueur1Magicien.getVie() + " point de vie et " + joueur1Magicien.getAtk()
					+ " points d'attaque" + joueur1Magicien.toString());
			break;

		case 3:

			System.out.print("Etes-vous sûr de vouloir quitter le jeu?\n" + "Taper 1 pour oui\n" + "Taper 2 pour non\n"
					+ "Votre choix: ");

			do {
				exitJoueur = clavier.nextInt();
				clavier.nextLine();

				switch (exitJoueur) {

				case 1:
					System.out.print("Déconnexion du jeu");
					break;

				case 2:
					System.out.print("Reconnexion");
					break;

				default:
					while (exitJoueur > 2) {
						System.out.print("Taper 1 pour oui\n" + "Taper 2 pour non\n" + "Votre choix: ");
						exitJoueur = clavier.nextInt();
						clavier.nextLine();
					}
					if (exitJoueur == 1) {
						System.out.print("Déconnexion du jeu");
					} else if (exitJoueur == 2) {
						System.out.print("Reconnexion");
					}
				}

			} while (exitJoueur > 3);

			clavier.close();
		}
	}
}
