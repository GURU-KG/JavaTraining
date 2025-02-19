import java.util.*;

public class SortingMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter No. of rows: ");
        int row = scan.nextInt();
        System.out.print("Enter No. of cols: ");
        int col = scan.nextInt();

        int a[][] = new int[row][col];

        System.out.println("Enter the matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = scan.nextInt();
            }
        }

        int[] flatArray = new int[row * col];
        int index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                flatArray[index++] = a[i][j];
            }
        }

        Arrays.sort(flatArray);

        index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = flatArray[index++];
            }
        }

        System.out.println("Sorted Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        scan.close();
    }
}
