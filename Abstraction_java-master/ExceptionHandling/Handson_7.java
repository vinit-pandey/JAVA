//package exception_demo;
class InvalidCountryException extends Exception {

	
	private String msg;	
	public InvalidCountryException(String msg)
	{
		this.msg=msg;
	}
	public String toString()
	{
		return msg;
	}
}

class UserRegistration {
	private String userName;
	private String userCountry;
	public UserRegistration()
	{
		
	}
	void registerUser(String userName, String userCountry)
	{
		try {
			this.userName=userName;
		if(userCountry=="India") {
			this.userCountry=userCountry;
		} else
			throw new InvalidCountryException("User Outside India cannot be registered");
		System.out.println("User registration done successfully");
		}
		catch(InvalidCountryException e)
		{
			System.out.println(e);
		}
	}
	

}
public class Handson_7 {

	public static void main(String[] args) {
		
		UserRegistration user1=new UserRegistration();
		
		user1.registerUser("Mickey","US");
		user1.registerUser("Mini","India");

	}

}
