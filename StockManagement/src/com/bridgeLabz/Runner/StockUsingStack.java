package com.bridgeLabz.Runner;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class StockUsingStack {

	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
		StackUsingLinkedList<Integer> stk = new StackUsingLinkedList<Integer>();
		Object obj = null;
		File f = new File("stock.json");
		try {
			FileReader file = new FileReader(f);
			obj = new JSONParser().parse(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		JSONObject obj1 = (JSONObject) obj;
		JSONArray arr = (JSONArray) obj1.get("company");
		int index = 0;
		System.out.println("The Company AVAILABLE:");

		for (int i = 0; i < arr.size(); i++) {
			JSONObject jo = (JSONObject) arr.get(i);
			String st = (String) jo.get("name");
			String stock = (String) jo.get("stock");
			int stockInt = Integer.parseInt(stock);
			stk.push(stockInt);
			System.out.println(st);
		}
		System.out.println("Enter company name you want to purchase share:");
		String st = scan.next();
		switch (st) {
		case "TCS":
			JSONObject jo = (JSONObject) arr.get(0);
			System.out.println("Stock Available:");
			String st1 = (String) jo.get("stock");
			System.out.println(st1);
			index = 0;

			break;
		case "Infosys":
			JSONObject jo1 = (JSONObject) arr.get(1);
			System.out.println("Stock Available:");
			String st2 = (String) jo1.get("stock");
			System.out.println(st2);
			index = 1;
			;
			break;
		case "Reliance":
			JSONObject jo2 = (JSONObject) arr.get(2);
			System.out.println("Stock Available:");
			String st3 = (String) jo2.get("stock");
			System.out.println(st3);
			index = 2;
			break;
		case "Accenture":
			JSONObject jo3 = (JSONObject) arr.get(3);
			System.out.println("Stock Available:");
			String st4 = (String) jo3.get("stock");
			System.out.println(st4);
			index = 3;
			break;
		default:
			System.out.println("Company entered is wrong:");
			break;
		}
		try {
			changeValue(index, stk);
			writeValues(f, stk, obj1);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void changeValue(int index, StackUsingLinkedList<Integer> stk) throws Exception {
		  Scanner scan=new Scanner(System.in);
		System.out.println("Enter how much stock you want to purchase:");
		int n = scan.nextInt();
		int stockValue = (int) stk.valueOf(index);
		System.out.println("Value present at particular index:" + stockValue);
		int calculated = stockValue - n;
		if (calculated == 0 || calculated < 0) {
			System.out.println("STOCK HAS BEEN SOLD OUT FOR THIS COMPANY:");
			return;
		}
		if (calculated > 0) {
			stk.insertOnIndex(index, calculated);
			System.out.println("Index position value has been changed:");
		}

		System.out.println("Checking for the present stack value:");
		stk.display();
	}

	public static void writeValues(File file, StackUsingLinkedList<Integer> stk, JSONObject obj) throws Exception {
		FileWriter f = new FileWriter(file);
		JSONArray arr = (JSONArray) obj.get("company");
		for (int i = 0; i < arr.size(); i++) {
			JSONObject obj1 = (JSONObject) arr.get(i);
			obj1.replace("stock", stk.returnHead());
		}
		f.write(obj.toJSONString());
		f.close();
		System.out.println("Written in JSon File:");
	}
}
