
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a perfect number:");
        int a = s.nextInt();
        int b = s.nextInt();
        int t = s.nextInt();
        int count = 0;
        for (int j = a; j <= b; j++) {
            int sum = 0;
            int n=j;
                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) {
                        sum += i;
                    }
                }
            }
        }
    }

    public static void checkPerfectNumber(int n) {
        int sum = 0;
        n=j;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println(n + " is a perfect number");
        } else {
            System.out.println(n + " is not a perfect number");
        }
    }
}
