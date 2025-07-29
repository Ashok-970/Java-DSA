package Day_4;
public class SortParity {
    public static int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] % 2 == 0) {
                left++;
            } else {
                // Swap odd element to the right
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                right--;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        int[] sorted = sortArrayByParity(nums);
        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }
}
