package com.bridgelabz.basicprgm;

import java.util.Scanner;
import java.util.regex.Pattern;

public class stringReplace {

	public static void main(String[] args) {
		System.out.println("enter your full name");
	Scanner scan=new Scanner(System.in);
	String name=scan.next();
	String str="Hello <<UserName>> How are you? ";
	 String[] uname = name.split(" ");
	String str1=str.replaceAll("<<UserName>>",uname[0]);
	System.out.println(str1);
	
	

	
	
	


	}

}