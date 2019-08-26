import java.util.*;
class p5
{
public static void main(String[] args)
   {
       int i,j,n,a[],temp;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter length of array");
       n=sc.nextInt();
       a = new int[n];
       System.out.println("enter the elements of array");
       for(i=0;i<n;i++)
           a[i]=sc.nextInt();
       for(i=0;i<n;i++)
       {
          for(j=i+1;j<n;j++)
          {
              if(a[i]>a[j])
              {
              temp=a[i];
              a[i]=a[j];
              a[j]=temp;
          }
       }
      
    }
       System.out.println("Smallest two are "+a[0]+" and"+a[1]);
       System.out.println("Largest two are "+a[n-1]+" and"+a[n-2]);
}
}