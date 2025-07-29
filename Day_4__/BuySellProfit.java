package Day_5;
import java.util.*;

public class BuySellProfit {
    public static void maxprofit(int[] a) {
        int min = 0;
        int max = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            else if ((a[i]-min) > max) {
                max = a[i]-min;
            }
        }
        
        System.out.println("Max profit: " + max);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[s.nextInt()];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        maxprofit(a);
    }
}