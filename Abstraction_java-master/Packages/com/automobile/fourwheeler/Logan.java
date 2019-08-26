package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle{

	@Override
	public String getModelName() {
		
		return "Renault Logan";
	}

	@Override
	public String getRegistrationNumber() {
		
		return "18trarxr";
	}

	@Override
	public String getOwnerName() {
		
		return "Shalini";
	}
	
	public int speed()
	{
		return 150;
	}
	
	public int gps()
	{
		return 10;
	}
	
	public int tempControl()
	{
		return 17;
	}

}
