// Lawrence Ngo
// September 5, 2017
// This is the runner class for my Calculate Library methos.
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(5));
		System.out.println(Calculate.average(5, 2));
		System.out.println(Calculate.average(5,6,7));
		System.out.println(Calculate.toDegrees(1.570795));
		System.out.println(Calculate.toRadians(90));
		System.out.println(Calculate.discriminant(3,4,5));
		System.out.println(Calculate.toImproperFrac(3,1,2));
		System.out.println(Calculate.toMixedNum(7, 2));
	}

}
