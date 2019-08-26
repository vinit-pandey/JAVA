class p1
{
	public static void main(String ar[]) 
    {
        int number=Integer.parseInt(ar[0]);
        if(number > 0)
        {
            System.out.println(number+" is a positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is a negative number");
        }
        else
        {
            System.out.println(number+" is zero");
        }
    }
}