package fr.imie.calculetteitstart.models;

public class Fonctions {

	public double ln(double nb) {
		double result = Math.log(nb);
		return result;
	}

	public double exp(double nb) {
		double result = Math.exp(nb);
		return result;
	}

	public double log(double nb) {
		double result = Math.log(nb) / Math.log(10);
		return result;
	}

	public double puissance(double nb) {
		return (Math.pow(nb, nb));
	}

	public double racine(double nb) {
		return (Math.sqrt(nb));
	}

	public double sinus(double nb) {
		return (Math.sin(nb));
	}

	public double cosinus(double nb) {
		return (Math.cos(nb));
	}

	public double tangente(double nb) {
		return (Math.tan(nb));
	}
}
