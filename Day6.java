/**Day 6*/

public class Day6 {
 	public static void main(String[] args) {
		String a = "32783";
		String b = "941.28";
		int c = 7389;
		int d = 4628;

		//string to int
		int num1 = Integer.parseInt(a);
		System.out.println("String to int: " + num1);

		//string to float
		float num2 = Float.parseFloat(b);
		System.out.println("String to float: " + num2);

		//spot the use of different classes between these 2 methods
		//int to string, method 1
		String str1 =  Integer.toString(c);
		System.out.println("int to String (1): " + str1);

		//int to String, method 2
		String str2 = String.valueOf(d);
		System.out.println("int to String (2): " + str2);
	}
}