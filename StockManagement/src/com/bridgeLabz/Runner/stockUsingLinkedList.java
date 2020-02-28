package com.bridgeLabz.Runner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.Bridgelabz.model.StockManagemnt;
import com.bridgeLabz.repository.RepoServiceImplement;
import com.bridgeLabz.service.LinkedList;
import com.bridgeLabz.service.implstockManagement;
import com.google.gson.Gson;

public class stockUsingLinkedList {
	public LinkedList stockLinkedList() {
	//public static void main(String[] args) {
	RepoServiceImplement imp=new RepoServiceImplement();
	JSONObject obj=imp.readFromjson() ;
	JSONArray arr = (JSONArray) obj.get("stock");
	Gson gson = new Gson();
//	implstockManagement sm=new implstockManagement();
//    sm.addstock();
	 LinkedList l=new  LinkedList();
	for (int j = 0; j < arr.size(); j++) {
		String s = arr.get(j).toString();
		StockManagemnt stock = gson.fromJson(s, StockManagemnt.class);
		l.append(stock);
	}
	return l;
	}
	}


