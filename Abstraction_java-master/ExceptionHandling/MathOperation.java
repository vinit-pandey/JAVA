//package exception_demo;

public class MathOperation {

	public static void main(String[] args) {
		
			int arr[] = new int[args.length];
			int sum=0;
			double avg;
			for(int i=0;i<args.length;i++)
			{
				try {
				arr[i] = Integer.parseInt(args[i]);
				}
				catch (NumberFormatException e) {
					System.out.println(e.getClass().getName());
					return;
				}
				sum+=arr[i];
			}
			System.out.println("sum is = "+sum);
			
			try {
			avg = sum/args.length;
			System.out.println("Averge is = "+avg);
			}
			catch (ArithmeticException e) {
				System.out.println(e.getClass().getName());
			}
		

	}

}
