//package Handson_1;

public class Main {

	public static void main(String[] args) {
		
		ICICIBank i = new ICICIBank();
		System.out.println("Rate of Interest of SavingsAccount of ICICIBank: "+i.getSavingsInterestRate());
		System.out.println("Rate of Interest of FixedAccount of ICICIBank: "+i.getFixedDepositInterestRate());
		
		KotMBank k = new KotMBank();
		System.out.println("Rate of Interest of SavingsAccount of ICICIBank: "+k.getSavingsInterestRate());
		System.out.println("Rate of Interest of FixedAccount of ICICIBank: "+k.getFixedDepositInterestRate());
		
		GeneralBank g = null;
		
		g = new ICICIBank();		
		System.out.println("Rate of Interest of SavingsAccount of ICICIBank: "+g.getSavingsInterestRate());
		System.out.println("Rate of Interest of FixedAccount of ICICIBank: "+g.getFixedDepositInterestRate());
		
		g = new KotMBank();
		System.out.println("Rate of Interest of SavingsAccount KotMBank: "+g.getSavingsInterestRate());
		System.out.println("Rate of Interest of FixedAccount KotMBank: "+g.getFixedDepositInterestRate());
		

	}

}
