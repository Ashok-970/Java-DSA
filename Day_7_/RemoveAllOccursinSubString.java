

public class RemoveAllOccursinSubString {
    public static String removeOccurrences(String s, String toRemove) {
        return s.replace(toRemove, "");
    }

    public static void main(String[] args) {
        String input = "abcabcabc";
        String toRemove = "ab";
        String result = removeOccurrences(input, toRemove);
        System.out.println("Result after removal: " + result);
    }
}
