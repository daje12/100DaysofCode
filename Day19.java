/*Day 19*/


public class Day19 {
	public static void main(String [] args) {
	//random number
	System.out.println("Random number: " + Math.random());

	//random number between 0 and 50
	int randnum = (int) (Math.random()*51);
	System.out.println("Random number between 2 ints: " + randnum);

	/*So the first output will show you that Math.random() returns 
	a double which is why we type cast it for randnum*/
	}
}