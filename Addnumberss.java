import java.util.*;
public class Addnumberss
{
	public static void main(String[] args) {
	int x=8;
	int n=8;
	int num=0;
	int sum=0;
	for( int i=1; i<=n;i++){
	    num=num*10+x;
	    System.out.println(num);
	    sum+=num;
	}System.out.println("total:"+sum);
	}
}
