/**Day 15*/
import java.util.*;

public class Day15 {
	public static void main(String [] args) {
		//create an arraylist
		ArrayList<String> weekdays = new ArrayList<String>();

		//add elements to arraylist
		weekdays.add("Monday");
		weekdays.add("Tuesday");
		weekdays.add("Wednesday");
		weekdays.add("Thursday");
		weekdays.add("Friday");
		weekdays.add("Saturday");
		weekdays.add("Sunday");

		//loop through and print the array list
		//lets use a for each loop
		//turns out you can just print an arraylist no need for loop
		System.out.println(weekdays);

		//oke so I was going to use a loop to sort the list
		//alphebetically
		/*But apparently there are methods that are part of the
		library which can be used to sort this*/
		weekdays.sort((a, b) -> {return 1 * a.compareTo(b);});

		System.out.println(weekdays);

		//now in reverse alphabetical order
		weekdays.sort((a, b) -> {return -1 * a.compareTo(b);});

		System.out.println(weekdays);

		//create scanner object
		Scanner obj = new Scanner(System.in);
		//take character input
		System.out.println("Enter a character: ");
		/*when I tested it I noticed it didn't remove the day from the list
		because I inputed the letter as lowercase so the code remains dynamic regardless
		of who's working on it or if the list changes I made sure the input was
		converted to upper case no matter what using string manipulation*/
		String character = obj.nextLine().toUpperCase();

		ArrayList<String> edited = removed(weekdays, character);

		System.out.println(edited);
	}

	private static ArrayList<String> removed(ArrayList<String> list, String character) {
		//for loop to loop through entire arraylist
		for (int i = 0; i < list.size(); i++) {
			//if that item starts with the letter it should be removed
			//however currently it only removes one item even if there ate 2 that need to be removed
			if (list.get(i).startsWith(character) == true)
				list.remove(i);
		}
		//for now ima just use another for loop to achieve this
		//but I'll look for a more efficient method later
		for (int i = 0; i < list.size(); i++) {
			//if that item starts with the letter it should be removed
			//however currently it only removes one item even if there ate 2 that need to be removed
			if (list.get(i).startsWith(character) == true)
				list.remove(i);
		}
		//yea I was right the second for loop worked but in theory it should only require one

		return list;
	}
}