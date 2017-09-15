package com.gerreville;

public class Capitale extends Ville {

	// attributs
	private String president;

	// constructeur
	public Capitale(String nom, String pays, double nbHabitants,
			String president) {
		super(nom, pays, nbHabitants);
		this.president = president;
	}

	// methodes
	@Override
	public void affDesc() {
		// super.affDesc();
		System.out.println("Le président de ma capitale est " + president);
	}

}
