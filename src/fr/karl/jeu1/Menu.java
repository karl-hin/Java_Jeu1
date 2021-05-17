package fr.karl.jeu1;

import java.util.Scanner;

/**
 * @author karlo
 * <b> la classe Menu s'occupe du choix utilisateur pour lancer le jeu ou quitter </b>
 */
public class Menu {
	private Scanner clavier = new Scanner(System.in);

	/**
	 * cette méthode permet une demande utilisateur pour jouer ou quitter le jeu
	 */
	public void afficherMenuAccueil() {
		int choix;
		System.out.print(
				"Taper 1 pour jouerUnTour le jeu\n" + "Taper 2 si vous souhaiter quitter le jeu\n" + "Votre choix: ");
		choix = clavier.nextInt();
		clavier.nextLine();
		if (choix == 1) {
			playGame();
		} else if (choix == 2) {
			exit();
		}
	}

	/**
	 * cette méthode permet au joueur de choisir un personnage Guerrier ou Magicien
	 * @return le type de personnage choisit
	 */
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
			System.out.print("Veuillez saisir la vie du perso (entre 5 et 10): ");
			int inputVie = clavier.nextInt();
			System.out.print("Veuillez saisir l'attaque du perso (entre 5 et 10): ");
			int inputAtk = clavier.nextInt();
			clavier.nextLine();
			joueur = new Guerrier(nomJoueur, inputVie, inputAtk);
			System.out.println("Votre personnage est un guerrier, s'appelle " + joueur.getNom() + ", commence avec "
					+ joueur.getVie() + " point de vie, " + joueur.getAtk() + " points d'attaque, "
					+ joueur.toString());
		} else if (choix == 2) {
			System.out.print("Veuillez saisir le nom de votre personnage : ");
			nomJoueur = clavier.nextLine();
			System.out.print("Veuillez saisir la vie du perso (entre 3 et 6): ");
			int inputVie = clavier.nextInt();
			System.out.print("Veuillez saisir l'attaque du perso (entre 8 et 15): ");
			int inputAtk = clavier.nextInt();
			clavier.nextLine();
			joueur = new Magicien(nomJoueur, inputVie, inputAtk);
			System.out.println("Votre personnage est un magicien, s'appelle " + joueur.getNom() + ", commence avec "
					+ joueur.getVie() + " point de vie et " + joueur.getAtk() + " points d'attaque, "
					+ joueur.toString());
		}
		return joueur;
	}

	/**
	 * cette méthode permet des demandes utilisateur récurrentes pour le déroulé du jeu
	 * Il choisit un personnage(ou il peut quitter le jeu), il lance le dé, 
	 */
	public void playGame() {
		int positionJoueur;
		Game jouerUnTour = new Game();
		int choixRejouer = 0;
		
		do {
			Personnage joueurChoisit = choisirPersonnage();// retourne le joueur choisit
			positionJoueur = jouerUnTour.getIndexJoueur();
			System.out.println("Vous commencez à la case: " + positionJoueur);
			while (positionJoueur < jouerUnTour.getNbCase()  && joueurChoisit.getVie() > 0) {			
				positionJoueur = jouerUnTour.avancerJoueur();
				System.out.println("Vous êtes à la case " + positionJoueur + "/" + jouerUnTour.getNbCase());
				try {
					if (positionJoueur >= jouerUnTour.getNbCase()) {
						PersonnageHorsPlateauException e = new PersonnageHorsPlateauException();
						throw e;
					} else {
						joueurChoisit = jouerUnTour.interaction(joueurChoisit, positionJoueur); // je lance l'effet de la case
						System.out.println(joueurChoisit.toString());
					}
				} catch (PersonnageHorsPlateauException error) {
					System.out.println(error.getMessage());
					positionJoueur = 64;
				}				
			}
			//System.out.println("Vous avez gagné!");
			choixRejouer = jouerUnTour.rejouer();
		} while (choixRejouer == 0);// fin de la boucle
	}

	/**
	 * cette méthode permet au joueur de quitter le jeu ou de se reconnecter
	 */
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