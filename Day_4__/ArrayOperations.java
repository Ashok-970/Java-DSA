package Day_5;

import java.util.*;

public class ArrayOperations {
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
        
        System.out.println(Arrays.toString(a));

        /*System.out.println("Sorted array");
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));


        int[] b=new int[m];
        for (int i = 0; i< m; i++) {
            b[i]=s.nextInt();
            
        }
        
        a=Arrays.copyOf(a, n+m);
        for(int i=0;i<m;i++){
            a[n+i]=b[i];
        }
        Arrays.sort(a);
        
        System.out.println("Merged Array"+ Arrays.toString(a));*/

        

        /*int[] c=Arrays.copyOf(a, n);
        System.out.println("Copied Array"+ Arrays.toString(c));

        int[] f=new int[n];
        Arrays.fill(f,7);
        System.out.println("Filled Array"+ Arrays.toString(f));

        System.out.println("Binary Search"+ Arrays.binarySearch(a, 3));*/
        

        }
    }

    

