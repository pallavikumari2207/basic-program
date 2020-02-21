
public class Person {
	private String name;
	private String LastName;
	private long PhoneNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	public Person(String name, String lastName, long phoneNumber) {
		super();
		this.name = name;
		LastName = lastName;
		PhoneNumber = phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", LastName=" + LastName + ", PhoneNumber=" + PhoneNumber + "]";
	}
	

}
