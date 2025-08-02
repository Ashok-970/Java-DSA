import java.util.*;

public class DailyTemperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>(); // stores indices

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                answer[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperatures separated by spaces: ");
        String[] input = scanner.nextLine().split(" ");
        int[] temperatures = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        int[] result = dailyTemperatures(temperatures);
        System.out.println("Days to wait for warmer temperature: " + Arrays.toString(result));

        scanner.close();
    }
}
