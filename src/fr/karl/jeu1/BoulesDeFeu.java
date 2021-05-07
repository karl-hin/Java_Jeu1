package fr.karl.jeu1;

public class BoulesDeFeu extends Case {
	private String nom;
	private int force;
	
	public BoulesDeFeu() {		
	}
	
	public BoulesDeFeu(String nomBoulesDeFeu, int forceBoulesDeFeu) {
		nom = nomBoulesDeFeu;
		force = forceBoulesDeFeu;		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	@Override
	public String toString() {
		return "Sort [nom=" + nom + ", force=" + force + "]";
	}	
	
}
