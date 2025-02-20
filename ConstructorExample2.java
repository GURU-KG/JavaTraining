import java.util.*;
class Car{
    String brand;
    Car()
    {
        brand="unknown";
    }
    void setBrand(String anotherbrand)
    {
        brand=anotherbrand;
        System.out.println("Anotherbrand is "+brand);
    }
}
public class ConstructorExample2
{
	public static void main(String[] args) {
		Car c1=new Car();
		c1.setBrand("thor");
	}
}
