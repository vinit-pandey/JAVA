import java.util.*;
public class Handson_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int val = sc.nextInt();
		
		System.out.println("Given Number: "+val);
		System.out.println("Binary Equivalent:"+Integer.toBinaryString(val));
		System.out.println("Octal Equivalent: "+Integer.toOctalString(val));
		System.out.println("Hexadecimal Equivalent: "+Integer.toHexString(val));

	}

}
