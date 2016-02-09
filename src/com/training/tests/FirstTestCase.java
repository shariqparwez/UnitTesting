package com.training.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.samples.CurrencyConverter;

public class FirstTestCase {
	CurrencyConverter conv = null;

	@Before
	public void setUp() throws Exception {
		System.out.println("Before Called==========");
		conv = new CurrencyConverter();

	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After Called ********");
	}

	@Test
	public void test1() {
		//fail("test 1 Not yet implemented");
		double actual = conv.dollarToRupees(10);
		assertEquals(1000.0,actual,1);
	}
	
	@Test
	public void test2() {
		//fail("test 2 Not yet implemented");
		double actual = conv.dollarToRupees(10);
		assertNotNull(actual);
	}

}
