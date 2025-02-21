import java.util.*;
class Add{
    private int a,b,c;
    
    private void get()
    {
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = a+b;
    }
    public void display()
    {
        get();
        System.out.println("Sum = "+c);
    }
}
 class ClassAddTwoNumUsePrivate
{
	public static void main(String[] args) {
		Add a1 = new Add();
		a1.display();
	}
}
