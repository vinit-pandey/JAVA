package com.wipro.automobile.ship;

public class Compartment {
	
	int hight,width,breadth;

	public Compartment(int hight, int width, int breadth) {
		super();
		this.hight = hight;
		this.width = width;
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "Compartment [hight=" + hight + ", width=" + width + ", breadth=" + breadth + "]";
	}
	

}
