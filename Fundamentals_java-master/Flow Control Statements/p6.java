class p6
{
	public static void main(String ar[])
	{
		String gen=ar[0].toLowerCase();
		int age=Integer.parseInt(ar[1]);
		
		if(gen.equals("male") && age>=1 && age <=58)
			System.out.println("Percentage of Interest is 8.4%");
		
		else if(gen.equals("male") && age>=59 && age <=100)
				System.out.println("Percentage of Interest is 10.5%");
			
		else if(gen.equals("female") && age>=1 && age <=58)
			System.out.println("Percentage of Interest is 8.2%");
		
		else if(gen.equals("female") && age>=59 && age <=100)
				System.out.println("Percentage of Interest is 9.2%");
			
		else
			System.out.println("Values are incorrect");
	}
}