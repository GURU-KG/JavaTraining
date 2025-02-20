import java.util.*;
class book{
    String title;
    double price;
    
    book()
    {
        title="Java Programming";
        price=100.0;
    }
    void diplay()
    {
        System.out.println("Book Title:"+title);
        System.out.println("Book Price:"+price);
    }
}
public class ConstructorExample1
{
	public static void main(String[] args) {
		book b1=new book();
		b1.display();
	}
}
