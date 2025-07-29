import java.util.Scanner;

public class large_small_rest_corners {
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

        int largestRest = findLargestRest(matrix, n, m);
        int smallestRest = findSmallestRest(matrix, n, m);
        
        System.out.println("Largest element (excluding corners): " + largestRest);
        System.out.println("Smallest element (excluding corners): " + smallestRest);
    }

    // Exclude corners: (0,0), (0,m-1), (n-1,0), (n-1,m-1)
    public static int findLargestRest(int[][] matrix, int n, int m) {
        int largest = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!isCorner(i, j, n, m)) {
                    if (matrix[i][j] > largest) {
                        largest = matrix[i][j];
                    }
                } 
                
            }
        }
        return largest;
    }

    public static int findSmallestRest(int[][] matrix, int n, int m) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!isCorner(i, j, n, m)) {
                    if (matrix[i][j] < smallest) {
                        smallest = matrix[i][j];
                    }
                }
            }
        }
        return smallest;
    }

    

    public static boolean isCorner(int i, int j, int n, int m) {
        return (i == 0 && j == 0) ||
               (i == 0 && j == m - 1) ||
               (i == n - 1 && j == 0) ||
               (i == n - 1 && j == m - 1);
    }
}