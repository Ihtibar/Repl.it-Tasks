package OOPs1_7;

class Person {
	private String firstName;
	private String lastName;
	private int age;

	public Person() {
		firstName = "undefined";
		lastName = "undefined";
		age = -1;
	}

	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String toString() {
		String str = firstName + " | " + lastName + " | " + age;
		return str;
	}

	public void setName(String firstName) {
		this.firstName = firstName;
	}
}

public class class5 {
	
	public static void main(String[] args) {
		// I think this Task has some bugs, the xpected result appered both on this
		// console and eclipse' console , but it's keep saying unit test failed

		Person person = new Person();
		System.out.println(person.toString());

		person.setFirstName("John");
		person.setLastName("Doe");
		person.setAge(44);
		System.out.println(person.toString());

		person = new Person("Fatima", "Lee", 22);
		System.out.println(person.toString());
	}

}
