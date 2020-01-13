package com.bridgelabz.basicprgm;

import java.util.Random;
import java.util.Scanner;

public class flipcoin {
	public static void main(String[] args) {
		System.out.println("enter number of times to flip coin");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		Random rand=new Random();
		prcent(n);
	}
	public static void prcent(int n)
	{
		int headcount=0;
		int tailcount=0;
		//System.out.println(x);
		for(int i=0;i<n;i++)
		{	Random rand=new Random();
		float x=rand.nextFloat();
		System.out.println(x);
		if(x<0.5)
		{
		headcount++;
		}
		else
		{
		tailcount++;
		}
		}
		System.out.println(headcount);
		System.out.println(tailcount);
		float percent_head=(((float)(headcount)/(float)n)*100);
		System.out.println(percent_head);
		float percent_tail=(((float)(tailcount)/(float)n)*100);
		System.out.println(percent_tail);
		}
	}
		

