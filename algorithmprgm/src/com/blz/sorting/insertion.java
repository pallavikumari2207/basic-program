package com.blz.sorting;

public class insertion {
public static void main(String []args)
{
	int [] arr= {7,5,4,3,6};
	System.out.println("unsorted array is:");
	for (int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]);	
	}
	System.out.println();
	for(int i=1;i<arr.length;i++)
	{	int key=arr[i];
		int j=i-1;
	  while (j >= 0 && arr[j] > key) 
	{
		arr[j+1]=arr[j];
		j=j-1;
	}
	  arr[j+1]=key;
	  
}
	System.out.println("sorted array via:insertion");
for(int k=0;k<arr.length;k++)
{

System.out.print(arr[k]);	
}
}
}
