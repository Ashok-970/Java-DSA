package Day_5;
public class PivotIndex {
    public static int findPivot(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (leftSum == (totalSum - leftSum - arr[i])) {
                return i;
            }
            leftSum += arr[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        int pivot = findPivot(arr);
        if (pivot != -1) {
            System.out.println("Pivot index found at: " + pivot);
        } else {
            System.out.println("No pivot index found.");
        }
    }
}
