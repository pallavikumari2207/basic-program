package com.blz.sorting;

public class merge {

	public static void main(String[] args) {
		int [] array= {5,4,3,2,1};
		System.out.println("unsorted array");
		for(int i=0;i<array.length;i++)
		{
		System.out.println(array[i]);	
		}
			
		int[] a=mergesort(array);
		
	System.out.println("sorted");	
	for(int i=0;i<a.length;i++)
	{
	System.out.println(a[i]);	
	}
		

	}
static int[] merge(int[]left, int[] right)
{
	int [] result=new int[left.length + right.length];
	int leftpointer,rightpointer,resultpointer;
	leftpointer=rightpointer=resultpointer=0;
	while(leftpointer<left.length || rightpointer<right.length)
	{  
		if(leftpointer<left.length && rightpointer<right.length) {
			if(left[leftpointer]<right[rightpointer]) {
				result[resultpointer++]=left[leftpointer++];
				//System.out.println("1234");
			}
			else
			{
				result[resultpointer++]=right[rightpointer++];
			}
		}
		else if(leftpointer<left.length)
		{
			result[resultpointer++]=left[leftpointer++];
		}
		else if(rightpointer<right.length)
		{
			result[resultpointer++]=right[rightpointer++];
		}
	}
	return result;
	}
static int[] mergesort(int [] array)
{    
	 int n=array.length;
	 
	 if(n<2)
		 return array;
	 int mid=(n/2);
	 int [] left=new int[mid];
	 int [] right;
	 if(n%2==0)
	 {
		 right=new int[mid]; 
	 }
	 else
	 {
	  right=new int[mid+1];
	 }
	
	 for(int i=0;i<mid;i++)
	 {
		 left[i]=array[i];
		 
	 }

	 for( int j=0;j<right.length;j++)
	 {  
		 right[j]=array[mid+j];
	 }
	 int[] result=new int[array.length];
	left= mergesort(left);
	right= mergesort(right);
	result= merge(left,right);
	 
	return result;
	
}
	 
}

