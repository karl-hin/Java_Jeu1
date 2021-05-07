package fr.karl.jeu1;

public class Eclair extends Case{
	private String nom;
	private int force;
	
	public Eclair() {		
	}
	
	public Eclair(String nomEclair, int forceEclair) {
		nom = nomEclair;
		force = forceEclair;		
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
