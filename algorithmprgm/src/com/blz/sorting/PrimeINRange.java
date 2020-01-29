package com.blz.sorting;

import java.util.Scanner;

public class PrimeINRange {
	public static void main(String [] args)
	{
		System.out.println("enter lower limit");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		System.out.println("enter upper limit");
		int b=scan.nextInt();
		primenumb(a,b);
	}
	static void primenumb(int a,int b)
	{ 
		boolean flag=false;int i=a;
		for( i=a;i<(b);i++) {
			if(i==0||i==1)
				continue;}
			for(int j=2;j<b/2;j++)
			{
			if(i%j==0)
				flag=true;
			else 
				flag=false;
	}
		if(flag==true) {
			System.out.println(i);
		}
	
		}
		

}
