package com.gerreville;

public class Ville {

	// Attributs
	protected String nom, pays;
	protected double nbHabitants;
	private char categorie;

	// Constructeurs
	public Ville() {
		// System.out.println("Objet créé");
	}

	public Ville(String nom, String pays, double nbHabitants) {
		this.nom = nom;
		this.pays = pays;
		this.nbHabitants = nbHabitants;
	}

	// Methodes
	private char categorie() {

		if (nbHabitants <= 0)
			categorie = '?';
		else if (nbHabitants < 50_000)
			categorie = 'A';
		else if ((nbHabitants < 50_000) && (nbHabitants > 200_000))
			categorie = 'B';
		else if ((nbHabitants < 200_000) && (nbHabitants > 1_000_000))
			categorie = 'C';
		else
			categorie = 'D';
		return categorie;

	}

	public void affDesc() {
		categorie();
		System.out.println(nom + " est une ville de " + pays + " de categorie "
				+ categorie + " ( " + nbHabitants + " habitants)");
	}

	// Setter & getter
	public String getNom() {
		return nom;
	}

	public String getPays() {
		return pays;
	}

	public double getNbHabitants() {
		return nbHabitants;
	}

	// Accesseurs & mutateurs

}
