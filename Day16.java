/*Day 16*/

/*To access an enum constant you use the dot syntax e.g.
weekdays day = weekdays.MONDAY;
for example
You can also use an enum in a switch case*/
public class Day16 {
	//create an enum
	//notice the enum keyword replaces the class keyword
	//also all the constants must be uppercase
	enum weekdays {
		MONDAY, TUESDAY, WEDNESDAY,
		THURSDAY, FRIDAY, SATURDAY,
		SUNDAY
	}

	public static void main(String[] args) {
		/*You can loop through an enum using the values()
		method which returns an array of all the enum constans*/
		//we'll be using a for each loop to loop through this
		for (weekdays day : weekdays.values()) {
			System.out.println(day);
		}
	}
}