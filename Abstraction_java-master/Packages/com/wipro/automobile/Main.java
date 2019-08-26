package com.wipro.automobile;

import java.util.Scanner;

import com.wipro.automobile.ship.Compartment;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hig = sc.nextInt();
		int wid = sc.nextInt();
		int bre = sc.nextInt();
		
		Compartment compartment = new Compartment(hig, wid, bre);
		System.out.println(compartment.toString());

	}

}
