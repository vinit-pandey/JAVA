
public class TestCompartment {

	public static void main(String[] args) {
	
		Compartment [] compartments = new Compartment[10]; 
		
		
		int max = 4;
		int min = 1;
		int range = max - min + 1;
		
		int num = (int)(Math.random()*range) + min;
		
		switch(num)
		{
		case 1: compartments[0] = new Luggage();
			break;
		case 2:compartments[0] = new Ladies();
			break;
		case 3: compartments[0] = new General();
			break;
		case 4: compartments[0] = new Firstclass();
		}
		
		
		System.out.println(compartments[0].notice());
		
		

	}

}
