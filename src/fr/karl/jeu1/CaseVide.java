package fr.karl.jeu1;

/**
 * @author karlo
 * <b> class CaseVide hérite de la class Case </b>
 * elle contient un seul attribut
 */
public class CaseVide implements Case {
	String Reponse = "Vous êtes sur une case vide";
	
	/**
	 * constructeur par défaut
	 */
	public CaseVide() {
	}
	
	/**
	 * @param reponse renvoie un String
	 */
	public CaseVide(String reponse) {
		Reponse = reponse;
	}

	public String getReponse() {
		return Reponse;
	}

	public void setReponse(String reponse) {
		Reponse = reponse;
	}

	@Override
	public String toString() {
		return "CaseVide [Reponse=" + Reponse + "]";
	}

	public void action(Personnage p) { //méthode hérité de la classe Case
		System.out.println("Il ne reste plus rien sur cette case"); // quand le personnage tombe sur cette case il ne se passe rien
	}

	@Override
	public void action(Personnage p, Game game) {
		// TODO Auto-generated method stub
		
	}	
}
