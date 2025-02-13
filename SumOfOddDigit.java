import java.util.*;
class SumOfOddDigit{
    public static void main(String[]args){
        int number=123456;
        int sum=0;
        while(number>0){
            int digit=number%10;
            {
                if(digit%2!=0)
                {
                    sum+=digit;
                }
                number/=10;
            }
        }
         System.out.println("sum of even digits:"+sum);
    }
}
