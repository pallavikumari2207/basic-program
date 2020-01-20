package com.blz.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class loanpaymentTest {
	@Test
	public void test() {
		monthlypayment m = new monthlypayment();
		double x = monthlypayment.monthlyPayment(4000, 2, 10);
		// System.out.println(x);
		double y = 184.579;
		// System.out.println(y);
		assertEquals(x,y,.1);
		

	}
}
