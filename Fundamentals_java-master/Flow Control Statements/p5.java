class p5
{
	public static void main(String args[])
	{
		char char1='y';
		if(char1>=48 && char1<=57)
			System.out.print("char is Digit");
		else if((char1>='a' && char1<='z')||(char1>='A' && char1<='Z'))
			System.out.print("char is Alphabet");
    else
        System.out.print("char is special character");
	}
}