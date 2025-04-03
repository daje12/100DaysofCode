/*Day 23*/
//import queue interface and LinkedList class
import java.util.*;

public class Day23 {
	public static void main (String [] args) {
		//create queue using linkedlist
		Queue<String> queue = new LinkedList<>();

		//add items to the queue
		queue.add("hello");
		queue.add("nice");
		queue.add("meet");
		queue.add("you");
		queue.add("Mrevilguy");
		queue.add("Mrsuperevilguy");

		//remove the item at the head of the queue
		System.out.println("Removed: " + queue.remove());

		//print the first element of the Queue without removing from it
		System.out.println("Peeked: " + queue.peek());

		//soooo turns out some of the methods of the collection
		//interface like size and contains can be used
		//with this implementation 
		//check if a value exists in the queue
		System.out.println("Check: " + queue.contains("you"));

		//print the size of the queue
		System.out.println("Size: " + queue.size());

		System.out.println("Initial queue: " + queue);
		//remove all values from the queue
		queue.clear();
		System.out.println("Cleared queue: "+ queue);
	}
}