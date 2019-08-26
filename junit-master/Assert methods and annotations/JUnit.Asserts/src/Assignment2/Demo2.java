public class Demo2 {
	
	public boolean palindromeCheck(String str) {
		str=str.toLowerCase();
		int count=str.length();
		boolean ans=true;
		
		int n=count/2;
		if(count%2==0)
			range--;
		for (int i = 0; i <= n; i++) {
			if (str.charAt(i) != str.charAt(count - i - 1)) ans = false;
		}
		return isPalindrome;
	}
}
