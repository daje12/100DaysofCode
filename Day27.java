/*Day 27*/

public class Day27 {
	public static void main (String [] args) {
		//instantiate objects
		Instructor ins = new Instructor();
		Student stu = new Student();

		//print statements to see whats going on
		System.out.println("Instructor: " + ins.qualification + ", " + ins.coursesTaught + ", " + ins.Salary);

		System.out.println("Student: " + stu.registeredCourses + ", " + stu.grade + ", " + stu.joiningYear);
	}
}

class User {
	//declare variables
	protected int id;
	protected String firstname;
	protected String lastname;
	protected String email;
	protected String city;
	protected String country;

	//create constructor to intialise an user object
	//constructors must have the same name as the class
	public User(int id, String firstname, String lastname, String email, String city, String country) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.city = city;
		this.country = country;
	}

	//instead of using getter and setter methods I'm going to use a single
	//constructor method
}

class Instructor extends User {
	//declare variables
	String qualification;
	String coursesTaught;
	int Salary;

	public Instructor() {
		super(1, "Simon", "Quill", "S.Quill@gmail.com", "London", "England");
		qualification = "Masters Degree";
		coursesTaught = "Computer Science";
		Salary = 60000;
	}
}

class Student extends User {
	String registeredCourses;
	int grade;
	int joiningYear;

	public Student() {
		super(2, "Kiara", "Spill", "ks@gmail.com", "London", "England");
		registeredCourses = "Computer Science";
		grade = 10;
		joiningYear = 2023;
	}
}

