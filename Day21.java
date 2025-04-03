/*Day 21*/
import java.util.*;

public class Day21 {
	public static void main (String [] args) {
		//create new hashmap
		HashMap<Integer, String> students = new HashMap<Integer, String>();

		//add keys and values to hashmap using the put() method
		//these are the roll call numbers and names
		students.put(1, "John");
		students.put(2, "Mary");
		students.put(3, "Susan");
		students.put(4, "Max");
		students.put(5, "Anne");
		students.put(6, "Ben");

		//access a value using the get() method and refer to its key
		//and print them
		System.out.println(students.get(1));
		System.out.println(students.get(2));
		System.out.println(students.get(3));
		System.out.println(students.get(4));
		System.out.println(students.get(5));
		System.out.println(students.get(6));
		System.out.println("");

		//check if a key exists in the hashmap
		System.out.println(students.containsKey(8));

		//remove an item from the hashmap
		//refer to the key btw
		students.remove(4); 

		//print how many elements in the hashmap
		System.out.println(students.size());
		System.out.println("");

		//loop through and print name using keySet() method
		//and a for each loop
		for (int i : students.keySet()) {
			System.out.println(students.get(i));
		}
		System.out.println("");

		//same thing but using entrySet() method
		//the entry set traverses the whole entry so both the key and value
		for (Map.Entry<Integer, String> j : students.entrySet()) {
			System.out.println(j);
		}
		//this was all very cool and interesting
	}
}