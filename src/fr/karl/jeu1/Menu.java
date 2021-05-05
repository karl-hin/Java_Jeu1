package fr.karl.jeu1;

import java.util.Scanner;

public class Menu {
	Scanner clavier = new Scanner(System.in);

	public void afficherMenuAccueil() {
		int choix;
		// Scanner clavier = new Scanner(System.in);
		System.out
				.print("Taper 1 pour lancer le jeu\n" + "Taper 2 si vous souhaiter quitter le jeu\n" + "Votre choix: ");
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
		int rejouer;
		int playGamer;
		// Scanner clavier = new Scanner(System.in);

		do {
			Personnage joueur = choisirPersonnage();
			System.out.println(joueur);
			// début de la boucle
			System.out.println("Prêt?\n" + "Tapez 0 pour oui\n" + "Tapez 1 pour non\n" + "Votre choix: ");
			playGamer = clavier.nextInt();
			clavier.nextLine();
			while (playGamer != 0) {
				System.out.println("Prêt?\n" + "Tapez 0 pour oui\n" + "Tapez 1 pour non");
				playGamer = clavier.nextInt();
				clavier.nextLine();
			}
			// Mise en place du jeu
			Plateau gamer = new Plateau();
			De lancer = new De();

			// System.out.print("Nombre de case: " + gamer.toString());
			int positionJoueur;
			positionJoueur = gamer.getIndex();
			System.out.println("Vous commencez à la case: " + positionJoueur);

			while (positionJoueur < 64) {
				System.out.println("C'est à votre tour\n" + "Appuyer sur un chiffre pour jeter le dé ");
				playGamer = clavier.nextInt();
				clavier.nextLine();
				int resultDe;
				resultDe = lancer.lancerDes();
				System.out.println("Lancé de dé: " + resultDe);
				positionJoueur = positionJoueur + resultDe;

				// Créer exception au cas où le joueur dépasserai le nombre de case maximum. Ici
				// le cas où positionJoueur serai 65
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
			do {
				// pour rejouer
				System.out.println("Taper 0 pour rejouer\n" + "Taper 1 pour quitter");
				rejouer = clavier.nextInt();
				clavier.nextLine();
				if (rejouer != 0 && rejouer != 1) {
					System.out.println("Taper 0 pour rejouer\n" + "Taper 1 pour quitter");
				}
			} while (rejouer != 0 && rejouer != 1);
		} while (rejouer == 0);// fin de la boucle
		// clavier.close();
	}

	public void exit() {
		int exitJoueur;
		// Scanner clavier = new Scanner(System.in);

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