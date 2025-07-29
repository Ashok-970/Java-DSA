package Day_5;
import java.util.Scanner;
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] digits = new int[s.nextInt()];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = s.nextInt();
        }
        int[] result = plusOne(digits);
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}