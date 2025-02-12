import java.util.*;
class PrimeNum{
    public static void main(String[]args)
    {
       int i;
       int n=21;
       int count=0;
       for(i=1;i<=n;i++)
       {
           if(n%i==0){
               count++;
           }
       }
       if(count==2)
       {
           System.out.println("It is prime number");
       }
       else{
           System.out.println("It is not a prime number");
       }
    }
}
