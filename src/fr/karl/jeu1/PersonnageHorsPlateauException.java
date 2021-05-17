package fr.karl.jeu1;

/**
 * @author karlo
 * <b> la class PersonnageHorsPlateauException hérite de la class Exception </b>
 */
public class PersonnageHorsPlateauException extends Exception {
	/**
	 * constructeur par défault qui renvoit l'exeption
	 */
	public PersonnageHorsPlateauException() {
		super("hors plateau");
	}
}
