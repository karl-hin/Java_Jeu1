package fr.karl.jeu1;
/*
import java.util.Scanner;

public class Menu {
	public void execute() {
		String nomJoueur1;
		int typeJoueur1;
		int exitJoueur;
		int playGamer;

		Scanner clavier = new Scanner(System.in);
		System.out.print("Choisissez un type de personnage\n"
				+ "Taper 0 pour guerrier\n" + "Taper 1 pour magicien\n"
				+ "Taper 2 pour lancer le jeu\n" + "Sinon\n"
				+ "Taper 3 si vous souhaiter quitter le jeu\n"
				+ "Votre choix: ");
		typeJoueur1 = clavier.nextInt();
		clavier.nextLine();

		switch (typeJoueur1) {

		// Jouer au jeu
		case 0:

			System.out.print("Veuillez saisir le nom de votre personnage : ");
			nomJoueur1 = clavier.nextLine();
			Guerrier joueur1Guerrier = new Guerrier(nomJoueur1);
			System.out.println("Votre personnage est un guerrier, s'appelle " + joueur1Guerrier.getNom()
					+ ", commence avec " + joueur1Guerrier.getVie() + " point de vie, " + joueur1Guerrier.getAtk()
					+ " points d'attaque, " + joueur1Guerrier.toString());

			break;

		case 1:

			System.out.print("Veuillez saisir le nom de votre personnage : ");
			nomJoueur1 = clavier.nextLine();
			Magicien joueur1Magicien = new Magicien(nomJoueur1);
			System.out.println("Votre personnage est un magicien, s'appelle " + joueur1Magicien.getNom()
					+ ", commence avec " + joueur1Magicien.getVie() + " point de vie et " + joueur1Magicien.getAtk()
					+ " points d'attaque, " + joueur1Magicien.toString());

			break;

		case 2:
			int rejouer;

			do { // début de la boucle
				System.out.print("Prêt?\n" + "Tapez 0 pour oui\n" + "Tapez 1 pour non\n" + "Votre choix: ");
				playGamer = clavier.nextInt();
				while (playGamer != 0) {
					System.out.print("Prêt?\n" + "Tapez 0 pour oui\n" + "Tapez 1 pour non");
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
				do { // pour rejouer
					System.out.println("Taper 0 pour rejouer\n" + "Taper 1 pour quitter");
					rejouer = clavier.nextInt();
					if (rejouer != 0 && rejouer != 1) {
						System.out.println("Taper 0 pour rejouer\n" + "Taper 1 pour quitter");
					}
				} while (rejouer != 0 && rejouer != 1);
			} while (rejouer == 0);// fin de la boucle

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
*/