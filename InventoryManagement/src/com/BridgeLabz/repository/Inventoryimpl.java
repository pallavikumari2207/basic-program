package com.BridgeLabz.repository;

import java.awt.Menu;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.BridgeLabz.model.InvenntoryBin;
import com.blz.service.InventoryInterface;
import com.google.gson.Gson;

public class Inventoryimpl implements InventoryInterface {
	static Scanner scan = new Scanner(System.in);
	private static JSONObject obj = getjson();
	private static Gson gson = new Gson();
	private static JSONArray arr = (JSONArray) obj.get("inventory");

	public static JSONObject getjson() {
		JSONObject obj = null;
		try {
			FileReader file = new FileReader("Inventory.json");
			// obj=(JSONObject);
			JSONParser parser = new JSONParser();
			JSONObject json = (JSONObject) parser.parse(file);
			obj = json;
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		return obj;
	}

	public static void main(String[] args) {
		System.out.println(getjson());
		String key = scan.next();
		// System.out.println(total(key) );
	}

	@Override
	public void addinventory() {
		System.out.println("key:");
		String key = scan.next();
		System.out.println("enter weight:");
		int weight = scan.nextInt();
		System.out.println("enter price:");
		int price = scan.nextInt();
		InvenntoryBin menu = new InvenntoryBin(key, weight, price);
		String s = gson.toJson(menu);
		arr.add(s);
		read();
		System.out.println();
		display(menu);
	}


	  public void display(InvenntoryBin menu){
      getjson();
	  JSONArray ref = (JSONArray)obj.get("inventory");
	  for (int j = 0; j < ref.size(); j++) {
		 String s = ref.get(j).toString();
		 menu= gson.fromJson(s,InvenntoryBin.class);
	  System.out.println("item: "+menu.getKey());
	  System.out.println("price: "+menu.getPrice());
	  System.out.println("weight: "+menu.getWeight());
	  System.out.println();
	  
	  } }
	 
	@Override
	public void totalPrice(String key) {
		JSONArray ref = (JSONArray) obj.get("inventory");
		System.out.println("enter amount");
		int n = scan.nextInt();
		for (int j = 0; j < ref.size(); j++) {
			String s = ref.get(j).toString();
			InvenntoryBin menu = gson.fromJson(s, InvenntoryBin.class);
			if ((menu.getKey()).equals(key)) {

				System.out.println("total" + (menu.getPrice() * n));
			}
			read();
		}
	}

	@Override
	public void inventoryTotal() {
		double grandTotal = 0;
		JSONArray ref = (JSONArray) obj.get("inventory");
		for (int j = 0; j < ref.size(); j++) {
			String s = ref.get(j).toString();
			InvenntoryBin menu = gson.fromJson(s, InvenntoryBin.class);
			System.out.println("menu.total" + menu.getTotal());
			System.out.println(grandTotal + menu.getTotal());
		}
	}

	public static void read() {
		try {

			FileWriter file = new FileWriter("Inventory.json");
			file.write(obj.toJSONString());
			file.flush();
			file.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	//	System.out.print(obj.toJSONString());

	}
//	public static total(String key)
//	{
//		JSONArray ref = (JSONArray) obj.get("inventory");
//		for (int j = 0; j < ref.size(); j++) {
//			String s = ref.get(j).toString();
//			 InvenntoryBin menu= gson.fromJson(s,  InvenntoryBin.class);
//			if  (InvenntoryBin.getKey()==key) {
//				System.out.println("total"+menu.getTotal());
//			}}
//	}

}
