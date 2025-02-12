import java.util.*;
class IncreDecre{
    public static void main(String[]args)
    {
        int x = 10;
        int v = --x + x++ + ++x + --x + x++;
        int w = x++ + ++x + ++x + x++ + ++x;
        int z = --x + --x + --x + --x;
        System.out.println(v);
         System.out.println(w);
          System.out.println(z);
    }
}
