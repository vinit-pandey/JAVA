import java.util.*;
class p11
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        System.out.println("Enter 9 array elements");
        for(int i=0;i<3;i++)
        for(int j=0;j<3;j++)
        a[i][j]=sc.nextInt();
        int max=a[0][0];
        for(int i=0;i<3;i++){
        for(int j=0;j<3;j++)
        System.out.print(a[i][j]+"\t");
        System.out.println();}
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(a[i][j]>max)
                max=a[i][j];
            }
        }
        System.out.println("Greatest element="+max);
    }
}


