package fr.karl.jeu1;

public class BatonMage extends Sort {
	private String nom;
	private int force;
	
	public BatonMage() {
		this.nom = "Baton";
		this.force = 0;
	}
	
	public BatonMage(String nomBatonMage, int forceBatonMage) {
		nom = nomBatonMage;
		force = forceBatonMage;		
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
		return "BatonMage [nom=" + nom + ", force=" + force + "]";
	}

	@Override
	public void action(Personnage p) {
		// TODO Auto-generated method stub
		
	}

}
