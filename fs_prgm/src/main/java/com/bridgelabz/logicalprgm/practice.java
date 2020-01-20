package com.bridgelabz.logicalprgm;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int n=x;
		//System.out.println("entered number is"+ n);
		int count1=0;
		int count2=0;
		int count5=0;
		int count10=0;
		int count50=0;
		int count100=0;
		int count500=0;
		int count1000=0;
		if(n>1)
		{
			while(n/1000>=1)
			{  
				x=x-1000;
				n=x;
				count1000 ++;
				
				
			}

			while(n/500>=1)
			{
				count500 ++;
				x=x-500;
				n=x;
				System.out.println(count500);
			}

			while(n/100>=1)
			{
				count100 ++;
				x=x-100;
				n=x;
			}

			while(n/50>=1)
			{
				count50 ++;
				x=x-50;
				n=x;
			}

			while(n/10>=1)
			{
				count10 ++;
				x=x-10;
				n=x;
			}

			while(n/5>=1)
			{
				count5 ++;
				x=x-5;
				n=x;
			}

			while(n/2>=1)
			{
				count2 ++;
				x=x-2;
			}

			while(n/1>=1)
			{
				count1 ++;
				x=x-1;
			}
			scan.close();
		}
		
	
/*System.out.println("number of 1 rs note is:" + count1);
System.out.println("number of 2 rs note is:" + count2);
System.out.println("number of 5 rs note is: " + count5);
System.out.println( "number of 10 rs note is: "+count10);
System.out.println("number of 50 rs note is:" + count50);
System.out.println("number of 100 rs note is:" + count100);
System.out.println("number of 500 rs note is:" + count500);
System.out.println("number of 1000 rs note is: " + count1000);	*/
		Map<String, Integer[]> map = new HashMap<String, Integer[]>();
		Integer[] arrayToPut = new Integer[] {count1,count2,count5,count10,count50,count100,count500,count1000};
		map.put("myKey", arrayToPut);
		Integer[] integers = map.get("myKey");
		for(int i=0;i<=integers.length;i++)
		System.out.println(integers[i]);
		
		
		
		
	}
		 public static int[] vm (int []integers) 
		 {
			 int[] myArray = new int[9];
			 for(int i=0; i<=integers.length; i++) {
		         myArray[i] = integers[i];
		 }
			return myArray;

		
		


	      
		 }
	}

