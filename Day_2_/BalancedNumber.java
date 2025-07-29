
import java.util.*;

public class BalancedNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to check if it is balanced:");
        int n = s.nextInt();
        int sumOdd = 0, sumEven = 0;
        int count = 0;

        while (n > 0) {
            int digit = n % 10;
            if (count % 2 == 0) {
                sumEven += digit;
            } else {
                sumOdd += digit;
            }
            n /= 10;
            count++;
        }

        if (sumOdd == sumEven) {
            System.out.println("The number is balanced.");
        } else {
            System.out.println("The number is not balanced.");
        }
    }
}
