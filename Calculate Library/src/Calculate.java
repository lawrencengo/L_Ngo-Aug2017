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
	
	// This method accpets three doubles and returns a double.
	public static double average(double operand, double operand1, double operand2) {
		return ((operand+operand1+operand2)/3);
	}
}
