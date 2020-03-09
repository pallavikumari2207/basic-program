package com.Bridgelabz.model;

public class Student {
String name;
int ID;
String dept;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public Student(String name, int iD, String dept) {
	super();
	this.name = name;
	ID = iD;
	this.dept = dept;
}
@Override
public String toString() {
	return "Student [name=" + name + ", ID=" + ID + ", dept=" + dept + "]";
}

}
