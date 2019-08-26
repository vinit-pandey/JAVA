class p19 {
    	public static void main(String args[]) {
			
		int count=1;
				
		System.out.println("\n\nDivided by 2 & 3 & 5: ");	
		while (count<6){
		for (int i=1;i<=150; i++) {
		if (i%2==0 && i%3==0 && i%5==0) {System.out.print(i +", ");	count++;}		
		}
		}
  }
}