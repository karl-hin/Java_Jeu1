package fr.karl.jeu1;

public class Epee extends Arme{
	private String nom;
	private int force;
	
	public Epee() {
		this.nom = "Ep�e";
		this.force = 5;
	}
	
	public Epee(String nomEpee, int forceEpee) {
		this.nom = nomEpee;
		this.force = forceEpee;		
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
		return "Epee [nom=" + nom + ", force=" + force + "]";
	}


}
