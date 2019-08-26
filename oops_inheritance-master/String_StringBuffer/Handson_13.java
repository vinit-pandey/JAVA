//package StringDemo;

import java.util.Scanner;

public class Handson_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String string1 = new String();
		String string2 = new String();
		String newString = "";
		
		string1 = sc.next();
		string2 = sc.next();
		
		int first = string1.length();
		int second = string2.length();
		
		for(int i=0;i<first-second+1;i++)
		{
			if(i>0 && string2.equals(string1.substring(i,i+second)))
			{
				newString += string1.substring(i-1,i);
			}
			if(i<first-second && string2.equals(string1.substring(i,i+second)))
				newString += string1.substring(i+second,i+second+1);
		}
		
		System.out.println(newString);

	}

}
