package fr.karl.jeu1;

public class Gobelin extends Ennemies {
	private String Nom;
	private int Vie;
	private int Atk;

	public Gobelin() {
		this.Nom = "Gobelin";
		this.Vie = 6;
		this.Atk = 1;
	}

	public Gobelin(String nomGobelin, int vieGobelin, int atkGobelin) {
		this.Nom = nomGobelin;
		this.Vie = vieGobelin;
		this.Atk = atkGobelin;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public int getVie() {
		return Vie;
	}

	public void setVie(int vie) {
		Vie = vie;
	}

	public int getAtk() {
		return Atk;
	}

	public void setAtk(int atk) {
		Atk = atk;
	}

	@Override
	public String toString() {
		return "Gobelin [Nom=" + Nom + ", Vie=" + Vie + ", Atk=" + Atk + "]";
	}

	@Override
	public void action(Personnage p) {
		int resultPersoAtk = Vie - p.getAtk();
		p.setVie(p.getVie() - Atk);
		int resultGobelinAtk = p.getVie();
		System.out.println("Combat contre un gobelin");
		System.out.println(toString());
		System.out.println("personnage attaque");
		if (resultPersoAtk > 0) {
			System.out.println("le gobelin vient de passer à " + resultPersoAtk + " de vie");
			System.out.println("le gobelin contre-attaque attaque");
		} else {
			System.out.println("Vous avez tué le gobelin");
		}
		if (resultGobelinAtk > 0) {
			System.out.println("Vous êtes à " + resultGobelinAtk + " de vie");
			System.out.println("IL S'ENFUIT!!!!!!");
		} else {
			System.out.println("Vous êtes mort");
		}
	}
}
