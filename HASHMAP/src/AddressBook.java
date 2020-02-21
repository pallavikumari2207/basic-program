import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;



public class AddressBook {
	static Scanner scan = new Scanner(System.in);
	private static JSONObject obj = getjson();
	private static Gson gson=new Gson();
	private static JSONArray arr = (JSONArray) obj.get("address");
	public static void main(String[] args) {
		//int ch=scan.nextInt();
		boolean close=false;
		while(!close)
		{System.out.println("enter choice");
			int ch=scan.nextInt();
		switch(ch)
		{
		case 1:System.out.println("add person");
		  addPerson();
		  break;
		case 2:System.out.println("edit person");
		edit();
		break;
		case 3: close=true;
			return;
			default : System.out.println("no more operation");
		}
		
	}
	}
	public static void edit() {
		System.out.println("Enter Persons mobile number you want to edit:");
		Long searchMobile = scan.nextLong();
		JSONArray ref=(JSONArray) obj.get("address");
		for (int j = 0; j < ref.size(); j++) {
			
			String s=ref.get(j).toString();
			Person person=gson.fromJson(s,Person.class);
			if(person.getPhoneNumber()==searchMobile )
			{
				person.setName(scan.next());
				person.setLastName(scan.next());
				person.setPhoneNumber(scan.nextLong());
				String p=gson.toJson(person);
				ref.set(j,p);
				read();
			}
			else {System.out.println("no such contact found!!");}
		}
	}
	public static void remove() {
		
	}
	public static void addPerson() {
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
		Person person =new Person(fname,lname, mobile);
		String ref=gson.toJson(person);
		arr.add(ref);
		read();
		
		System.out.println();
		System.out.println("Person added");
		}

	public static void read() {	
		try {

			FileWriter file = new FileWriter("AddressBook.json");
			file.write(obj.toJSONString());
			file.flush();
			file.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
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
	
}

