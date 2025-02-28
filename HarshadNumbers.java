public class HarshadNumbers {
    public static void main(String[]args){
            int n=15;
            int og=n;
            int sum=0;
            while(n>0){
                int lastdigit=n%10;
                sum=sum+lastdigit;
                n/=10;
            }
        System.out.println("sum of number:"+sum);
            if(og%sum==0)
            {
                System.out.println("It is the Harshad Number");
            }
            else {
                System.out.println("It is not the Harshad Number");
            }
        }
    }

