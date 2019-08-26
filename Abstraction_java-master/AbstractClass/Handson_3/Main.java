package Handson_3;

public class Main {

	public static void main(String[] args) {

		Instrument[] instruments = new Instrument[10];
		
		instruments[0] = new Flute();
		instruments[1] = new Guitar();
		instruments[2] = new Piano();
		
		for(int i=0;i<3;i++)
			instruments[i].play();
		
		


	}

}
