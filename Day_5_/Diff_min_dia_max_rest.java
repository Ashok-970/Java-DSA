
    
import java.util.Scanner;

public class Diff_min_dia_max_rest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] a=new int[n][m];
        
        int max=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        
        
        for (int i = 0; i<n; i++) {
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
    
        for (int i = 0; i<n; i++) {
            for(int j=0;j<m;j++){
                if(i==j){
                    if (a[i][j] > min1) {
                        min1 = a[i][j];
                }
                    
                }
                if(i+j==n-1){
                    if (a[i][j] < min2) {
                        min2 = a[i][j];
                    }
                }
                
            }
        }
        int min = Math.min(min1, min2);
        for (int i = 0; i<n; i++) {
            for(int j=0;j<m;j++){
                if (i != j && i + j != n - 1) { 
                    if (a[i][j] > max) {
                        max = a[i][j];
                    }       
                }
            }
        }

        System.out.println("Difference between min element from two diagonals and max element from rest of the matrix:"+(max-min));
    }
    
    
}

    


