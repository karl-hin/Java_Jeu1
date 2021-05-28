package fr.karl.jeu1;

public abstract class Sort implements Case{
	private String nom;
	private int force;
	
	public Sort() {
	}
	
	public Sort(String nomSort, int forceSort) {
		this.nom = nomSort;
		this.force = forceSort;
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

	public void action(Personnage p, Game game) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

