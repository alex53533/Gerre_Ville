package com.gerreville;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		String maVille, monPays, monPresident;
		int nbHabitants, choix;
		String temp; // temp : variable temporaire pour la conversion
						// de String à int
		ArrayList<Ville> listeVille = new ArrayList<>(); // creation d'une liste
		ArrayList<Capitale> listeCapitale = new ArrayList<>();
		char sortie, sousChoix;

		Scanner clavier = new Scanner(System.in);

		// Ville ville1 = new Ville("Paris", "France", 15_000_000);
		// Ville ville2 = new Ville("Brest", "France", 300_000);
		// Ville ville3 = new Ville("Bordeaux", "France", 700_000);
		// Ville ville4 = new Ville("Toulouse", "France", 800_000);
		// Ville ville5 = new Ville("Nice", "France", 600_000);

		// Capitale capitale1 = new Capitale("Maquelcon");
		// Capitale capitale2 = new Capitale("Grohollande");

		// ville1.affDesc();
		// capitale1.affDesc();

		System.out.println("MENU :");
		do {
			System.out.println("1 - Creation de villes et capitales\n"
					+ "2 - Liste des villes et capitales\n"
					+ "3 - Capitales et villes d'un pays\n"
					+ "4 - Liste des pays\n"
					+ "5 - Je veux sortir du programme\n");

			temp = clavier.nextLine();
			choix = Integer.parseInt(temp);
			// /////////////////////////////////////////////////////////////////////////////////////////////////////////
			if (choix == 1) {
				// System.out.println("Ville (1) ou Capitale (2) ?");
				// sousChoix = clavier.nextLine().charAt(0);
				/*
				 * System.out.println("Nom de la ville : "); maVille =
				 * clavier.nextLine();
				 * 
				 * for (Ville ville : listeVille) { if
				 * (Ville.getMaVille().equals(maVille))
				 * System.out.println("Ville déjà créee"); }
				 */

				System.out.println("Nom du pays : ");
				monPays = clavier.nextLine();
				System.out.println("Nombre habitants : ");
				temp = clavier.nextLine();
				nbHabitants = Integer.parseInt(temp);
				System.out.println("Nom de la ville : ");
				maVille = clavier.nextLine();
				for (Ville ville : listeVille) {
					if (ville.nom.equals(maVille))
						System.out.println("Ville déjà créee");
				}
				System.out.println("Est ce que " + maVille
						+ " est une capitale ? (y/n)");
				sousChoix = clavier.nextLine().toLowerCase().charAt(0); // substring(0,
																		// 2);
				if (sousChoix == 'n') {
					listeVille.add(new Ville(maVille, monPays, nbHabitants));
					System.out.println("Ville créée");
				} else if (sousChoix == 'y') {
					System.out.println("Nom du président : ");
					monPresident = clavier.nextLine();

					listeCapitale.add(new Capitale(maVille, monPays,
							nbHabitants, monPresident));
					System.out.println("Capitale créée");
				}
				// //////////////////////////////////////////////////////////////////////////////////////////////////////////
			} else if (choix == 2) {
				for (Ville ville : listeVille) {
					ville.affDesc();
				}
				for (Capitale capitale : listeCapitale) {
					capitale.affDesc();
				}
			}
			// //////////////////////////////////////////////////////////////////////////////////////////////////////////
			else if (choix == 3) {
				System.out.println("Les villes :");
				for (Ville ville : listeVille) {
					System.out.println(" - " + ville.getNom());
				}
				System.out.println("Les capitales :");
				for (Capitale capitale : listeCapitale) {
					System.out.println(" - " + capitale.getNom());
				}
				// //////////////////////////////////////////////////////////////////////////////////////////////////////////
			} else if (choix == 4) {
				for (Ville ville : listeVille) {
					System.out.println(ville.getPays());
				}
			}
			System.out.println("Voulez vous sortir si oui tapez : 5");
			sortie = clavier.nextLine().charAt(0);
			// //////////////////////////////////////////////////////////////////////////////////////////////////////////
		} while (sortie != '5');
		System.out.println("Au revoir !");

		// Lecture de la liste de 2 façons :
		// for standard
		// for (int i = 0; i < listeVille.length; i++) {
		// listeVille.get(i);
		// }
		// System.out.println("\n");
		// // for each
		// for (Ville ville : listeVille) {
		// ville.affDesc();
		// }

	}
}
