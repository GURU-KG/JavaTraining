class Palindrome{
    public static void strPalindrome(String str){
        String original = str;
        StringBuilder res = new StringBuilder(str);
        res.reverse();
        if(res.toString().equals(str)){
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("It is not a Palindrome");
        }
    }

    public static void bufferPalindrome(String str){
        StringBuffer res = new StringBuffer(str);
        res.reverse();
        if(res.toString().equals(str)){
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("It is not a Palindrome");
        }
    }

    public static void builderPalindrome(String str){
        StringBuilder res = new StringBuilder(str);
        res.reverse();
        if(res.toString().equals(str)){
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("It is not a Palindrome");
        }
    }

    public static void palindrome(String str){
        int start = 0;
        int end = str.length()-1;
        String res = "";
        while(start <= end){
            res = res + str.charAt(end);
            end--;
        }
        if(res.toString().equals(str)){
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("It is not a Palindrome");
        }
    }
}
public class UsingStringBuiltInFunctionIsPalindromeOrNot extends Palindrome{
    public static void main(String[] args) {
        strPalindrome("racecar");
        bufferPalindrome("madam");
        builderPalindrome("malayalam");
        palindrome("hello");
    }
}

