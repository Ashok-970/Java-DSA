
import java.util.HashMap;
public class Long_SubSting {
    public static String longestSubstringWithoutRepeating(String s) {
        int n = s.length();
        int maxLength = 0;
        int start = 0;
        String longestSubstring = "";

        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);

            if (charIndexMap.containsKey(currentChar)) {
                start = Math.max(charIndexMap.get(currentChar) + 1, start);
            }

            charIndexMap.put(currentChar, end);

            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                longestSubstring = s.substring(start, end + 1);
            }
        }

        return longestSubstring;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        String result = longestSubstringWithoutRepeating(input);
        System.out.println("Longest substring without repeating characters: " + result);
    }
    
}
