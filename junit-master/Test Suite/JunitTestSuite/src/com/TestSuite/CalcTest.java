package com.TestSuite;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void testAdd() {
	Calc c=new Calc();
	assertEquals(5,c.add(2,3));
	}
	@Test
	public void testSub() {
	Calc c=new Calc();
	assertEquals(20,c.sub(100,80));
	}

}
