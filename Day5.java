/**Day 5*/

public class Day5 {
	public static void main(String[] args) {
		int sumTotal = 0;
		int productTotal = 1;
		int subTotal = 100;
		double divTotal = 10000;
		double modTotal = 10000;

		//using a for loop seems most intuitive for this challenge
		for (int i = 1; i < 11; i++) {
			sumTotal += i;
			productTotal *= i;

			System.out.println("Sum total: " + sumTotal);
			System.out.println("Product total: " + productTotal);
			System.out.println(" ");
		}

		for (int j = 10; j > 0; j--) {
			subTotal -= j;
			divTotal /= j;
			modTotal %= j;

			System.out.println("Sub total: " + subTotal);
			System.out.println("Div total: " + divTotal);
			System.out.println("Mod total: " + modTotal);
			System.out.println(" ");
		}
	}
}