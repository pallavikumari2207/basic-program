package com.blz.functional;

import java.util.Scanner;

public class bintodec {
	public static void main(String [] args)
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("binary input");
	int[] arr=new int[4];
	int dec=0;
	for(int i=0;i<4;i++)
	{
		 arr[i]=scan.nextInt(); 
	}
	for (int i=0;i<4;i++)
	{
		System.out.println(arr[i]);
	}
   for(int i=0;i<4;i++)
   {
	dec=(int) (dec+(Math.pow(2, i)*arr[i]));   
   }
   System.out.println(dec);
	}
}
