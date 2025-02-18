public class ArrCombine {
    public static void main(String[] args) {
        int arr[] = {10, 5};
        int num1 =arr[0]*10+arr[1];
        int num2 =arr[1]*100+arr[0];
        
        if (num1>num2){
            System.out.println(num1);
        }
            else{
                System.out.println(num2);
            }
        }
    }

