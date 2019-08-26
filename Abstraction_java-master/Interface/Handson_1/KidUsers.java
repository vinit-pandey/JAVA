package Handson_1;

public class KidUsers implements LibraryUser{

	int age;
	String bookType;
	
	public KidUsers(int age, String bookType) {
		this.age = age;
		this.bookType = bookType;
	}

	@Override
	public void registerAccount() {
		if(age<12)
		{
			System.out.println("You have successfully registered under a Kids Account");
		}
		else
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
	}

	@Override
	public void requestBook() {
		if(age>11)
			return;
		if(bookType.equals("Kids"))
			System.out.println("Book Issued successfully, please return the book within 10 days");
		else
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		
	}
	

}
