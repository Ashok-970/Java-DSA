import java.util.Scanner;

public class SparseMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        int zeroCount = 0;
        int totalElements = n * m;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] == 0) {
                    zeroCount++;
                }
            }
        }

        if (zeroCount > totalElements / 2) {
            System.out.println("The matrix is sparse.");
        } else {
            System.out.println("The matrix is not sparse.");
        }
        System.out.println("Number of zero elements: " + zeroCount);
        System.out.println("Number of non-zero elements: " + (totalElements - zeroCount));
    }
}