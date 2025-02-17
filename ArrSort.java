import java.util.*;
 class ArrSort
{
	public static void main(String[] args) {
	 int arr[]={2,4,5,3,1};
	 Arrays.sort(arr);
	  System.out.println("Sorted array: " + Arrays.toString(arr));
	 int max = arr[0];
	  System.out.print("maxnumber:");
	 for(int i=1;i<arr.length;i++)
	 {
	     if(arr[i]>max)
	     
	         max=arr[i];
	     
	 }
	 System.out.println(max);
	}
}
