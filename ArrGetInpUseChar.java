import java.util.*;
public class ArrGetInpUseChar
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Number of Characters:");
		int num=scan.nextInt();
		char a[]= new char[num];
		System.out.println("enter "+num+" characters");
		for(int i=0;i<num;i++){
		    a[i]= scan.next().charAt(0);
		}
		 System.out.println("Output:");
		 for(int i=0;i<num;i++){
		     System.out.print(a[i]+" ");
		 }
	}
}
