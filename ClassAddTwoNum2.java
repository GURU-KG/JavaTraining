import java.util.*;
class Add{
    public int a,b,c;
    
    public void display()
    {
        System.out.println("Sum = "+c);
    }
}
public class ClassAddTwoNum2
{
	public static void main(String[] args) {
	Add a1 = new Add();
	Scanner scan = new Scanner(System.in);
	 a1.a = scan.nextInt();
	 a1.b = scan.nextInt();
	 a1.c = a1.a+a1.b;
	 a1.display();
	}
}
