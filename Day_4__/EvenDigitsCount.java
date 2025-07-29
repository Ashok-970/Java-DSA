package Day_5;
import java.util.Scanner;
public class EvenDigitsCount {
    public static int countEvenDigits(int[] a) {
        int count = 0;
        int edn=0;
        for (int i: a) {
            int temp = a[i];
            while (temp > 0) {
                temp=temp / 10;  
                count++;
            }
            if (count % 2 == 0) {
                edn++;
            }
            
        }
        return edn;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[s.nextInt()];
        for(int i:a) {
            a[i] = s.nextInt();
        }
        System.out.println("Number of even digits: " + countEvenDigits(a));
    }
}