//package StringDemo;
import java.util.*;
public class Handson_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scanner = new Scanner(System.in);
		
		String str1 = new String(scanner.next());
		
		String str2 = new String();
		
		int len = str1.length();
		
		if(len>=2)
		{
			str1 = str1.substring(0,2);
		
			int i = 0;
			while(i<len)
			{
				str2 = str2+str1;
				i++;
			}
			System.out.println(str2);
		}
		else
		{
			int i = 0;
			while(i<len)
			{
				str2 += str1;
				i++;
			}
			System.out.println(str2);
		}
		
	}

}
