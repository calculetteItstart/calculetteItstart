package fr.imie.calculetteitstart.models;

public class Fonctions {

	double nombre;

	public double puissance() {
		return (Math.pow(nombre, nombre));
	}

	public double racine() {
		return (Math.sqrt(nombre));
	}

	public double sinus() {
		return (Math.sin(nombre));
	}

	public double cosinus() {
		return (Math.cos(nombre));
	}

	public double tangente() {
		return (Math.tan(nombre));
	}
}