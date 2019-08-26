//package StringDemo;

import java.util.Scanner;

public class Handson_9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String string = new String();
		string = sc.next();
		
		String newString = string.replaceAll(".?\\*+.?","");
		
		System.out.println(newString);

	}

}
