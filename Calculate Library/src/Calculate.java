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
		if (num2 == 0) {
			throw new IllegalArgumentException("Cannot divide by 0");
		}
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
	public static double max(double a, double b, double c) {
		if (a > b && a > c) {
			return a;
		} else if (b > a && b > c) {
			return b;
		} else {
			return c;
		}
	}

	// This method returns the smaller of the values passed.
	public static double min(double a, double b) {
		if (a > b) {
			return b;
		} else {
			return a;
		}
	}

	// This method rounds a double correctly to 2 decimal places and returns a
	// double.
	public static double round2(double number) {
		double x = number * 1000;
		double y = x % 10;
		if (y >= 5) {
			return (x - y + 10) / 1000;
		} else {
			return (x - y) / 1000;
		}

	}

	// This method raises a value to a positive integer power.
	public static double exponent(double base, int exponent) {
		if (exponent < 0) {
			throw new IllegalArgumentException("Cannot raise to an exponent less than 1");
		}
		double answer = 1;
		for (int i = 0; i < exponent; i++) {
			answer *= base;
		}
		return answer;
	}

	// This method returns the factorial of the value passed.
	public static int factorial(int a) {
		if (a < 0) {
			throw new IllegalArgumentException("Cannot find the factorial of a negative number");
		}
		int answer = 1;
		for (int i = 1; i <= a; i++) {
			answer = answer * i;
		}
		return answer;

	}

	// This method determines whether or not an integer is prime.
	public static boolean isPrime(int num1) {
		boolean prime;
		num1 = (int) absValue(num1);
		for (int i = 2; i <= num1 - 1; i++) {
			prime = Calculate.isDivisibleBy(num1, i);
			System.out.println(i);
			if (prime == true) {
				return false;
			}
		}
		return true;
	}

	// This method finds the greatest common factor of two integers.
	public static int gcf(int num1, int num2) {
		int greatestCommonFactor = 1;
		for (int i = 1; i <= num1; i++) {
			if (isDivisibleBy(num1, i) && isDivisibleBy(num2, i)) {
				greatestCommonFactor = i;
			}
		}
		return (greatestCommonFactor);
	}

	// This method returns an approximation of the square root of the value passed.
	public static double sqrt(double num1) {
		if (num1 < 0) {
			throw new IllegalArgumentException("Cannot find the square root of a negative value");
		}
		double i = 0;
		double sqrt = num1 / 2.0;
		if (num1 <= 0) {
			throw new IllegalArgumentException("Cannot square root this number");
		}
		do {
			i = sqrt;
			sqrt = (i + (num1 / i)) / 2.0;

		} while (i - sqrt != 0);
		sqrt = round2(sqrt);
		return sqrt;
	}

	//This method uses coefficients of quadratic formula to approximate real roots.
	public static String quadForm(int a, int b, int c) {
		if (discriminant(a, b, c) < 0) {
			return "No real roots";
		} else if (discriminant(a, b, c) == 0) {
			double realroot = (-b / (2 * a));
			double realrootrounded = round2(realroot);
			return "" + realrootrounded;
		} else {
			double root1 = (-b + sqrt(discriminant(a, b, c))) / (2 * a);
			double root2 = (-b - sqrt(discriminant(a, b, c))) / (2 * a);
			double roundedroot1 = round2(root1);
			double roundedroot2 = round2(root2);
			if (min(roundedroot1, roundedroot2) == roundedroot1) {
				return root1 + " and " + root2;
			} else {
				return root2 + " and " + root1;
			}
		}

	}
}
