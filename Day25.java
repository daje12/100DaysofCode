/*Day 25*/

public class Day25 {
	public static void main (String [] args) {
		//create new instance of user
		User u = new User();

		//set attributes using setter methods
		u.set_id(1);
		u.set_firstname("Tony");
		u.set_lastname("Johnson");
		u.set_email("Tjohnson@outlook.com");
		u.set_city("Bonn");
		u.set_country("Germany");

		//print infor using getter methods
		System.out.println("id: " + u.get_id());
		System.out.println("firstname: " + u.get_firstname());
		System.out.println("surname: " + u.get_lastname());
		System.out.println("email: " + u.get_email());
		System.out.println("city: " + u.get_city());
		System.out.println("country: " + u.get_country());
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
	public User() {
		id = 1;
		firstname = "David";
		lastname = "Mayo";
		email = "davidmayo@gmail.com";
		city = "Chicago";
		country = "US";
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
		return firstname + lastname;
	}
}