package fr.karl.jeu1;

public abstract class Arme extends Case{
	private String nom;
	private int force;
	
	public Arme() {
	}
	
	public Arme(String nomArme, int forceArme) {
		this.nom = nomArme;
		this.force = forceArme;
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
		return "Arme [nom=" + nom + ", force=" + force + "]";
	}
	
}
