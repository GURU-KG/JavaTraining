import java.util.*;
class Book{
    String title;
    String author;
    double price;
    Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void display()
    {
        System.out.println("the title of the book is "+title);
        System.out.println("the author of the book is "+author);
        System.out.println("the price of the book is "+price);
    }
}
public class ConstructorExample1PC
{
	public static void main(String[] args) {
	    Book b1=new Book("The Man","Guru",100.0);
	    b1.display();
	
	}
}
