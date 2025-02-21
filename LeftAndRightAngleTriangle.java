import java.util.*;
class LeftAngleTriangle{
    void left(){
    int n=5;
    for(int row =1;row<=n;row++){
        for(int spa=1;spa<=n-row;spa++){
            System.out.print(" ");
        }
        for(int star=1;star<=row;star++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
    void subtopic()
    {
        System.out.println("Another triangle:");
    }
}

class RightAngleTriangle{
    void right()
    {
        int n=5;
        for(int row=1;row<=n;row++){
            for(int star=1;star<=row;star++){
            System.out.print("*");
        }
        System.out.println();
        }
    }
}

public class  LeftAndRightAngleTriangle
{
	public static void main(String[] args) {
		LeftAngleTriangle obj1 =new LeftAngleTriangle();
		obj1.left();
		obj1.subtopic();
		RightAngleTriangle obj2 =new RightAngleTriangle();
		obj2.right();
	}
}
