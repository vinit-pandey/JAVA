package com.TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.Test;

@RunWith(Suite.class)
@SuiteClasses({
	CalcTest.class, CheckPalindromeTest.class 
	})

public class AllTests {
	
	public class Tester{
		
	}

}
