import java.util.*;
class Student{
    String name;
    int reg_no;
    
    void inp(String n,int r)
    {
        name=n;
        reg_no=r;
        System.out.println(name);
        System.out.println(reg_no);
    }
}


public class ClsCreationStudDetails
{
	public static void main(String[] args) {
		Student s1=new Student();
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter name:");
		String n=scan.nextLine();
		System.out.print("Enter reg_no:");
		int r =scan.nextInt();
		s1.inp(n,r);
		
	}
}  
