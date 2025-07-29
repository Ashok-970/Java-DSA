package Day_4;

import java.util.*;

public class HalfArraySort {

    public static void firstsorted(int[] a) {
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i+1; j < n / 2 - 1 - i; j++) {
                if (a[i] > a[j]) {
                    // swap a[j] and a[j+1]
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            
        }
        
        for (int i = n / 2 + 1; i < n - 1; i++) {
            for (int j = i + 1; j < n - 2 - i; j++) {
                if (a[i] < a[j]) {
                    // swap a[j] and a[j+1]
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

   

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        firstsorted(a);


    }

}
