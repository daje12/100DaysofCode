/*Day 18*/
import java.util.Scanner;

public class Day18 {
	public static void main(String [] args) {
		//create scanner object
		Scanner obj = new Scanner(System.in);

		//read user (int) input
		System.out.println("Enter a positive Integer: ");
		int positiveInt = obj.nextInt();
		//ok so I noticed that the program wasn't reading my string input
		/*after nextInt() reads an integer it leaves a new line
		character, \n, in the buffer after the user presses enter
		so now I'm using another nextLine() method to consume the
		leftover newline. What a nuance.*/
		obj.nextLine();

		//call the isPrime method
		boolean isprime = isPrime(positiveInt);
		//using that methods return value output appropriate message
		if (isprime == true)
			System.out.println(positiveInt + " is prime");
		else 
			System.out.println(positiveInt + " is not prime");

		//read user (string) input
		System.out.println("Enter a word: ");
		String word = obj.nextLine();

		//call vowels method and ouput message
		int vowel = Vowels(word);
		System.out.println(word + " has " + vowel + " vowels");
	}

	private static boolean isPrime(int n) {
		//initialise flag
		int flag = 0;

		//to check a number is prime we need to check
		//if its divisible by 1 and itself only
		//I don't really get why we divide n by 2
		for (int i = 2; i <= n/2; i++) {
			if (n % i == 0) {
				flag = 1;
				break;
			}
		}

		if (flag == 0)
			return true;
		else 
			return false;
	}

	private static int Vowels(String str) {
		//initialise vowels and counter
		String vowels = "aeiou";
		int vowel = 0;

		/*So what whis does now is it loops through the letters in the
		string. Then it checks if there are any vowels in that string
		if there are no vowels in the string the method indexOf would
		return -1 so any other number means ther is a vowel*/
		for (int i = 0; i < str.length(); i++) {
			//get the character at that index
			char c = str.charAt(i);
			if (vowels.indexOf(c) != -1) {
				vowel += 1;
			}
		}
		//I'm not sure if this will work if the word has two of the same vowels
		//i was correct
		//okay great I found a new method that works
		return vowel;
	}
}