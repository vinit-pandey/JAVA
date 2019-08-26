//package exception_demo;

class MyException extends Exception{
	public MyException() {
		System.out.println("Entered Age Must be within 18 to 60 Years");
	}
}
public class Handson_8 {

	static void checkAge(String name,int age)throws MyException
	{
		if(age<18 || age>60)
			throw new MyException();
		else
			System.out.println(name+" your age is :"+age);
	}
	public static void main(String[] args) {
		if(args.length>0)
		{
			String name = args[0];
			int age = Integer.parseInt(args[1]);
			
			try {
				checkAge(name,age);
			}
			catch (Exception e) {
			
			}
			
		}

	}

}
