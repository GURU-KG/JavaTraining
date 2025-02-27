public class AutomorphicNumbers {
    public static void main(String[] args) {
        System.out.println("Automorphic Numbers from 1 to 1000:");

        for (int i = 1; i <= 1000; i++) {
            int n = i;
            int sq = n * n;
            int temp = n;

            while (temp > 0) {
                if (sq % 10 != temp % 10) {
                    break;
                }
                sq = sq / 10;
                temp = temp / 10;
            }

            if (temp == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
