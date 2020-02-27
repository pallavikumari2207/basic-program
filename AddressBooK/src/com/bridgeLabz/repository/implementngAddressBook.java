package com.bridgeLabz.repository;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.bridgeLabz.model.Person;
import com.bridgeLabz.service.AddressBooKint;
import com.google.gson.Gson;
import com.bridgeLabz.model.Address;

public class implementngAddressBook implements AddressBooKint {
	static Scanner scan = new Scanner(System.in);
	private static JSONObject obj = getjson();
	private static Gson gson = new Gson();
	private static JSONArray arr = (JSONArray) obj.get("address");

	@Override
	public void createNewAddressBook() {
		System.out.println("-----------------------New Address Book-----------------------");
		boolean close = false;
		while (!close) {
			System.out.println(
					"Select option: \n1.add\n2.edit\n3.delete\n4.sort by last name\n5.sort by zip\n6.print\n7.close");
			int ch = scan.nextInt();
			switch (ch) {
			case 1:
				// add person
				addPerson();
             
				break;
			case 2:
				// edit person
				editPerson();
				break;
			case 3:
				// delete person
				remove();
				break;
			case 4:
				// sort by last name

				sortByLastName();

				break;
			case 5:
				// sort by zip

				sortByZip();

				break;
			case 6:
				// close
				close = true;
				System.out.println("Closing...");
				break;
			default:
				System.out.println("Invalid option");
			}
			System.out.println("-----------------------New Address Book-----------------------");
		}
	}

	@Override
	public  void addPerson() {
		System.out.println("Add person details...");
		System.out.println("Enter mobile");
		Long mobile = scan.nextLong();
		System.out.println("Enter person first name: ");
		String fname = scan.next();
		System.out.println("Enter person last name: ");
		String lname = scan.next();
		System.out.println("Enter address Details: ");
		System.out.println("Enter address: ");
		String ladd = scan.next();
		System.out.println("Enter city: ");
		String city = (scan.next());
		System.out.println("Enter state: ");
		String state = (scan.next());

		System.out.println("Enter zip: ");
		int zip = (scan.nextInt());
		Address address = new Address(ladd, city, state, zip);
		Person person = new Person(fname, lname, mobile, address);
		String s=gson.toJson(person);
		arr.add(s);
		read(person);

		System.out.println();
		System.out.println("Person added");

	}

	@Override
	public void editPerson() {
		System.out.println("Enter Persons mobile number you want to edit:");
		Long searchMobile = scan.nextLong();
		JSONArray ref = (JSONArray) obj.get("address");
		for (int j = 0; j < ref.size(); j++) {

			String s = ref.get(j).toString();
			Person person = gson.fromJson(s, Person.class);
			if (person.getPhoneNumber() == searchMobile) {
				System.out.println("enter name:");
				person.setName(scan.next());
				System.out.println("enter lat name");
				person.setLastName(scan.next());
				System.out.println("enter city \n enter state \n enter zip");
				// System.out.println("enter new mob:");
				// person.setPhoneNumber(scan.nextLong());
				String p = gson.toJson(person);
				ref.set(j, p);
				read(person);
			}
			// else {System.out.println("no such contact found!!");}
		}
	}

	@Override
	public void remove() {
		System.out.println("Enter Persons mobile number you want to edit:");
		Long searchMobile = scan.nextLong();
		JSONArray ref = (JSONArray) obj.get("address");
		for (int j = 0; j < ref.size(); j++) {
			String s = ref.get(j).toString();
			Person person = gson.fromJson(s, Person.class);
			if (person.getPhoneNumber() == searchMobile) {
				ref.remove(j);
				read(person);
			}
		}
	}

	@Override
	public void sortByLastName() {
		JSONArray ref = (JSONArray) obj.get("address");

		Comparator<String> comp = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				Person p1 = gson.fromJson(o1, Person.class);
				Person p2 = gson.fromJson(o2, Person.class);
				return p1.getName().compareTo(p2.getName());
			}
		};

		Collections.sort(ref, comp);

		ref.forEach(a -> {
			Person p = gson.fromJson(a.toString(), Person.class);
			System.out.println(p);
		});

	}

	@Override
	public void sortByZip() {

	}

	public static JSONObject getjson() {
		JSONObject obj = null;
		try {
			FileReader file = new FileReader("addressbook.JSON");
			// obj=(JSONObject);
			JSONParser parser = new JSONParser();
			JSONObject json = (JSONObject) parser.parse(file);
			obj = json;
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		return obj;
	}

	public static void read(Person person) {
//		Gson gson=new Gson();
//       String json = gson.toJson(person);
//       obj.put("address",json);

		try {

			FileWriter file = new FileWriter("addressbook.JSON");
			file.write(obj.toJSONString());
			file.flush();
			file.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.print(obj.toJSONString());

	}

}
