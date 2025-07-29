import java.util.*;

public class  Two_D_array{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        
        int[][] a=new int[n][m];
        for (int i = 0; i<n; i++) {
            for(int j=0;j<m;j++){
                a[i][j]=s.nextInt();
            }
        }
        /* 
        for (int i = 0; i<n; i++) {
            for(int j=0;j<m;j++){
                System.out.println(a[i][j]+" ");
            }
            System.out.println();
        }



        for(int[] row:a){
            for(int[] val:a){
                System.out.print(val+"");
            }
            System.out.println();
        }


        for(int i=0;i<a.length;i++){
            System.out.println(Arrays.toString(a));
        }*/

        for(int[] row:a){
            System.out.println(Arrays.toString(row));
        }
    }
}
        