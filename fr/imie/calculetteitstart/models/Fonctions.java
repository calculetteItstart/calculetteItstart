package fr.imie.calculetteitstart.models;

public class Fonctions {
	
	//log e ln
	public double Ln(double nb) {
		double result = Math.log(nb);
		return result;
	}
	
	public double Exp(double nb) {
		double result = Math.exp(nb);
		return result;
	}
	
	public double Log(double nb) {
		double result = Math.log(nb)/Math.log(10);
		return result;
	}

}
