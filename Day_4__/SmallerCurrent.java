package Day_5;
public class SmallerCurrent {
    public static void main(String[] args) {
        int[] a = {8, 1, 2, 2, 3};
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] < a[i]) {
                    count++;
                }
                
            }System.out.print(count + " ");
                count = 0;
        }
    }
}