package fr.karl.jeu1;

public class BoulesDeFeu extends Sort {
	private String nom;
	private int force;
	
	public BoulesDeFeu() {
		this.nom = "Boules de feu";
		this.force = 7;
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
		return "BoulesDeFeu [nom=" + nom + ", force=" + force + "]";
	}


	
}
