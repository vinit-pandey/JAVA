import java.util.*;
class p1
{
public static void main(String[] args)
   {
       int i,j,n,a[],s=0;
       double avg;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter length of array");
       n=sc.nextInt();
       a = new int[n];
       System.out.println("enter the elements of array");
       for(i=0;i<n;i++)
           a[i]=sc.nextInt();
       for(i=0;i<n;i++)
       {
           s=s+a[i];
       }
       avg=s/n;
       System.out.println("Sum is"+s);
       System.out.println("Average is"+avg);
    }
}