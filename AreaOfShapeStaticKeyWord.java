import java.util.*;

class AreaOfShapeStaticKeyWord{
    static class Shape{
    static Scanner scan=new Scanner(System.in);
    static void area()
    {
        int a;
        a = scan.nextInt();
        System.out.println("Area of Square : "+(a*a));
    }
    static void area(int a,int h)
    {
        
        System.out.println("Area of Rectangle : "+(a*h));
    }
    static void area(int r)
    {
       
        System.out.println("Area of Circle : "+(3.14f*r*r));
    }
    }


	public static void main(String[] args) {
	    Shape.area();
		Shape.area(2,3);
		Shape.area(5);
	}


}
