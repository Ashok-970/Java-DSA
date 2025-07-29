import java.util.*;
public class DigitDiff {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = s.nextInt();
    

        while (n > 0) {
            int digit = n % 10;
            int rev=n*10+digit;
            n /= 10;
        }


        System.out.println("Difference between largest and smallest digit: " + rev);
    }
}