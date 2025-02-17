import java.math.BigInteger;

public class AddTwoStringOfNum {
    public static void main(String[] args) {
        String a = "999888777666555444333222111";
        String b = "999888777666555444333222111";
        
        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);
        
        BigInteger sum = num1.add(num2);
        
        System.out.println("Sum: " + sum);
    }
}
