package fr.karl.jeu1;

public class Magicien extends Personnage {
	private Sort sort;

	public Magicien() {
		super();
	}

	public Magicien(String magicienNom) {
		setNom(magicienNom);
	}

	public Magicien(String magicienNom,  int vie, int Atk) {
		setNom(magicienNom);
		setVie(vie);
		setAtk(Atk);
		this.sort = new Eclair();
	}

	public Sort getSort() {
		return sort;
	}

	public void setSort(Sort sort) {
		this.sort = sort;
	}

	@Override
	public String toString() {
		return "Magicien [sort=" + sort + ", getVie()=" + getVie() + ", getAtk()=" + getAtk() + "]";
	}




}
