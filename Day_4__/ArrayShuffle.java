package Day_5;
public class ArrayShuffle {
    public static int[] shuffle(int[] array, int n) {
        int[] result = new int[array.length];
        for (int i = 0; i < n; i++) {
            result[2*i] = array[i];
            result[2*i+1] = array[i + n];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {2,5,1,3,4,7};
        int n = 4;
        int[] shuffled = shuffle(array, n);

        for (int num : shuffled) {
            System.out.print(num + " ");
        }
    }
}