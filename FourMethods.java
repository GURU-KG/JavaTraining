import java.util.*;
class Calculator{
    Scanner scan=new Scanner(System.in);
    void add()
    {
        int a,b,c;
        a= scan.nextInt();
        b= scan.nextInt();
        c= a+b;
        System.out.println("Addition : "+c);
    }
    int dif()
    {
        int d,e,f;
        d=scan.nextInt();
        e= scan.nextInt();
        f= d-e;
        return f;
    }
    void mul(int g,int h)
    {
        int val3=g*h; 
        System.out.println("Multiplication = "+val3);
    }
    int div(int i,int j)
    {
        int k=i/j;
        return k;
    }
}
public class FourMethods
{
	public static void main(String[] args) {
	    Calculator c1 = new Calculator();
	    c1.add();
	    int Sub = c1.dif();
	    System.out.println("Difference = "+Sub);
	    c1.mul(10,5);
	    int Div = c1.div(10,2);
	    System.out.println("Division = "+Div);
	    
		
	}
}
