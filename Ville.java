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

	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + categorie; result = prime * result + ((nom ==
	 * null) ? 0 : nom.hashCode()); return result; }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return
	 * true; if (obj == null) return false; if (getClass() != obj.getClass())
	 * return false; Ville other = (Ville) obj; if (categorie !=
	 * other.categorie) return false; if (nom == null) { if (other.nom != null)
	 * return false; } else if (!nom.equals(other.nom)) return false; return
	 * true; }
	 */

}
