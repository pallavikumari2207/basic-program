package com.bridgelabz.basicprgm;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class leapyear {
	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter year:");
	int year =scan.nextInt();
	boolean flag=false;
	if(year<=1000)
	{
		System.out.println("invalid");
	
	}
	else
	{
		if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                // year is divisible by 400, hence the year is a leap year
                if ( year % 400 == 0)
                    flag = true;
                else
                    flag= false;
            }
            else
                flag = true;
        }
        else
            flag = false;
        if(flag)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}
}

