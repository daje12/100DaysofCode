/**Day 12*/

public class Day12 {
	public static void main(String [] args) {
		//create a new StringBuffer
		StringBuffer str = new StringBuffer("Hello");
		//append space and world
		str.append(" World!");
		System.out.println(str + "(StringBuffer)");

		//create new StringBuilder
		StringBuilder str1 = new StringBuilder("Hello");
		//append space and World
		str1.append(" World!");
		System.out.println(str + "(StringBuilder)");
	}
}