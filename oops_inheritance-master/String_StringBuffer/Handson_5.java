//package StringDemo;

import java.util.Scanner;

public class Handson_5 {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String str = new String();
		
		str = sc.next();
		int len = str.length();
		
		if(len>=2)
		{
			str = str.substring(1,len-1);
			System.out.println(str);
		}
		else
			System.out.println("Length must be atleast 2");
	}

}
