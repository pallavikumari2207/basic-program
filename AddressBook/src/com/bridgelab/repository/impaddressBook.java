package com.bridgelab.repository;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.Bridgelabz.model.Address;
import com.Bridgelabz.model.Person;
import com.bridgelabs.service.AddressBook;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class impaddressBook implements AddressBook {
	Scanner scan = new Scanner(System.in);
	private static JSONObject obj = getjson();
	private static JSONArray arr = (JSONArray) obj.get("address");
	private int counter=0;
	String statename = "";
	int indexOfPerson;
	static ArrayList<Person> list = new ArrayList<Person>();
	public static void PrintPersonDetails(ArrayList<Person> list, String statename) {
		String str = "";
		str = "Person detail\n";

		System.out.println(str);
		list.forEach(i -> {
			if (!statename.isEmpty() && statename.equals(i.getAddressObj().getState())) {
				System.out.println(i.getName() + " " + i.getLastName() + " " + i.getAddressObj().getAddressLocal()
						+ " " + i.getAddressObj().getCity() + " " + i.getAddressObj().getState() + " "
						+ i.getAddressObj().getZip() + " " + i.getPhoneNumber());
			}

		});

		// persons.forEach(System.out::println);
		// return str;
	}


	@Override
	public void createNewAddressBook() {
		System.out.println("-----------------------New Address Book-----------------------");
		System.out.println("Enter state name: ");

		statename = scan.next();

		boolean isFoundState = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAddressObj().getState().equals(statename)) {
				isFoundState = true;
				break;
			}
		}
		if (!isFoundState) {

			System.out.println("->State is added<-");
			boolean close = false;

			while (!close) {
				System.out.println(
						"Select option: \n1.add\n2.edit\n3.delete\n4.sort by last name\n5.sort by zip\n6.print\n7.read\n8.close");
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
					
					try {
						deletePerson(arr);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
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
					// print

					if (counter > 0) {
						System.out.println("Printing all records...");

						impaddressBook.PrintPersonDetails(list, statename);

					} else
						System.out.println("There is no record to print...");

					break;
				case 7:
					read();
					break;
				case 8:
					// close
					close = true;
					System.out.println("Closing...");
					break;
				default:
					System.out.println("Invalid option");
				}
			}
		} else
			System.out.println("State exist please try again");

		System.out.println("-----------------------New Address Book-----------------------");


	}

	@Override
	public void addPerson() {
		System.out.println("Add person details...");
		System.out.println("Enter mobile");
		Long mobile = scan.nextLong();
		System.out.println("Enter person first name: ");
		String fname=scan.next();
		System.out.println("Enter person last name: ");
		String lname=scan.next();
		System.out.println("Enter address Details: ");
		System.out.println("Enter address: ");
		String ladd=scan.next();
		System.out.println("Enter city: ");
		String city=(scan.next());
		System.out.println("Enter state: ");
		String state=(scan.next());

		System.out.println("Enter zip: ");
		int zip=(scan.nextInt());
		Address address = new Address(ladd,city,state,zip);
		Person person =new Person(fname,lname, mobile,address);
		arr.add(person);
		read();
		
		System.out.println();
		System.out.println("Person added");
		}

	@Override
	public void editPerson() {
		if (counter > 0) {
			System.out.println("Enter Persons mobile number you want to edit:");
			Long searchMobile = scan.nextLong();
			indexOfPerson = 0;
			boolean isFoundPerson = false;
			for (int i = 0; i < list.size(); i++) {
				if (searchMobile == list.get(i).getPhoneNumber()) {
					isFoundPerson = true;
					indexOfPerson = i;
					break;
				}
			}
			if (isFoundPerson) {

				System.out.println("enter new address");
				list.get(indexOfPerson).getAddressObj().setAddressLocal(scan.next());
				System.out.println("enter new city name");
				list.get(indexOfPerson).getAddressObj().setCity(scan.next());
				System.out.println("enter new zip");
				list.get(indexOfPerson).getAddressObj().setZip(scan.nextInt());

				list.get(indexOfPerson).setPhoneNumber(searchMobile);

				System.out.println();
				System.out.println("Edit completed");

			} else
				System.out.println("No person found with this number");
		} else
			System.out.println("There is no record to edit");

	}
		public static JSONObject getjson()
		{
			JSONObject obj=null;
			try {
				FileReader file=new FileReader("AddressBook.json");
				//obj=(JSONObject);
			    JSONParser parser = new JSONParser();
			    JSONObject json = (JSONObject) parser.parse(file);
			    obj=json;
			}
			catch (IOException | ParseException e) {
				e.printStackTrace();
			}
             return obj;
		}
	

	@Override
	public void deletePerson(JSONArray arr) throws ParseException {
		if (counter > 0) {
			System.out.println("Enter Persons mobile number you want to delete:");
			boolean isFoundPerson=false;
			long Mobilesearch = scan.nextLong();
			 for (int i = 0; i < arr.size(); i++) {
				 if(Mobilesearch == ((Person) arr.get(i)).getPhoneNumber()) 
				 {  
					 isFoundPerson=true;
					 arr.remove(i);
					 }
				 }
			 if(isFoundPerson) {
				System.out.println();
				System.out.println("Delete completed");
			} else
				System.out.println("No person found with this number");
		}

	}
	
	
		
	
	@Override
	public void sortByLastName() {
		if (counter > 1) {
			System.out.println("Sorting by Last name is selected");

			for (int i = 0; i < list.size() - 1; i++) {
				for (int j = 0; j < list.size() - i - 1; j++) {

					if (list.get(j).getLastName().compareTo(list.get(j + 1).getLastName()) > 0) {
						Object temp = list.get(j);
						list.set(j, list.get(j + 1));
						list.set(j + 1, (Person) temp);

					}
				}
			}
		}
		
	}

	@Override
	public void sortByZip() {
		if (counter > 1) {
			System.out.println("Sorting by zip");

			for (int i = 0; i < list.size() - 1; i++) {
				for (int j = 0; j < list.size() - i - 1; j++) {

					if (list.get(j).getAddressObj().getZip() > list.get(j + 1).getAddressObj().getZip()) {
						Object temp = list.get(j);
						list.set(j, list.get(j + 1));
						list.set(j + 1, (Person) temp);

					}
				}
			}
		}
		else
			System.out.println("Less records to sort");

	}
		
	

	@Override
	public void openAddressBook() {
		System.out.println("-----------------------Open Address Book-----------------------");
		HashMap<String, String> map = new HashMap<>();
		for (int i = 0; i < list.size(); i++) {
			map.put(list.get(i).getAddressObj().getState(), list.get(i).getAddressObj().getState());
		}
		System.out.println("states available " + map.keySet());
		System.out.println("Enter state");
		statename = scan.next();
		boolean isFoundState = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAddressObj().getState().equals(statename)) {
				isFoundState = true;
				break;
			}
		}
		if (isFoundState) {
			System.out.println("->State is found<-");
			boolean close2 = false;

			while (!close2) {
				System.out.println(
						"Select option: \n1.add\n2.edit\n3.delete\n4.sort by last name\n5.sort by zip\n6.print\n7.quit");
				switch (scan.nextInt()) {
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
					
					try {
						deletePerson(arr);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
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
					// print
					if (counter > 0) {
						System.out.println("Printing all records...");

						impaddressBook.PrintPersonDetails(list, statename);

					} else
						System.out.println("There is no record to print...");

					break;
				case 7:
					// close
					close2 = true;
					System.out.println("Closing...");
					break;
				default:
					System.out.println("Invalid option");
				}
			}

		} else
			System.out.println("Please create new state of that name\nelse try new state name");

		System.out.println("-----------------------Open Address Book-----------------------");

	}
		


	/*
	 * @Override public void saveAs() throws FileNotFoundException {
	 * 
	 * }
	 */
	public static void read() {
//		JSONObject obj = new JSONObject();
//		Gson gson=new Gson();
//        String json = gson.toJson(list);
//        obj.put("address",json);
        
		try {

			FileWriter file = new FileWriter("AddressBook.json");
			file.write(obj.toJSONString());
			file.flush();
			file.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.print(obj.toJSONString());
		
	}


	
	


}
