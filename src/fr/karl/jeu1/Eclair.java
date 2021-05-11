package fr.karl.jeu1;

public class Eclair extends Sort{
	private String nom;
	private int force;
	
	public Eclair() {
		this.nom = "Eclair";
		this.force = 2;
	}
	
	public Eclair(String nomEclair, int forceEclair) {
		this.nom = nomEclair;
		this.force = forceEclair;
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
		return "Eclair [nom=" + nom + ", force=" + force + "]";
	}

	@Override
	public void action(Personnage p) {
		if (p instanceof Magicien) {
			((Magicien)p).setSort(this);
		} else {
			System.out.println("Dommage, l'éclair ne peut être à vous");
		}		
	}

	
	
}
