public class HarshadNumbersInRange {
    public static void main(String[]args){
        int start =500;
        int range =2500;
        for (int i = start; i <= range ; i++) {
            int og=i;
            int sum=0;
            while(i>0){
                int lastdigit=i%10;
                sum=sum+lastdigit;
                i/=10;
            }

            if(og%sum==0)
            {
                System.out.println(og);
            }
            i=og;

        }

    }
}

