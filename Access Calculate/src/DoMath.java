// Lawrence Ngo
// September 5, 2017
// This is the runner class for my Calculate Library methods.
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
		System.out.println(Calculate.foil(2,3,6,-7, null));
		System.out.println(Calculate.isDivisibleBy(4, 2));
		System.out.println(Calculate.absValue(-2)); 
		System.out.println(Calculate.max(3, 4));
		System.out.println(Calculate.max(3,4,5));
		System.out.println(Calculate.min(6,7));
		System.out.println(Calculate.round2(2.678));
	}

}
