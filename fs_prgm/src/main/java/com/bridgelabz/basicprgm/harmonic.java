package com.bridgelabz.basicprgm;

import java.util.Scanner;

public class harmonic {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter n:");
		int n=scan.nextInt();
		  float res=(float) 1.0;
		for(int i=2;i<=n;i++)
		{    
			res=res +(float) ((float)1/(float)i);
		}
			System.out.println(res);
			
		
		
		

	}

}
