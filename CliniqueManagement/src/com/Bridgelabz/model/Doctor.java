package com.Bridgelabz.model;

public class Doctor {
String name;
String id;
String specialization;
String avail;
int numberofPatient;

public int getNumberofPatient() {
	return numberofPatient;
}
public void setNumberofPatient(int numberofPatient) {
	this.numberofPatient = numberofPatient;
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
public String getSpecialization() {
	return specialization;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}
public String getAvail() {
	return avail;
}
public void setAvail(String avail) {
	this.avail = avail;
}
public Doctor(String name, String id, String specialization, String avail) {
	super();
	this.name = name;
	this.id = id;
	this.specialization = specialization;
	this.avail = avail;
}
}
