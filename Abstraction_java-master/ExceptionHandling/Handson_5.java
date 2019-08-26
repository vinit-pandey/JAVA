//package exception_demo;

import java.util.Scanner;

public class Handson_5 {

	static void division(int a,int b)throws ArithmeticException
	{
		double val =  a/b;
		System.out.println("After Division Value is = "+val);
		throw new ArithmeticException();
		
		
	}
	public static void main(String[] args) {

		Scanner scanner =  new Scanner(System.in);
		
		int a1 = scanner.nextInt();
		int a2 = scanner.nextInt();
		
		try {
			division(a1, a2);
		}
		catch (Exception e) {
			System.out.println(e.getClass().getName());
		}
		
		

	}

}
