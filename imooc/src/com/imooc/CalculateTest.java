package com.imooc;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTest {
	
	Calculate calculation = new Calculate();
	int sum = calculation.sum(3,5);
	int testSum = 8;
	
	@Test

	public void testSum() {
		// TODO Auto-generated method stub
		System.out.println("Test sum():"+sum+" = "+testSum);
		assertEquals(sum, testSum);
	}

}
