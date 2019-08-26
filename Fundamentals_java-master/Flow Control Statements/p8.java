class p8
{
	public static void main(String ar[])
	{
		String color=ar[0].toUpperCase();
		
		switch(color){
		
		case "R":
			System.out.println("Color name is Red");
			break;
		
		case "B":
			System.out.println("Color name is Blue");
			break;
		
		case "G":
			System.out.println("Color name is Green");
			break;
		
		case "O":
			System.out.println("Color name is Orange");
			break;
		
		case "Y":
			System.out.println("Color name is Yellow");
			break;
		
		case "W":
			System.out.println("Color name is White");
			break;
		
		default:
			System.out.println("Invalid Color Code");
		}
	}
}