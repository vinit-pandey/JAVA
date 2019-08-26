class Animal{
	void Eat()
	{
		System.out.println("Animal is Eating");
	}
	void sleep()
	{
		System.out.println("Animal is Sleeping");
	}
}

class Bird extends Animal{
	void Eat()
	{
		System.out.println("Bird is Eating");
	}
	void sleep()
	{
		System.out.println("Bird is Sleeping");
	}
	void Fly()
	{
		System.out.println("Bird is Flying");
	}
}
public class Handson_1 {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.Eat();
		animal.sleep();
		
		
		Bird bird = new Bird();
		bird.Eat();
		bird.sleep();
		bird.Fly();
	
	}

}