package com.cg.mavan.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class CalcDemoTest {

	@Test
	public void testAddNums() {

		CalcDemo cal = new CalcDemo();
		int expected = 30;
		int actual = cal.addNums(10, 20);
		assertEquals(expected, actual); // true
	}

	@Test
	public void testAddNums2() {

		CalcDemo cal = new CalcDemo();
		int unexpected = 35;
		int actual = cal.addNums(10, 20);
		assertNotEquals(unexpected, actual); // true
	}

	@Test
	public void testAddNums3() {

		CalcDemo cal = new CalcDemo();
		assertEquals(30, cal.addNums(10, 20)); // true
	}
}

