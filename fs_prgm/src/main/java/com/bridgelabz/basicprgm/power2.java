package com.bridgelabz.basicprgm;

public class power2 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		System.out.println(num);
		
for(int i=0;i<num;i++)
{
	int res=(int)Math.pow(2, i);
	System.out.println(res);
	
}
	}

}