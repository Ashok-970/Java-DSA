package Day_5;
import java.util.Scanner;
public class ReplaceEle_GreatRight {
    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max = -1;
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            if (temp > max) {
                max = temp;
            }
        }
        return arr;
    }public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[s.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int[] res = replaceElements(arr);
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}