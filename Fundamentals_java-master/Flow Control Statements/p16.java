class p16
{
  public static void main(String ar[])
  {
    int n, c, d;
    n=Integer.parseInt(ar[0]);
	
	if(ar[0]==null)
		System.out.println("Enter a valid number");
	else
	{ 
    System.out.println("Floyd's triangle:");
     for (c = 1; c <= n; c++)
    {
      for (d = 1; d <= c; d++)
      {
        System.out.print("* ");
      }
 
      System.out.println();
    }
  }
}
}