import java.util.*;
public class ArrGetInputUseInt
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num=scan.nextInt();
		int a[]=new int[num];
		System.out.println("enter"+num+"numbers");
		for(int i=0;i<num;i++){
		    a[i]= scan.nextInt();
		}
		 System.out.println("Output:");
		 for(int i=0;i<num;i++){
		     System.out.print(a[i]+" ");
		 }
	}
}
