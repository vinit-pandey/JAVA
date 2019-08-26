package Handson_1;

import java.util.Scanner;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LibraryUser libraryUser = null;
		
		int age;
		String bookType;
		age = sc.nextInt();
		bookType = sc.next();
		
		KidUsers kidUsers = new KidUsers(age, bookType);
		libraryUser = kidUsers;
		libraryUser.registerAccount();
		libraryUser.requestBook();
		
		age = sc.nextInt();
		bookType = sc.next();
		
		AdultUser adultUser = new AdultUser(age, bookType);
		libraryUser = adultUser;
		libraryUser.registerAccount();
		libraryUser.requestBook();
		
		sc.close();

	}

}
