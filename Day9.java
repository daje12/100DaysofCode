/**Day 9*/
import java.util.Scanner;

public class Day9 {
	public static void main(String [] args) {
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter percentage score: ");
		int score = obj.nextInt();

		int range = score/10;

		//what did I learn today...
		//make the case values as simple as possible
		/*In this case I divided the score by 10 whatever the int 
		part of the division is gets converted into a grade
		much better since you can't do direct comparison operations
		in a switch case
		This was rough and its the first day I had to use chatgpt cuz I
		couldn't be bothered to find my answer on google*/
		//I actually found the answer in the api ToT after...sigh
		switch (range) {
		case 10:
			System.out.println("Grade A");
			break;
		case 9:
			System.out.println("Grade A");
			break;
		case 8:
			System.out.println("Grade B");
			break;
		case 7:
			System.out.println("Grade C");
			break;
		case 6:
			System.out.println("Grade D");
			break;
		case 5:
			System.out.println("Grade E");
			break;
		case 4:
			System.out.println("Grade F");
			break;
		default:
			System.out.println("Grade F");
		}
	}
}