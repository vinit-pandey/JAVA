class p13
{
    public static void main(String[] args)
	{
		for(int i=10; i < 100; i++){

                    boolean isPrime = true;

                    //check to see if the number is prime
                    for(int j=2; j < i ; j++){

                            if(i % j == 0){
                                    isPrime = false;
                                    break;
                            }
                    }
                    // print the number
                    if(isPrime)
                            System.out.print(i + " ");
            }
    }
}