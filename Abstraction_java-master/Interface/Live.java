import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Live {

	public static void main(String[] args) {

		Veena venna = new Veena();
		venna.play();
		
		Saxophone saxophone = new Saxophone();
		saxophone.play();
		
		Playable playable = null;
		playable = venna;
		playable.play();
		
		playable = saxophone;
		playable.play();

	}

}
