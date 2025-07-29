public class LowHighDiff {
    public static void main(String[] args) {
        int[] a = {22,78,32,15,96,84,39,46};
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < a.length/2; i++) {
            
            if (a[i] > high) {
                high = a[i];
            }
        }
        for (int i = a.length/2; i < a.length+1; i++) {
            if (a[i] < low) {
                low = a[i];
            }
        }

        System.out.println("Difference: " + (high - low));
    }
}
