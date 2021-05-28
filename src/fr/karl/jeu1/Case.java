package fr.karl.jeu1;

/**
 * @author karlo
 * <b> class Case est parent de la classe Arme, class Sort et class Ennemies </b>
 */
public interface Case {
	/**
	 * @param p c'est le personnage typé par la class Personnage
	 * @param game 
	 */
	public void action(Personnage p, Game game); // cette méthode sera utilisée pour les interactions du personnage avec les armes, potions ou ennemis en fonction du jeu en cours	
}
