package com.automobile;

import com.automobile.twowheeler.*;
import com.automobile.fourwheeler.*;
public class Test {

	public static void main(String[] args) {
		
		Vehicle vehicle = null;
		
		Hero hero = new Hero();
		Honda honda = new Honda();
		Logan logan = new Logan();
		vehicle = hero;
		
		System.out.print("ModelName: "+vehicle.getModelName()+" RegistrationNo: "+vehicle.getRegistrationNumber()
		+" OwnerName: "+vehicle.getOwnerName()+" Speed: "+hero.getSpeed());
		hero.cdplayer();
		System.out.println();
		vehicle = honda;
		System.out.println("ModelName: "+vehicle.getModelName()+" RegistrationNo: "+vehicle.getRegistrationNumber()
		+" OwnerName: "+vehicle.getOwnerName()+" Speed: "+honda.getSpeed());
		
		vehicle = logan;
		System.out.println("ModelName: "+vehicle.getModelName()+" RegistrationNo: "+vehicle.getRegistrationNumber()
		+" OwnerName: "+vehicle.getOwnerName()+" Speed: "+logan.speed()+" Cordinate: "+logan.gps()+" Temperature: "
		+logan.tempControl());
		
		

	}

}
