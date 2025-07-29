
import java.util.*;
public class Amicable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the range (start and end):");
        int start = s.nextInt();
        int end = s.nextInt();

        for (int n = start; n <= end; n++) {
            int sum1 = 0, sum2 = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum1 += i;
                }
            }
            for (int j = 1; j < sum1; j++) {
                if (sum1 % j == 0) {
                    sum2 += j;
                }
            }
            if (sum2 == n && n != sum1) {
                System.out.println(n + " is an amicable number with " + sum1);
            }
        }
    }
}