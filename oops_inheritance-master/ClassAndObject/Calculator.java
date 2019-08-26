public class Calculator {

	public static int powerInt(int num1,int num2)
	{
		int val=1;
		for(int i=0;i<num2;i++)
		{
			val = val*num1;
		}
		return val;
	}
	
	public static double powerDouble(double num1,int num2)
	{
		return Math.pow(num1, num2);
	}
	public static void main(String[] args) {
		
		System.out.println("2 power 4 is: "+powerInt(2, 4));
		System.out.println("2.2 power 4 is :"+powerDouble(2.2, 4));
	}

}