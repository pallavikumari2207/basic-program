package com.blz.util;


public class monthlypayment {
	static double  monthlyPayment(double  d, double  y, double  r) {
		double  n = 12 * y;
		double  r0 = r / (12 * 100);
		double  payment = (d * r0) / (1 - Math.pow((1 + r0), -n));
		System.out.println(payment);
		return payment;
	}
}

