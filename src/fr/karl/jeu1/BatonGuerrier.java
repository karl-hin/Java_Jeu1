package fr.karl.jeu1;

public class BatonGuerrier extends Arme{
	private String nom;
	private int force;
	
	public BatonGuerrier() {
		this.nom = "Baton";
		this.force = 0;
	}
	
	public BatonGuerrier(String nomBatonGuerrier, int forceBatonGuerrier) {
		nom = nomBatonGuerrier;
		force = forceBatonGuerrier;		
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
		return "BatonGuerrier [nom=" + nom + ", force=" + force + "]";
	}

	@Override
	public void action(Personnage p) {
		// TODO Auto-generated method stub
		
	}

}
