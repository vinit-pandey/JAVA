package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle{
	
	

	@Override
	public String getModelName() {
		
		return "KARIZMA";
	}

	@Override
	public String getRegistrationNumber() {
		
		return "20trarpr";
	}

	@Override
	public String getOwnerName() {
		
		return "Anirban";
	}
	
	public int getSpeed() {
		
		return 80;
	}
	
	public void cdplayer() 
	{
		System.out.println("Harman CdPlayer");
	}
	

}
