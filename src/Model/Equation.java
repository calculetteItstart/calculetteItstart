package Model;
// inconnue 
// calcul �quation inconnu
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
				System.out.println("ind�termin�e");
			}else {
				System.out.println("Equation impossible")
			}
		}else { 
			System.out.println("x :" + (-nb2/nb1));
		}
		return result;
	}
}

/* r�el a, b
�crire "R�solution de ax + b = 0"
�crire "Introduisez a:"
lire a
�crire "Introduisez b:"
lire b
si a=0 alors si b=0 alors  �crire "Equation ind�termin�e."
             sinon  �crire "Equation impossible."
             fsi
sinon  �crire "x = ", -b/a
fsi
 PROGRAM Eq_1er_degre;
VAR a, b : REAL;
BEGIN
WRITELN('R�solution de ax + b = 0');
WRITE('Introduisez a: ');
READLN(a);
WRITE('Introduisez b: ');
READLN(b);
IF a=0 THEN IF b=0 THEN WRITELN('Equation ind�termin�e.')
            ELSE WRITELN('Equation impossible.')
ELSE WRITELN('x = ', -b/a:5:2)
END.

*/ 