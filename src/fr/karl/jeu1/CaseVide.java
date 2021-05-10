package fr.karl.jeu1;

public class CaseVide extends Case {
	String Reponse = "Vous êtes sur une case vide";
	
	public CaseVide() {
	}
	
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

	@Override
	public void action(Personnage p) {
		System.out.println("Il ne reste plus rien sur cette case");
	}	
}
