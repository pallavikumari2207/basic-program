
package com.bridgelabz.service;

import java.util.Scanner;

import com.Bridgelabz.model.Student;
import com.bridgelabz.Repository.SqlQueries;

public class UserImp implements User {
   Scanner scan=new Scanner(System.in);
   private SqlQueries repo= new SqlQueries();  
	@Override
	public  boolean createUser() {
		System.out.println("enter name");
		String name=scan.next();
		System.out.println("enter id");
		int ID=scan.nextInt();
		System.out.println("enter dept");
		String dept=scan.next();
		Student S=new Student(name,ID,dept);
		int status = repo.save(S);
		if(status>0)
			return true;
		return false;
		
	}
	
	}
