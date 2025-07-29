package Day_4;
import java.util.*;
public class ReverseAltPairs {
    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length - 1; i += 4) {
            // Swap i and i+1
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        reverse(arr);
    }
}