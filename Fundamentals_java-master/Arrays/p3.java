import java.util.*;
class p3
{
public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int n,a[],val,flag=1;
       System.out.println("Enter the length of array");
       n=sc.nextInt();
       a=new int[n];
       System.out.println("Enter the Array");
       for(int i=0;i<n;i++)
           a[i]=sc.nextInt();
       System.out.println("Enter the value to be searched");
       val=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           if(a[i]==val)
           {
               System.out.println("Value present at "+(i+1));
               flag=0;
           }
       }
       if(flag==1)
           System.out.println(-1);
   }
}