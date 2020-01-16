package com.bridgelabz.logicalprgm;

import java.util.Scanner;

public class coupon {
	public static int getvalue(int n)
	{
		return (int) (Math.random()*n);
	}
	public static int collect(int n)
	{
		boolean[] iscollected=new boolean[n];
		int count=0;
		int distinct=0;
		while(distinct<n)
		{
			int value=getvalue(n);
			//System.out.println(value);
			count++;
			if(iscollected[value]==false)
			{
				distinct++;
				iscollected[value]=true;
			}
		}
		return count;
			
			
		}
		
public static void main(String [] args)
{
	System.out.println("Distinct Coupon NumbeR");
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int count=collect(n);
	System.out.println(count);
	
}
}
