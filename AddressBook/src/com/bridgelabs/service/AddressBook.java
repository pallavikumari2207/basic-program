package com.bridgelabs.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;

public interface AddressBook {
	

	void createNewAddressBook();

	void addPerson();

	void editPerson();

	//void deletePerson();

	void sortByLastName();

	void sortByZip();

	void openAddressBook();

	void deletePerson(JSONArray arr) throws ParseException;

	//void deletePerson(JSONArray arr) throws ParseException;
	

	//void saveAs() throws FileNotFoundException;

}
