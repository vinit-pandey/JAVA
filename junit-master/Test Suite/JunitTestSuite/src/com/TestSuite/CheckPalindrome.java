package com.TestSuite;

public class CheckPalindrome {
	
	public boolean palindromeCheck(String str) {
		str=str.toLowerCase();
		int digitCount=str.length();
		boolean isPalindrome=true;
		
		int range=digitCount/2;
		if(digitCount%2==0)
			range--;
		for (int i = 0; i <= range; i++) {
			if (str.charAt(i) != str.charAt(digitCount - i - 1)) isPalindrome = false;
		}
		return isPalindrome;
	}

}
