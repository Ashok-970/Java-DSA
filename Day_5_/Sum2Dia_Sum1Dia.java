import java.util.Scanner;

public class Sum2Dia_Sum1Dia {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int sum2=0;
        int sum1=0;
        
        int[][] a=new int[n][m];
        for (int i = 0; i<n; i++) {
            for(int j=0;j<m;j++){
                a[i][j]=s.nextInt();
            }
        }
    
        for (int i = 0; i<n; i++) {
            for(int j=0;j<m;j++){
                if(i==j){
                    sum1+=a[i][j];
                }
                if(i+j==n-1){
                    sum2+=a[i][j];
                }
            }
        }
        
        System.out.println("Sum2Dia_Sum1Di"+(sum2-sum1));
    }
}
