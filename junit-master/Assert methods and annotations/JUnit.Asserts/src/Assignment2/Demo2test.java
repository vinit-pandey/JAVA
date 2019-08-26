import static org.junit.Assert.*;

import org.junit.Test;

class Demo2test {
	
	Demo2 obj=new Demo2();

	@Test
	public void testPalindromeCheck() {
		assertTrue("Result: ", obj.palindromeCheck("mom"));
		assertTrue("Result: ", obj.palindromeCheck("dad"));
		assertTrue("Result: ", obj.palindromeCheck("madam"));
		assertFalse("Result: ", obj.palindromeCheck("india"));
	}

}
