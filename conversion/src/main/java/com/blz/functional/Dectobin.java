package com.blz.functional;

import java.util.Scanner;

public class Dectobin {
public static void main(String[] ags)
{   //int r=0;
	int [] rem=new int[8];
Scanner scan= new Scanner(System.in);
System.out.println("enter the number");
int n= scan.nextInt();
//btd(n);
int [] arr=new int [8];
arr=btd(n);
}
//conversion
static int[] btd(int n)
{ 
	int [] rem=new int[8];
	int r=0;
	while(n!=0)
	{
		for(int i=0;i<rem.length;i++)
	{    
		r=n%2;
		n=n/2;
		rem[i]=r;
		r=0;
	}

}
//for binary printing 
for(int i=rem.length-1;i>=0;i--)
{
System.out.print(rem[i]);	
}
return rem;
}
}
