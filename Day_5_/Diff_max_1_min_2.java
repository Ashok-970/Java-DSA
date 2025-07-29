
    
import java.util.Scanner;

public class Diff_max_1_min_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] a=new int[n][m];
        
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        
        
        for (int i = 0; i<n; i++) {
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
    
        for (int i = 0; i<n; i++) {
            for(int j=0;j<m;j++){
                if(i==j){
                    if (a[i][j] > max) {
                        max = a[i][j];
                }
                    
                }
                if(i+j==n-1){
                    if (a[i][j] < min) {
                        min = a[i][j];
                    }
                }
                
            }
        }

        System.out.println("Difference between largest in first diagonal and smallest in second diagonal :"+(max-min));
    }
    
    
}

    



