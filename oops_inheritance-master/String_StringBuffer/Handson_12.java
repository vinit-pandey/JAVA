import java.util.*;
public class Handson_12 {
	
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
		
		String string = sc.nextLine();
		int val = sc.nextInt();
		
		string = string.substring(string.length()-val,string.length());
		int i=0;
		String newString = "";
		while(i<val)
		{
			newString+=string;
			i++;
			
		}
		System.out.println(newString);
	}
}