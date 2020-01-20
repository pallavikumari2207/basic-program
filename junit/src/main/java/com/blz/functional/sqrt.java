package com.blz.functional;

public class sqrt {
	public static void main(String[] args)
	{
		System.out.println("this is main");
		//int c=16;
		//double x=sqrt(c);
		//System.out.println(x);
		
	}
	   public static float sqrt(double c) {
		  // double n=c;
	        if (c < 0)
	        {System.out.println("nahi chalega");}
	        double EPSILON = 1E-15;
	        double t = c;
	        while (Math.abs(t - c/t) > EPSILON*t)
	            t = (c/t + t) / 2.0;
	        System.out.println(t);
	        return (float) t;

}
}
