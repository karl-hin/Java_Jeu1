package fr.karl.jeu1;

public class Massue extends Arme {
	private String nom;
	private int force;
	
	public Massue() {
		this.nom = "Massue";
		this.force = 3;
	}
	
	public Massue(String nomMassue, int forceMassue) {
		nom = nomMassue;
		force = forceMassue;		
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
		return "Massue [nom=" + nom + ", force=" + force + "]";
	}

	@Override
	public void action(Personnage p) {
		if (p instanceof Guerrier) {
			p.setAtk(p.getAtk() + this.getForce());
		} else {
			System.out.println("Dommage, la massue ne peut être à vous");
		}
		
	}


}
