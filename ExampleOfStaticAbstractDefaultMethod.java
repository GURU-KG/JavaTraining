import java.util.*;
interface A{
   abstract void name1();
   static void name2()
   {
       System.out.println("Guru");
   }
   default void name3()
   {
       System.out.println("Karthi");
   }
}
interface B extends A{
     void name1();
    static void name2()
    {
        A.name2();
    }
    default void name4()
    {
        System.out.println("Keyan");
    }
}
class C implements B{
    public void name1()
    {
        System.out.println("Adhi");
    }
}

public class Main
{
	public static void main(String[] args) {
		C obj =new C();
		obj.name1();
		obj.name3();
		obj.name4();
		B.name2();
	}
}
