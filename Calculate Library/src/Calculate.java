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
		return ((operand + operand1 + operand2) / 3);

	}

	// This method accepts a double and returns a double. (radians->degrees)
	public static double toDegrees(double operand) {
		return (operand * 180 / 3.14159);
	}

	// This method accepts a double and returns a double. (degrees->radians)
	public static double toRadians(double operand) {
		return (operand * 3.14159 / 180);
	}

	// This method accepts three doubles and returns a double (provides coefficients
	// of a quadratic equation in standard form (a,b,c) returns value of
	// discriminant)
	public static double discriminant(double a, double b, double c) {
		return (b * b) - (4 * a * c);
	}

	// This methods accepts three integers and returns a string.
	public static String toImproperFrac(double a, double b, double c) {
		return (((a * c) + b) + "/" + c);
	}

	// This method converts an improper fraction into a mixed number.
	public static String toMixedNum(double a, double b) {
		double wholeNum = a / b;
		double newNumerator = a % b;
		return (wholeNum + "_" + newNumerator + "/" + b);
	}

	// This method converts a binomial multiplication into a quadratic equation.
	public static String foil(int a, int b, int c, int d, String n) {
		int first = (a * c);
		int second = (a * d) + (b * c);
		int third = (b * d);
		return (first + "n^2" + "+" + second + "x" + "+" + third);

	}

	// This method determines whether or not one integer is evenly divisible by
	// another.
	public static boolean isDivisibleBy(int num1, int num2) {
		if (num1 % num2 == 0) {
			return (true);
		} else {
			return (false);
		}
	}

	// This method returns the absolute value of the number passed.
	public static double absValue(double a) {
		if (a >= 1) {
			return (a);
		} else {
			return (a * -1.0);
		}
	}

	// This method returns the larger of the values passed.
	public static double max(double a, double b) {
		if (a > b) {
			return (a);
		} else {
			return (b);
		}
	}

	// This method returns the larger of the values passed.
	public static double max (double a, double b, double c) {
		if(a > b && a > c){
			return a;
		}else if(b > a && b > c){
			return b;
		}else{
			return c;
		}
	}
	// This method returns the smaller of the values passed.
	public static double min (double a, double b) {
		if (a >b) {
			return b;
		}else { 
			return a;	
		}
	}
	// This method rounds a double correctly to 2 decimal places and returns a double.
	public static double round2(double number){
		double x=number*1000;
		double y=x%10;
		if (y >=5){
			return (x-y+10)/1000;
		}else{
			return (x - y)/1000;
		}

	}
}
