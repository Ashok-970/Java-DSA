import java.util.Scanner;

public class RemoveAdjacentDuplicates {
    public static String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();

        for (char c : s.toCharArray()) {
            int len = stack.length();
            if (len > 0 && stack.charAt(len - 1) == c) {
                stack.deleteCharAt(len - 1); // Remove duplicate
            } else {
                stack.append(c); // Add current character
            }
        }

        return stack.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = removeDuplicates(input);
        System.out.println("Final string after removing adjacent duplicates: " + result);

        scanner.close();
    }
}
