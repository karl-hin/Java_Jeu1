package fr.karl.jeu1;

import java.util.Arrays;

public class Plateau {

	private int[] Case;
	private int index;
	

	public Plateau() {
		Case = new int[64];
		index = 1;		
	}	

	public int[] getCase() {
		return Case;
	}

	public void setCase(int[] case1) {
		Case = case1;
	}
	

	public int getI() {
		return index;
	}

	public void setI(int i) {
		this.index = i;
	}

	@Override
	public String toString() {
		return "Plateau [Case=" + Arrays.toString(Case) + ", index=" + index + "]";
	}
	



}
