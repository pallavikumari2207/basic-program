package com.blz.util;

import java.util.Scanner;

public class loanpayment {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter principal ,year and rate");
		double  p = s.nextDouble();
		double  y = s.nextDouble();
		double r = s.nextDouble();
		s.close();
		System.out.println("mothly payment is " +monthlypayment.monthlyPayment(p, y, r));
	}
}

