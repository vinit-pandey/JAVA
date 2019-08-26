//package StringDemo;
import java.util.*;
public class Handson_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String str1 = sc.next();
		System.out.println("Enter String 2: ");
		String str2 = sc.next();
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		String newStr = new String();
		
		if(str1.charAt(str1.length()-1)==str2.charAt(0))
		{
			String ch = Character.toString(str2.charAt(0));
			
			newStr = str1.replace(ch,"") + str2;
		}
		else
			newStr = str1 + str2;
		
			System.out.println("Concatinated String: "+newStr);
	}

}
