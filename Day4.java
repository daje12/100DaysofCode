/**Day 4*/

import java.util.Scanner;

public class Day4 {
	public static void main(String[] args) {
		//declare integers
		int num1 = 8;
		int num2 = 18;

		//perform basic arithmetic operations and print results
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println((double) num1/num2);
		System.out.println(num1 * num2);

		/**It works to just print them out however it prints integers by default.
		 * You can type cast the values in the print statements. 
		 * I don't know if this is good coding practice though.*/ 

		System.out.println("");

		//area is a non static method so it can not be referenced from the
		//static main method, so I had to make it static also
		double area = area();

		//use the printf to format double and float values
		//Use the %f specifier in the text string, precede the letter f with a 
		//decimal and number to specify precision
		System.out.printf("Area = %.2f", area);
	}

	private static double area() {
		//create new scanner object
		Scanner obj = new Scanner(System.in);

		//prompt user for length and width
		System.out.println("Enter length and width of rectangle: ");

		//declare and assign variable
		double length = obj.nextDouble();
		double width = obj.nextDouble();
		//calculate area
		double area = length * width;

		return area;
	}
}