import java.util.*;
public class Handson_1 {

	public static void main(String[] args) {
	
		ArrayList<String> al = new ArrayList<String>();
		al.add("January");
		al.add("February");
		al.add("March");
		al.add("April");
		al.add("May");
		al.add("June");
		al.add("July");
		al.add("August");
		al.add("September");
		al.add("October");
		al.add("November");
		al.add("December");
		
		Iterator<String> itr  = al.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
