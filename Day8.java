/**Day 8*/

import java.util.Scanner;

public class Day8 {
	public static void main(String [] args) {
		//create new scanner object
		Scanner obj = new Scanner(System.in);

		//ask for user input
		System.out.println("Enter a number: ");

		//declare and assign variable with user input
		int num = obj.nextInt();

		//check if number is even or odd
		if (num % 2 == 0)
			System.out.println("Number is Even");
		else 
			System.out.println("Number is odd");

		System.out.println("");
		System.out.println("Enter 3 numbers: ");
		//I learnt this from like day 4 that the jave complier is clever
		//and understands how many arguments it needs to take
		int num1 = obj.nextInt();
		int num2 = obj.nextInt();
		int num3 = obj.nextInt();

		//checks which number is the greatest of the 3
		if (num1 > num2 && num1 > num3)
			System.out.println(num1 + " is the greatest");
		else if (num2 > num1 && num2 > num3)
			System.out.println(num2 + " is the greatest");
		else 
			System.out.println(num3 + " is the greatest");

		System.out.println("");
		System.out.println("Enter a year: ");

		int year = obj.nextInt();

		//checks if the year is a leap year
		if (year % 400 == 0) {
			System.out.println("The year, " + year + ", is a leap year");
		}
		else if ((year % 4 == 0) && (year % 100 == 0)) {
			System.out.println("The year, " + year + ", is not a leap year");
		}
		else if ((year % 4 == 0) || (year % 400 == 0)) {
			System.out.println("The year, " + year + ", is a leap year");
		}
	}
}