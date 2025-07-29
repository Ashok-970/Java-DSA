package Day_3;
import java.util.Scanner;
public class MagicNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a magic number:");
        int n = s.nextInt();
        int sum = 0;
        while (n > 0 || sum > 9) {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        if (sum == 1) {
            System.out.println("It is a magic number.");
        } else {
            System.out.println("It is not a magic number.");
        }
    }
}
