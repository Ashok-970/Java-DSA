package Day_4;
import java.util.*;


public class Shift0Begin {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }

        int n = a.length;
        int[] b = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                b[j++] = a[i];
                
            }
        }
        for (int i = 0; i < n; i++) {
            if(a[i] != 0)
                b[j++] = a[i];
            
        }

    
        

        System.out.println(Arrays.toString(b));
    }

    
}
