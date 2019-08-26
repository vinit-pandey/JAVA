//package StringDemo;

import java.util.Scanner;

public class Handson_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = new String();
		String str2 = new String();
		String newString = null;
		
		str1 = sc.nextLine();
		str2 = sc.nextLine();
		int len1 = str1.length();
		int len2 = str2.length();
		
		
		if(len1>len2)
		{
			newString = str2 + str1 + str2;
		}
		else
		{
			newString = str1 + str2 + str1;
		}
		System.out.println(newString);

	}

}
