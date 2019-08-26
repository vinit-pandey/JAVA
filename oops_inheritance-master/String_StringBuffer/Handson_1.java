//package StringDemo;
import java.util.*;
public class Handson_1 {
	
	static boolean isPalindrome(String str)
	{
		int i=0,j=str.length()-1;
		
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	String str1 = sc.next();
	
	if(isPalindrome(str1))
		System.out.println("String 1 is Palindrome");
	else
		System.out.println("String 1 is Not a Palindrome");
	
	}
}
