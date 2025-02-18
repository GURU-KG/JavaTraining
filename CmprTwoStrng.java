import java.util.*;
public class CmprTwoStrng
{
	public static void main(String[] args) {
		String a = "110110" ;
		String b = "110110" ;
		int count= 0;
		for(int i=0;i<a.length();i++){
		    if(a.charAt(i)==b.charAt(i)){
		    count++;
		    }
		}
		if(count==a.length()){
		    System.out.println("yes");
		}
		else{
		    System.out.println("no");
		}
	    
	}
}
