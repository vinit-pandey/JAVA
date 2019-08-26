package com.TestSuite;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckPalindromeTest {
	
	CheckPalindrome d=new CheckPalindrome();

	@Test
	public void testPalindromeCheck() {
		assertTrue("Result: ", d.palindromeCheck("mom"));
		assertTrue("Result: ", d.palindromeCheck("dad"));
		assertTrue("Result: ", d.palindromeCheck("madam"));
		assertFalse("Result: ", d.palindromeCheck("india"));
	}

}
