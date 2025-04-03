/**Day 11*/

public class Day11 {
	public static void main(String [] args) {
		String str1 = "Hello";

		//method to get length of string
		int length = str1.length();
		System.out.println("Length of string: " + length);

		String str2 = "apple";

		//method to concatenate strings
		//I forgot I can do things without creating a variable for it first
		//but that kinda decreases readability but i'm not worried about that
		System.out.println(str1.concat(str2));

		//method to compare strings
		boolean compare = str1.equals(str2);
		if (compare == true)
			System.out.println("Strings are equal");
		else 
			System.out.println("Strings are not equal");

		//method for case conversion
		System.out.println("Lower case: " + str1.toLowerCase());
		System.out.println("Upper case: " + str1.toUpperCase());

		String str3 = " Drink ";
		//method to trim white space
		//it trims the leading and traileing white space only
		System.out.println(str3 + "->" + str3.trim());

		//method to extract substring
		System.out.println("Substring: " + str2.substring(1, 4));

		//method to split a string
		//we use regex (regular expression) to split the string by spaces or punctation
		//wait that doesn't work for a word
		//oke ima use the charAt method and a for loop
		//now that I think about it this makes reversing the string much easier
		for (int i = 0; i < str1.length(); i++) {
			System.out.println(str1.charAt(i));
		}

		//method to reverse a string
		String reverse = "";
		//don't forget the largest index is 4 not 5!!!
		for (int j = str1.length() - 1; j >= 0; j--) {
			//had to use a method to convert the char to string
			String character = String.valueOf(str1.charAt(j));
			reverse = reverse.concat(character);
		}
		System.out.println("Reverse string: " + reverse);

		//searching for a specific substring in a string
		if (str1.contains("el") == true)
			System.out.println("subtring found");
		else 
			System.out.println("subtring not found");
	}
}