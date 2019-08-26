//package exception_demo;

import java.util.Scanner;

class MyException extends Exception{
	
	public MyException() {
		System.out.println("Your Marks has negetive Value");
		
	}
	public MyException(int val) {
		System.out.println("Your Marks is outOfrange");
	}
}

class Student{
		String name;
		int sub1,sub2,sub3;
		public Student(String name, int sub1, int sub2, int sub3) {
			this.name = name;
			this.sub1 = sub1;
			this.sub2 = sub2;
			this.sub3 = sub3;
		}
		double avg()
		{
			return (sub1+sub2+sub3)/3;
		}
}

public class Handson_6 {
	static void chkval(int sub1,int sub2,int sub3)throws MyException
	{
		if(sub1<0 || sub2<0 || sub3<0)
			throw new MyException();
	}
	static void chkval1(int sub1,int sub2,int sub3)throws MyException
	{
		if(sub1>100 || sub2>100 || sub3>100)
			throw new MyException(1);
	}

	public static void main(String[] args)throws MyException {
		String name;
		int sub1,sub2,sub3;
		Scanner scanner = new Scanner(System.in);
		name = scanner.nextLine();
		sub1 = scanner.nextInt();
		sub2 = scanner.nextInt();
		sub3 = scanner.nextInt();
		Student student1 = new Student(name,sub1,sub2,sub3);
		try {
		chkval(sub1,sub2,sub3);
		chkval1(sub1, sub2, sub3);
		System.out.println(student1.name+" has Avg Marks = "+student1.avg());
		}
		catch (Exception e) {
			
		}
		name = scanner.next();
		sub1 = scanner.nextInt();
		sub2 = scanner.nextInt();
		sub3 = scanner.nextInt();
		
		Student student2 = new Student(name, sub1, sub2, sub3);
		try {
		chkval(sub1, sub2, sub3);
		chkval1(sub1,sub2,sub3);
		
		System.out.println(student2.name+" has Avg Marks = "+student2.avg());
		}
		catch (Exception e) {
			
		}
		
		
		
		
		

	}

}
