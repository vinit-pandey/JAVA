//package StringDemo;

import java.util.Scanner;

public class Handson_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String string1 = new String();
		string1 = sc.next();
		
		String string2 = new String();
		string2 = sc.next();
		
		int i=0,j=0;
		String newString= "";
		
		while(i<string1.length() && j<string2.length())
		{
			newString += Character.toString(string1.charAt(i)) + Character.toString(string2.charAt(j)); 
			i++;
			j++;
		}
		
		while(i<string1.length())
		{
			newString += Character.toString(string1.charAt(i));
			i++;
		}
		
		while(j<string2.length())
		{
			newString += Character.toString(string2.charAt(j));
			j++;
		}
		
		System.out.println(newString);
		sc.close();
	}

}
