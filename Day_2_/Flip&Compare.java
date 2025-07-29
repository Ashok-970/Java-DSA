import java.util.*;

public class Flip&Compare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int a= s.nextInt();
        int b= s.nextInt();
        while(a>0){
            int rem=a%10;
            rev=rev*10+rem;
            a/=10;
        }
        System.out.println("Reversed binary number: " + rev);

    }
}