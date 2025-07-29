package Day_5;
import java.util.Scanner;
public class Square_Sorted {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1, pos = n - 1;
        while (left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];
            if (leftSq > rightSq) {
                result[pos--] = leftSq;
                left++;
            } else {
                result[pos--] = rightSq;
                right--;
            }
        }
        return result;
    }public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] nums = new int[s.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }
        int[] res = sortedSquares(nums);
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}