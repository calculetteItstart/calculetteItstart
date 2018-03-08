package controller;

public class Operation {

	
	public double Operations (String signe, double nb1, double nb2) {
		double result = 0;
		switch(signe) {
		case"+":
			result = nb1+nb2;
			break;
		case"-":
			result = nb1-nb2;
			break;
		case"*":
			result = nb1*nb2;
			break;
		case"/":
			result = nb1/nb2;
			break;
		case"%":
			result = nb1%nb2;
			break;
		}
		return result;
	}
}

