//package exception_demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Handson_3 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array");
		
		int n = scanner.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter the elements in the array");
		try {
			for(int i=0;i<n;i++)
			{
				arr[i] = scanner.nextInt();
			}
		}
		
		catch(InputMismatchException e)
		{
			System.out.println(e.getClass().getName());
			return;
		}
		
		System.out.println("Enter the index of the array element you want to access");
		
		try {
			
			int index = scanner.nextInt();
			System.out.println("The array element at index "+index+" = "+arr[index]);
			System.out.println("The array element successfully accessed");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			
			System.out.println(e.getClass().getName());
		}

	}

}
