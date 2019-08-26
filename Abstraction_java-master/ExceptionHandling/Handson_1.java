//package exception_demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Handson_1 {
	public static void main(String args[])
	{

	Scanner scanner = new Scanner(System.in);
	
	try {
		int val = scanner.nextInt();
		System.out.println("The Square Value is: "+val*val);
	}
	
	catch (InputMismatchException e) {
		System.out.println("Entered input is not a valid format for an integer.");
		
	}
	
	
	}
}
