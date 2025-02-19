import java.util.*;
public class PrintMatrix
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter No.of rows:");
		int row=scan.nextInt();
		System.out.print("Enter No.of cols:");
		int col=scan.nextInt();
		System.out.println("Enter the matrix");
		int a[][] = new int [row][col];
		for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
		         a[i][j]=scan.nextInt();
		    }
		}
		System.out.println("Output:");
		for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
		        System.out.print(a[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}
