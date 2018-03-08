package Model;
// inconnue 
// calcul équation inconnu
public class Equation {
	
	private int nb1;
	private int nb2;
	private int x1;
	// Pour ax + b = 0
	public Equation(int nb1, int nb2, int x) {
		this.nb1 = nb1;
		this.nb2= nb2;
		this.x1 = x;
	}

	public int equation(int nb1 , int nb2, int x) {
		int result = 0;
		if (nb1 == 0) {
			if (nb2 == 0) {
				System.out.println("indéterminée");
			}else {
				System.out.println("Equation impossible")
			}
		}else { 
			System.out.println("x :" + (-nb2/nb1));
		}
		return result;
	}
}
