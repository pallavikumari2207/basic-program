package com.bridgelabz.basicprgm;

import java.util.Scanner;

public class factors {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter n:");
		int n =scan.nextInt();
		 while (n%2==0) 
	        { 
	            System.out.print(2 + " "); 
	            n /= 2; 
	        
	  
	     
	        for (int i = 3; i <= Math.sqrt(n); i++) 
	        { 
	        
	            while (n%i == 0) 
	            { 
	                System.out.print(i + " "); 
	                n /= i; 
	            }
	        } 
	    } 
	  
	   
	}
}


	
