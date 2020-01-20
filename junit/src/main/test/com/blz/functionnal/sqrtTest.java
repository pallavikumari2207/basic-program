package com.blz.functionnal;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.Test;

import com.blz.functional.sqrt;

public class sqrtTest {
	@Test
	public void sqrttest() {
	sqrt s=new sqrt();
	Scanner scan=new Scanner(System.in);
	double p=scan.nextDouble();
	float x=(float)s.sqrt(p);
	//System.out.println(x);
	float x1=(float) 4.0;
	assertEquals(x1, x);
	}
	}

	
	
	
	

