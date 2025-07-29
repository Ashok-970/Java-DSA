package Day_5;
public class MissingNumber {
    public static int findMissingNumber(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2; 
        int arraySum = 0;
        
        for (int num : arr) {
            arraySum += num;
        }
        
        return totalSum - arraySum; 
    }

    public static void main(String[] args) {
        int[] arr = {2,3,0,5,1}; 
        int n = arr.length; 
        
        int missingNumber = findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missingNumber);
    }
    
}
