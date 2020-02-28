package com.blz.functional;

import java.util.Scanner;

public class SwapNibbles {
	public static void main (String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int x=scan.nextInt();
		Dectobin d=new Dectobin();
		int [] arr=new int [8];
		int [] res={1,1,1,1,0,0,0,0};
		int[] pos= {0,0,0,0,1,1,1,1};
		arr=d.btd(x);
		System.out.println();
		int[] swapped =swapNibbles(arr,res,pos);
		
	}
		static int[] swapNibbles(int[] arr,int[] res,int [] pos) 
		{ 
			int [] temp=new int [8];
		    for(int i=0;i<4;i++)
		     {
		    	temp[i]=arr[i] & res[i];
		     }
		    for(int i=4;i<8;i++)
		     {
		    	temp[i]=arr[i] & pos[i];
		     }
		    
		    	
		    	
		   for(int i=0;i<temp.length;i++)
		    {
		    	System.out.print(temp[i]);	
		    	}
			return temp;
		} 
	

}
