package Day_5;
import java.util.Scanner;
public class StudentsHeight {
    public static int countStudentsNotInOrder(int[] heights) {
        int[] expected = heights.clone();
        java.util.Arrays.sort(expected);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] heights =new int[s.nextInt()];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = s.nextInt();
        }
        int result = countStudentsNotInOrder(heights);
        System.out.println(result); 
    }
}