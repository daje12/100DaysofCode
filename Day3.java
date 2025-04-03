/**Day 3
 * One thing I find interesting is that java knows that it needs to take 3
 * inputs and by data type it knows which one is which so it is outputted 
 * correctly. More notes in notion.*/

import java.util.Scanner;

public class Day3 {
	public static void main(String[] args) {
		//create scanner object
		Scanner scannerObj = new Scanner(System.in);

		//prompt user input
		System.out.println("Enter name, age, fav number and salary: ");

		//string input
		String name = scannerObj.nextLine();
		//numerical inputs
		int age = scannerObj.nextInt();
		int faveNum = scannerObj.nextInt();
		double salary = scannerObj.nextDouble();

		//Output user input
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("fave number: " + faveNum);
		System.out.println("salary: " + salary);
	}
}