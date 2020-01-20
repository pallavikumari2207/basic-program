package com.blz.vm;

import static org.junit.Assert.assertArrayEquals;

import java.util.Scanner;

import org.junit.Test;

public class VmTest {
	@Test
	public void vmtest(){
		Vendingmachine  v=new Vendingmachine ();
	Scanner scan=new Scanner(System.in);
	int x=scan.nextInt();
	int[] x1 = v.vm(x);
	// System.out.println("main function print");
	// for(int i=0;i<=x1.length;i++)
	// System.out.println(x1[i]);
	int[] res = {0,0,0,0,0,1,0,0};
	assertArrayEquals(res,x1);
	}

}
