class p3	
{
	public static void main(String ar[]) 
    {
        int l=ar.length;
		int i=0;
		if(ar == null)
			System.out.println("No Values");
		else
		{
			for(i=0;i<l;i++)
			{
				System.out.print(ar[i]+", ");
			}
		}
    }
}