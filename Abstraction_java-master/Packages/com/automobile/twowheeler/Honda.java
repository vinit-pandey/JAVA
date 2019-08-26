package com.automobile.twowheeler;

import com.automobile.Vehicle;
public class Honda extends Vehicle{

	@Override
	public String getModelName() {
		
		return "Honda CB700";
	}

	@Override
	public String getRegistrationNumber() {
		
		return "19trprar";
	}

	@Override
	public String getOwnerName() {
		
		return "Arghya";
	}
	
	public int getSpeed()
	{
		return 110;
	}
	

}
