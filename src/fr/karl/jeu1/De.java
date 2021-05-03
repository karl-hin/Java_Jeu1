package fr.karl.jeu1;

public class De {
	
	private int NbDe;

	public De() {
		NbDe = 1;
	}
	
	public int getNbDe() {
		return NbDe;
	}

	public void setNbDe(int de) {
		NbDe = de;
	}

	@Override
	public String toString() {
		return "LancerDes [NbDe=" + NbDe + "]";
	}

	public int lancerDes() {
		int lancerDe = 0;
		lancerDe = 1 + (int) (Math.random() * 6);
		return lancerDe;
	}
}
