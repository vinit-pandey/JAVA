//package StringDemo;
import java.util.*;
public class Handson_4 {

	public static String helper(String str)
	{
		int len = str.length();
		if(len%2==0)
		{
			str = str.substring(0,len/2);
		}
		else
			str = null;
		return str;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = new String();
		
		str = sc.next();
		
		String ans = helper(str);
		
		System.out.println(ans);
		
		
		sc.close();
	}

}
