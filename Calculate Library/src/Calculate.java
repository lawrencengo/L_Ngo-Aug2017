/* Lawrence Ngo
 * September 5, 2017
 * This is our home grown library that will contain various mathematical methods.
*/
public class Calculate {
	// This method takes an integer and returns its square.
	public static int square(int operand) {
		return operand * operand;
	}

	// This method takes an integer and returns its cube.
	public static int cube(int operand) {
		return operand * operand * operand;
	}

	// This method accepts two doubles and returns a double.
	public static double average(double operand, double operand1) {
		return ((operand + operand1) / 2);
	}
	
	// This method accepts three doubles and returns a double.
	public static double average(double operand, double operand1, double operand2) {
		return ((operand+operand1+operand2)/3);
		
	}
	// This method accepts a double and returns a double. (radians->degrees)
	public static double toDegrees(double operand) {
		return (operand*180/3.14159);
	}
	// This method accepts a double and returns a double. (degrees->radians)
	public static double toRadians(double operand) {
		return (operand*3.14159/180);
	}
	// This method accepts three doubles and returns a double (provides coefficients of a quadratic equation in standard form (a,b,c) returns value of discriminant)
	public static double discriminant(double a, double b, double c) {
		return (b*b)-(4*a*c);
	}
	// This methods accepts three integers and returns a string.
	public static String toImproperFrac(double a, double b, double c) {
		return (((a*c)+ b)+ "/"+c);
	}
	// This method converts an improper fraction into a mixed number.
	public static String toMixedNum(double a, double b) {
		return null;
		
	}
}


