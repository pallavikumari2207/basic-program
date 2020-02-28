package com.bridgeLabz.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.Bridgelabz.model.StockManagemnt;
import com.Bridgelabz.model.Transaction;
import com.bridgeLabz.repository.RepoServiceImplement;
import com.bridgeLabz.repository.RepositoryService;
import com.google.gson.Gson;

public class implstockManagement implements StockManagementint {
	Scanner scan = new Scanner(System.in);
	private static RepositoryService repo = new RepoServiceImplement();
	private JSONObject obj = repo.readFromjson();
	private JSONArray arr = (JSONArray) obj.get("stock");
	private JSONArray arr2=(JSONArray) obj.get("transaction");
	private static Gson gson = new Gson();

	@Override
	public void addstock() {
		System.out.println("enter StockName");
		String StockName = scan.next();
		System.out.println("stockShare");
		int stockShare = scan.nextInt();
		System.out.println("sharePrice");
		int sharePrice = scan.nextInt();
		StockManagemnt stock = new StockManagemnt(StockName, stockShare, sharePrice);
		String s = gson.toJson(stock);
		arr.add(s);
		save();
		 display();

	}

	@Override
	public void getTotalPriceByName() {
		double totalAccount = 0;
		for (int j = 0; j < arr.size(); j++) {
			String s = arr.get(j).toString();
			StockManagemnt stock = gson.fromJson(s, StockManagemnt.class);
			totalAccount = totalAccount + stock.totalStockPrice();
			System.out.println("value of stock of" + stock.getStockName() + ":" + totalAccount);

		}
	}

	@Override
	public void display() {
		
		for (int j = 0; j < arr.size(); j++) {
			String s = arr.get(j).toString();
			StockManagemnt stock = gson.fromJson(s, StockManagemnt.class);
			System.out.println("stockName: " + stock.getStockName());
			System.out.println("sharePrice: " + stock.getsharePrice());
			System.out.println("stockShare: " + stock.getstockShare());
			System.out.println();
		}
	}
public void displayAfterTransaction() {
	for(int i=0;i<arr2.size();i++) {
		 String a=arr2.get(i).toString();
		 Transaction t=gson.fromJson(a,Transaction .class);
		 System.out.println("symbol:"+t.getSymbol());
		 System.out.println("status:"+ t.getStatus());
		 System.out.println("transaction date:"+t.getTrancDate());
		 System.out.println("transaction time:"+t.getTrancTime());
		 
	 }
		}

	public void save() {
		repo.writeToJson(obj);
	}

	public void buy(int stockShare, String stockName) {
		for (int j = 0; j < arr.size(); j++) {
			String s = arr.get(j).toString();
			StockManagemnt stock = gson.fromJson(s, StockManagemnt.class);
			if (stock.getStockName().equals(stockName)) {
				stock.setstockShare(stock.getstockShare() + stockShare);
				String val = gson.toJson(stock);
				arr.set(j, val);
				LocalDate today = LocalDate.now();
				LocalTime time = LocalTime.now();
				Transaction t = new Transaction(stockName, "buyed", today, time);
				String var = gson.toJson(t);
				JSONArray arr2 = (JSONArray) obj.get("transaction");
				arr2.add(var);
				System.out.println(arr);
				display();
				displayAfterTransaction() ;
				save();
			}

		}
	}
	public static LinkedList stockLinkedList() {
		RepoServiceImplement imp=new RepoServiceImplement();
		JSONObject obj=imp.readFromjson() ;
		JSONArray arr = (JSONArray) obj.get("stock");
		Gson gson = new Gson();
		 LinkedList l=new  LinkedList();
		for (int j = 0; j < arr.size(); j++) {
			String s = arr.get(j).toString();
			StockManagemnt stock = gson.fromJson(s, StockManagemnt.class);
			l.append(stock);
		}
		l.display();
		return l;
		}

	public void sell(int stock_Share, String stock_Name) {
		JSONArray ref = (JSONArray) obj.get("stock");
		for (int j = 0; j < ref.size(); j++) {
			String s = ref.get(j).toString();
			StockManagemnt stock = gson.fromJson(s, StockManagemnt.class);
			if (stock.getStockName().equals(stock_Name)) {
				if (stock.getstockShare() >= stock_Share) {
					stock.setstockShare(stock.getstockShare() - stock_Share);
					String val = gson.toJson(stock);
					LocalDate today = LocalDate.now();
					LocalTime time = LocalTime.now();
					Transaction t = new Transaction(stock_Name, "sold", today, time);
					String var = gson.toJson(t);
					JSONArray arr2 = (JSONArray) obj.get("transaction");
					arr2.set(j, var);
					ref.set(j, val);
					display();
					displayAfterTransaction();
					save();
				} else {
					System.out.println("we dont have that amount of share to be sold");
				}
			}
		}
	}
}
