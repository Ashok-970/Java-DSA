package Day_5;
import java.util.Scanner;
public class TwonumbersSum {
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[s.nextInt()];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        int target = s.nextInt();
        int[] result = twoSum(a, target);
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers add up to " + target);
        }
    }

}

