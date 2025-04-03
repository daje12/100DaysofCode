/**Day 7*/

public class Day7 {
	public static void main(String[] args) {
		//max of two numbers
		int max = Math.max(436, 969);
		System.out.println("Max of 436 & 969: " + max);

		//min of two numbers
		int min = Math.min(372, 732);
		System.out.println("Min of 372 & 732: " + min);

		//square root of a number
		//this method works for any double value but you could type cast if needed
		double squareRoot = Math.sqrt(262);
		System.out.println("Square root of 262: " + squareRoot);

		//floor and ceil of a float
		//Floor and ceil methods take doubles as parameters
		//So need to type casy to give a float
		float floorVal = (float) Math.floor(723.362);
		float ceilVal = (float) Math.ceil(372.271);
		System.out.println("Floor of 723.362: " + floorVal + " \nCeil of 372.271: " + ceilVal);

		//absolute value of a double
		double absolute = Math.abs(-327.32);
		System.out.println("Abs value of -327.32: " + absolute);

	}
}