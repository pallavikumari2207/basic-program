package com.Bridgelabz.model;

public class Patient {
String name;
String id;
String mobile_number;
String age;
public Patient(String name, String id, String mobile_number, String age) {
	super();
	this.name = name;
	this.id = id;
	this.mobile_number = mobile_number;
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getMobile_number() {
	return mobile_number;
}
public void setMobile_number(String mobile_number) {
	this.mobile_number = mobile_number;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}

}
