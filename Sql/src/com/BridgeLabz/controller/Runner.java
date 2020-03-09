package com.BridgeLabz.controller;

import com.bridgelabz.Repository.SqlQueries;
import com.bridgelabz.service.User;
import com.bridgelabz.service.UserImp;

public class Runner {
public static void main(String[] args) {
	User ref=new UserImp ();
	if(ref.createUser()) {
		System.out.println("successfully saved");
	}
	System.out.println("error");
}
}
