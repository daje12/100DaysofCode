/*Day 22*/
//import stack class
import java.util.*;

public class Day22 {
	public static void main (String [] args) {
		//I've used stacks before so this is nice
		//create new stack
		Stack<String> stack = new Stack<>();

		//push items onto the stack
		stack.push("food");
		stack.push("chicken");
		stack.push("ball");
		stack.push("play");
		stack.push("act");
		stack.push("sit");

		//pop item of the stack
		System.out.println("Popped: " + stack.pop());
		//peek at the item at the top of the stack
		System.out.println("Peeked: " + stack.peek());
		//search for item in the stack and print the index
		System.out.println("Search for ball: " + stack.search("ball"));

		//initialise count variable
		int count = 0;
		//loop through stack, to count the number of items and remove items
		for (int i = 0; i < 10; i++) {
			count += 1;
			stack.pop();
			//every loop we check if the stack is empty
			//so we can loop 100 times but if the stack is empty it will always break out of the loop
			if (stack.isEmpty())
				break;
		}
		//print the number of itmes in the stack
		System.out.println("Number of items in the stack: " + count);
	}
}