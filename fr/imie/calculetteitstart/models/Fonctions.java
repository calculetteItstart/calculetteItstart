package fr.imie.calculetteitstart.models;

public class Fonctions {

	double nombre;
	char fonction;

	public double puissance(double nombre) {

		double result = 0;
		for (int i = 0; i < nombre; i++) {
			result = result * nombre;
		}

		return (result);
	}

	public Fonctions racine(double nombre, char fonction) {
		return null;

	}

	public Fonctions sinus(double nombre, char fonction) {
		return null;

	}

	public Fonctions cosinus(double nombre, char fonction) {
		return null;
	}

	public Fonctions tangente() {
		return null;
	}
}
