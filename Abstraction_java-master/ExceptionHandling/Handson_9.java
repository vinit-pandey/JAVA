//package exception_demo;

import java.util.Scanner;

public class Handson_9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try {
			int val = a%b;
			System.out.println(val);
		}
		catch (ArithmeticException e) {
			System.out.println("DevideByZeroException Caught");
		}
		
		finally {
			System.out.println("Inside Finally Block");
		}
	}

}
