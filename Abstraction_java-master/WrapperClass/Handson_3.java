import java.util.*;
public class Handson_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int val = sc.nextInt();
		
		String str = Integer.toBinaryString(val);
		
		val = Integer.valueOf(str);
		str = String.format("%08d",val);
		System.out.println(str);

	}

}
