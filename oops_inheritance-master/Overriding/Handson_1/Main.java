//package Fruit;


public class Main {

	public static void main(String[] args) {
		
		Fruit fruit = null;
		
		fruit = new Apple(2);
		fruit.eat("Apple", "sweet");
		System.out.println("Name: "+fruit.name+" Taste: "+fruit.taste+" size: "+fruit.size);
		
		fruit = new Orange(3);
		fruit.eat("Orange","sour");
		System.out.println("Name: "+fruit.name+" Taste: "+fruit.taste+" size: "+fruit.size);
		
	}

}
