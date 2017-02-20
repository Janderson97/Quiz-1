package pkg;

public class Calc {

	private double rating(double att, double comp, double yds, double td, double ints) {
	    if (att == 0) return 0;
	    double a = (comp / att - 0.3) * 5;
	    double b = (yds / att - 3) * 0.25;
	    double c = (td / att) * 20;
	    double d = 2.375 - (ints / att * 25);
	    double QBRating = ((a+b+c+d) / 6) * 100;
	    System.out.printf("QB Rating is " + QBRating);
	}
}