import java.util.*;
public class Row_reverse {
    public static void reverseRows(int[][] matrix) {
        for (int[] matrix1 : matrix) {
            int left = 0;
            int right = matrix1.length - 1;
            while (left < right) {
                int temp = matrix1[left];
                matrix1[left] = matrix1[right];
                matrix1[right] = temp;
                left++;
                right--;
            }
        }
        
    }

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
        System.out.println("Original Matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        reverseRows(matrix);

        System.out.println("Matrix After Row Reversal:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        sc.close();
        
    }
}
