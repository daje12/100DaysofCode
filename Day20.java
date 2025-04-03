/*Day 20*/

//import the utility classes
import java.util.*;

public class Day20 {
	public static void main(String [] args) {
		//create set object
		Set<String> hashset = new HashSet<String>();

		//add items to the hashset
		hashset.add("Bonjour");
		hashset.add("apple");
		hashset.add("water");
		hashset.add("year");
		hashset.add("twenty");
		//print set
		System.out.println(hashset);
		System.out.println("");

		//declare string
		String check = "chicken";

		//check if string exists using contain() method
		System.out.println("Set contains " + check + ":" + hashset.contains(check));
		System.out.println("");

		//remove element from set
		hashset.remove("year");
		System.out.println(hashset);
		System.out.println("");
		//print size of set
		System.out.println("Set size: " + hashset.size());

		System.out.println("");
		//iterate through set using for each loop
		for (String i : hashset) {
			System.out.println(i);
		}
		System.out.println("");

		//remove all the values from the set
		//I was like I doubt theres a remove all method
		//checked the api and there is
		//never mind the clear() method removes all the elements
		//the removeAll() method would probable work
		//but I don't understand the parameter it takes
		hashset.clear();
		//print empty set
		System.out.println(hashset);
	}
}