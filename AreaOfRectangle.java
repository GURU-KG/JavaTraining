import java.util.*;
class Shape {
    public int l;
    public int b;

    void area() {
        System.out.println("Area of Rectangle:");
    }
}
class Rectangle extends Shape{
    Rectangle(int l,int b)
    {
        this.l=l;
        this.b=b;
    }

    @Override
    void area() {
        super.area();
        System.out.println(l*b);
    }
}

public class AreaOfRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5,3);
        r1.area();
    }
}
