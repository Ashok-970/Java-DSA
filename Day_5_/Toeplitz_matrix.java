import java.util.Scanner;
public class Toeplitz_matrix {
    public static boolean isToeplitzMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }int rows = matrix.length;
        int cols = matrix[0].length;
        for (int col = 0; col < cols; col++) {
            if (!checkDiagonal(matrix, 0, col)) {
                return false;
            }
        }
        for (int row = 1; row < rows; row++) {
            if (!checkDiagonal(matrix, row, 0)) {
                return false;
            }
        }return true;
    }
    private static boolean checkDiagonal(int[][] matrix, int startRow, int startCol) {
        int value = matrix[startRow][startCol];
        int row = startRow;
        int col = startCol;
        while (row < matrix.length && col < matrix[0].length) {
            if (matrix[row][col] != value) {
                return false;
            }
            row++;
            col++;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(isToeplitzMatrix(matrix));
    }
}