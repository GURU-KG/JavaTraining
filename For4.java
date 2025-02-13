import java.util.*;
class For4{
    public static void main(String[]args){
        int i,j;
        
        int n =4;
        int number=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(number);
                number++;
            }System.out.println();
        }
    }
}
