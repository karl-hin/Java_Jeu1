package fr.karl.jeu1;

import java.util.Scanner;

public class Menu {
	private Scanner clavier = new Scanner(System.in);

	public void afficherMenuAccueil() {
		int choix;
		// Scanner clavier = new Scanner(System.in);
		System.out.print(
				"Taper 1 pour jouerUnTour le jeu\n" + "Taper 2 si vous souhaiter quitter le jeu\n" + "Votre choix: ");
		choix = clavier.nextInt();
		clavier.nextLine();
		if (choix == 1) {
			playGame();
		} else if (choix == 2) {
			exit();
		}
		// clavier.close();
	}

	public Personnage choisirPersonnage() {
		String nomJoueur;
		int choix;
		Personnage joueur = null;
		System.out.print("Veuillez choisir le type de personnage\n" + "Taper 1 pour guerrier\n"
				+ "Taper 2 pour magicien\n" + "Votre choix: ");

		choix = clavier.nextInt();
		clavier.nextLine();

		if (choix == 1) {
			System.out.print("Veuillez saisir le nom de votre personnage : ");
			nomJoueur = clavier.nextLine();
			joueur = new Guerrier(nomJoueur);
			System.out.println("Votre personnage est un guerrier, s'appelle " + joueur.getNom() + ", commence avec "
					+ joueur.getVie() + " point de vie, " + joueur.getAtk() + " points d'attaque, "
					+ joueur.toString());
		} else if (choix == 2) {
			System.out.print("Veuillez saisir le nom de votre personnage : ");
			nomJoueur = clavier.nextLine();
			joueur = new Magicien(nomJoueur);
			System.out.println("Votre personnage est un magicien, s'appelle " + joueur.getNom() + ", commence avec "
					+ joueur.getVie() + " point de vie et " + joueur.getAtk() + " points d'attaque, "
					+ joueur.toString());
		}
		// clavier.close();
		return joueur;
	}

	public void playGame() {
		int positionJoueur;
		Game jouerUnTour = new Game();
		int choixRejouer = 0;
		
		do {
			choisirPersonnage();
			positionJoueur = jouerUnTour.getIndex();
			System.out.println("Vous commencez à la case: " + positionJoueur);
			while (positionJoueur < 64) {
				jouerUnTour.avancerJoueur();
				positionJoueur = positionJoueur + jouerUnTour.lancerDes();
				try {
					if (positionJoueur > 64) {
						PersonnageHorsPlateauException e = new PersonnageHorsPlateauException();
						throw e;
					}
				} catch (PersonnageHorsPlateauException error) {
					System.out.println(error.getMessage());
					positionJoueur = 64;
				}
				System.out.println("Vous êtes à la case " + (positionJoueur) + "/64");
			}
			System.out.println("Vous avez gagné!");
			choixRejouer = jouerUnTour.rejouer();
		} while (choixRejouer == 0);// fin de la boucle
	}

	public void exit() {
		int exitJoueur;
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
		// clavier.close();
	}
}