import java.util.*;
class Addition{
    private int a,b,c;
    
    public void sum()
    {
        Scanner scan = new Scanner(System.in);
         System.out.print("Enter the value of a :");
         a=scan.nextInt();
         System.out.print("Enter the value of b :");
         b=scan.nextInt();
         c=a+b;
         System.out.println("Sum="+c);
    }
}
public class ClassAddTwoNum
{
	public static void main(String[] args) {
		Addition a1 = new Addition();
		a1.sum();
	}
}
