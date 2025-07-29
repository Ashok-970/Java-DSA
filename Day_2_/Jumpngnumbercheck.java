import java.util.*;
public class Jumpingnumbercheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a jumping number:");
        int n = s.nextInt();
        boolean isJumping = true;
        
        if (n < 10) {
            System.out.println("It is a jumping number.");
            return;
        }
        
        int prevDigit = n % 10;
        n /= 10;
        
        while (n > 0) {
            int currentDigit = n % 10;
            if (Math.abs(currentDigit - prevDigit) != 1) {
                isJumping = false;
                break;
            }
            prevDigit = currentDigit;
            n /= 10;
        }
        
        if (isJumping) {
            System.out.println("It is a jumping number.");
        } else {
            System.out.println("It is not a jumping number.");
        }
    }
}