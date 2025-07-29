
import java.util.*;

public class Binaryarray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        int n = a.length;
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                b[i] = 0;
            } else {
                b[i] = 1;
            }
        }

        System.out.println(Arrays.toString(b));
    }
}
