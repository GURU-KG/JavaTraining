import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = scan.nextInt();
        int[] binary =new int[10];
        int i=0;
        while(decimal!=0)
        {
            binary[i]=decimal%2;
            decimal=decimal/2;
            i++;
        }
        System.out.println("Binary Conversion Number:");
        for(int j=i-1;j>=0;j--)
        {
            System.out.print(binary[j]+" ");
        }

    }
}
