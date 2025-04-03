/**Day 13*/

public class Day13 {
	public static void main(String [] args) {
		//declare and initialise array of ints
		int [] nums = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;

		//loop through arrar and caculate average
		//so just a note the length of arrays is not a method so its just .length
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}

		int average = sum / nums.length;
		System.out.println("Average: " + average);

		//declaring and allocating space to an array
		int [] intArray = new int[nums.length];
		int k = nums.length - 1;

		System.out.println("");
		//lets try using a for each loop today
		for (int j : nums) {
			//now we need to initialise the elements in the array
			intArray[k] = j;
			k--;
		}
		for (int m : intArray) {
			System.out.println(m);
		}

		//why does it print 0 first???
		//its because I didn't fully understand how to a for each loop worked
		//I don't need to specifiy nums[j] because thats the logic
		//specified in the loop 
	}
}