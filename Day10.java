/**Day 10*/
import java.util.Scanner;

public class Day10 {
	public static void main(String [] args) {
		//declare and initialise variables
		int j = 0;
		int k = 0;

		//create scanner object
		Scanner obj = new Scanner(System.in);

		//get user input
		System.out.println("Enter a number: ");
		int n = obj.nextInt();

		int sum1 = 0;
		//sum of ints from 1 to n
		for (int i = 0; i < n; i++) {
			sum1 += i;
		}
		System.out.println("Sum (for): " + sum1);

		int sum2 = 0;
		while (j < n) {
			sum2 += j;
			j++;
		}
		System.out.println("Sum (while): " + sum2);

		int sum3 = 0;
		do {
			sum3 += k;
			k++;
		}
		while (k < n);
		System.out.println("Sum (do while): " + sum3);
		System.out.println("");

		int evenSum = 0;
		//calculates sum of even ints
		for (int m = 0; m < n; m++) {
			if (m % 2 == 0)
				evenSum += m;
			else 
				continue;
		}
		System.out.println("Sum of even ints: " + evenSum);

		//generates random numbers between 0 & 100 until the number is divisible
		//by 5 and 7
		/*This was unneccessaraly difficult, i had to use the strict and to get 
		it to work but it doesn't meet the specification*/

		//this is my response to match the spec
		//that was easy I think I'm lazy but thank God I didn't use chatgpt
		do {
			int randnum = (int) (Math.random()*101);

			if ((randnum % 5 == 0) & (randnum % 7 == 0)) {
				System.out.println(randnum + " is divisible by 5 & 7");
				break;
			}
		}
		while (true);
	}
}