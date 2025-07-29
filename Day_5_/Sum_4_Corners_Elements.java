import java.util.Scanner;

public class Sum_4_Corners_Elements {
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
        System.out.println(matrix.length + " " + matrix[0].length);

    
        int sum = sumCorners(matrix);
        System.out.println("Sum of corner elements: " + sum);
    }

    public static int sumCorners(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int sum = matrix[0][0] + matrix[0][matrix[0].length - 1] +
                  matrix[matrix.length - 1][0] + matrix[matrix.length - 1][matrix[0].length - 1];
        return sum;
    }
}
