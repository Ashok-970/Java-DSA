import java.util.Scanner;

public class Sum_large_small_Ele {
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
                if (a[i][j] < min) {
                    min = a[i][j];
                }
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }

        System.out.println("Sum of largest and smallest elements:"+(max+min));
    }
    
    
}

    

