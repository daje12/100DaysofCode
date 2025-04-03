/*Day 29*/

public class Day29 {
	public static void main(String[] args) {
		//instantiate objects
		Instructor ins = new Instructor();
		User u = new User();

		//print statements to see whats going on
		System.out.println(ins.getFullname());
		System.out.println(u.getFullname());
	}
}

class User {
	//declare variables
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String city;
	private String country;

	//create constructor to intialise an user object
	//constructors must have the same name as the class
	public User() {
		id = 1;
		firstname = "David";
		lastname = "Mayo";
		email = "davidmayo@gmail.com";
		city = "Chicago";
		country = "US";
	}

	//Multiple construstors which take parameters
	public User(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public User(String email) {
		this.email = email;
	}

	public User(String firstname, String lastname, String email) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}

	//setter methods
	public void set_id(int id) {
		this.id = id;
	}
	public void set_firstname(String firstname) {
		this.firstname = firstname;
	}
	public void set_lastname(String lastname) {
		this.lastname = lastname;
	}
	public void set_email(String email) {
		this.email = email;
	}
	public void set_city(String city) {
		this.city = city;
	}
	public void set_country(String country) {
		this.country = country;
	}

	//getter methods
	public int get_id() {
		return id;
	}
	public String get_firstname() {
		return firstname;
	}
	public String get_lastname() {
		return lastname;
	}
	public String get_email() {
		return email;
	}
	public String get_city() {
		return city;
	}
	public String get_country() {
		return country;
	}

	//getter method to get full name
	public String getFullname() {
		return firstname + " " + lastname;
	}
}

class Instructor extends User {
	//declare variables
	private String qualification;
	private String coursesTaught;
	private float Salary;

	public Instructor() {
		super("Simon", "Quill", "S.Quill@gmail.com");
		qualification = "Masters Degree";
		coursesTaught = "Computer Science";
		Salary = 60000;
	}

	public String getFullname() {
		return "Prof. " + get_firstname() + " " + get_lastname();
	}
}