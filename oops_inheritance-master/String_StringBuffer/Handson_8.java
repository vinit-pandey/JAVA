//package StringDemo;

import java.util.Scanner;

public class Handson_8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String string = new String();
		string = sc.next();
		
		String word = new String();
		word = sc.next();
		
		int count = sc.nextInt();
		String newString = "";
		
		int i = 0;
		while(i<count-1)
		{
			newString += string + word;
			i++;
		}
		newString += string;
		
		System.out.println(newString);
		

	}

}
