package com.bridgelabz.functionalprgm;

public class windchill {

	public static void main(String[] args) {
		
	int t=Integer.parseInt(args[0]);
	System.out.println(" temp(in Fahrenheit): " + " "+ t);
	int v=Integer.parseInt(args[1]);
	System.out.println("enter speed(in miles per hour):"+ " "+ v );
	if(t<50 && v<120 && v>3)
	{
		double w=35.74+0.6215*t+(0.4275*t-35.75)*(Math.pow(v, 0.16));
		System.out.println("the effective temperature (the wind chill)"); 
		System.out.println(w);
	
	}
	else
		System.out.println("invalid input");

	}

}
