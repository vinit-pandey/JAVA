//package StringDemo;

import java.util.Scanner;

public class Handson_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = new String();
		String newString = "";
		
		str1 = sc.nextLine();
		
		char ch1 = str1.charAt(0);
		char ch2 = str1.charAt(str1.length()-1);
		if(ch1=='x' && ch2=='x')
		{
			newString = str1.substring(1,str1.length()-1);
		}
		else
			newString = str1;
		
		System.out.println(newString);

	}

}
