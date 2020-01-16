package com.bridgelabz.logicalprgm;

import java.util.Scanner;

public class gambler {
	public static void main(String []args)
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter stake");
	int stake =scan.nextInt();
	System.out.println("enter goal");
	int goal=scan.nextInt();
	System.out.println("enter trials");
	int trials=scan.nextInt();
	int cash=stake;
	int bets=0;
	int wins=0;
	for(int t=0;t<trials;t++)
	{ 
		while(cash>0 && cash<goal)
		{
			if(Math.random()<0.5)
				{
				//System.out.println("its a win");
				cash++;
				wins++;
				}
			else
			{	cash--;}bets++;
		}
		
	}
	System.out.println("number of wins is"+wins);
	System.out.println("number of bets"+bets);
	System.out.println("cash is"+cash);
	}
}
