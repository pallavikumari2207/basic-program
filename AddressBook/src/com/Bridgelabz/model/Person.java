package com.Bridgelabz.model;

public class Person {
	private String name;
	private String LastName;
	private long PhoneNumber;
	private Address addressObj;
	
	public Person(String name, String lastName, long phoneNumber, Address addressObj) {
		super();
		this.name = name;
		LastName = lastName;
		PhoneNumber = phoneNumber;
		this.addressObj = addressObj;
	}
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
	public double getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public Address getAddressObj() {
		return addressObj;
	}

	public void setAddressObj(Address addressObj) {
		this.addressObj = addressObj;
	}
	@Override
	public String toString() {
		return ("person [ name ="+ name +",LastName=" + LastName +",PhoneNumber="+PhoneNumber+"]");	
	}
	
}
 
	  
	  
	
	


