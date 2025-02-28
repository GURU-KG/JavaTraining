import java.util.Scanner;

public class PronicNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = scan.nextInt();
        for (int i = 1; i <= n/2; i++) {
                if(i*(i+1)==n)
                {
                    System.out.println("It is pronic");
                    return;
                }
        }
            System.out.println("It is not a pronic");
    }
}
