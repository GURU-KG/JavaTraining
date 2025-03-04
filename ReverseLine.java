public class ReverseLine {
    public static void main(String[] args) {
        String str="   I Love Java Programming";
        String res = str.trim();
        String words[]= res.split(" ");
        int start=0;
        int end = words.length-1;
        while(start <= end) {
            String temp = words[start];
            words[start] = words[end];
            words[end] = temp;
            start++;
            end--;
        }
            String solution = String.join(" ",words);
            System.out.print(solution);

    }
}
