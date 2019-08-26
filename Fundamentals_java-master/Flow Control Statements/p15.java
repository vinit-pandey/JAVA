class p15 
{ 
    public static void main(String ar[]) 
    { 
       long num,x,sum=0; 
       num=Integer.parseInt(ar[0]); 
             while(num>0) 
          { 
                 x = num%10; 
                 sum += x; 
                 num /=10; 
           } 
                 System.out.println("Sum of Digits of Number is :" +sum); 
      }           
}