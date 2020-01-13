package com.bridgelabz.basicprgm;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class flipcointest {

	@Test
	public void addtest(){
		flipcoin f=new flipcoin();

 assertThat(f.prcent(3)).isBetween(0, 100);
		
		//fail("Not yet implemented");
	}

}
