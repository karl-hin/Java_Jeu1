package fr.karl.jeu1;

public class LancerDes {
	
	private int De;

	public LancerDes() {
		De = 1;
	}
	
	public int getDe() {
		return De;
	}

	public void setDe(int de) {
		De = de;
	}

	@Override
	public String toString() {
		return "LancerDes [De=" + De + "]";
	}

	public int lancerDes() {
		int lancerDe = 0;
		lancerDe = 1 + (int) (Math.random() * 6);
		return lancerDe;
	}
}
