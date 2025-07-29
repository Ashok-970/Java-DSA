import java.util.Scanner;
public class Sum_BorderEle_AltRows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int sumBorder = sumBorderElements(matrix, n, m);
        System.out.println("Sum of border elements: " + sumBorder);
    }

    public static int sumBorderElements(int[][] matrix, int n, int m) {
        int sum = 0;

        // Sum top row
        for (int j = 0; j < m; j++) {
            sum += matrix[0][j];
        }

        // Sum bottom row
        for (int j = 0; j < m; j++) {
            sum += matrix[n - 1][j];
        }

        // Sum left and right columns excluding corners
        for (int i = 1; i < n - 1; i++) {
            sum += matrix[i][0]; // Left column
            sum += matrix[i][m - 1]; // Right column
        }

        return sum;
    }
}
