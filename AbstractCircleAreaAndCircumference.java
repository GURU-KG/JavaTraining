import java.util.*;
   abstract class AbstractCircleAreaAndCircumference
    {
        static double area;
        static double circumference;
        static void area()
        {
            int r=2;
            float pi= 3.14f;
            double a =pi*r*r;
            System.out.println("Area="+a);
        }
        static void circumference()
        {
            int r=2;
            float pi=3.14f;
            double result=2*pi*r*r;
            System.out.println("Circumference="+result);
        }
    
       
        static public void main(String[] args){
        {
           area();
           circumference();
        }
    }
}
