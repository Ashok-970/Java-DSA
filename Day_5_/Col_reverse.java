import java.util.Scanner;

public class Col_reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i<n; i++) {
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        reverseColumns(matrix);
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void reverseColumns(int[][] matrix) {
        int a = matrix.length;
        int b = matrix[0].length;
        for (int j = 0; j < b; j++) {
            int top = 0;
            int bottom = a - 1;
            while (top < bottom) {
                int temp = matrix[top][j];
                matrix[top][j] = matrix[bottom][j];
                matrix[bottom][j] = temp;
                top++;
                bottom--;
            }
        }
    }
}
