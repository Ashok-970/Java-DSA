

public class Most_FreqChar {
    public static String mostFrequentChar(String s) {
        int[] freq = new int[256]; // Assuming ASCII characters
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        char mostFrequent = s.charAt(0);
        int maxCount = freq[mostFrequent];

        for (int i = 1; i < s.length(); i++) {
            if (freq[s.charAt(i)] > maxCount) {
                maxCount = freq[s.charAt(i)];
                mostFrequent = s.charAt(i);
            }
        }

        return mostFrequent + "," + maxCount;
    }

    public static void main(String[] args) {
        String input = "mississippi";
        String result = mostFrequentChar(input);
        System.out.println("Most frequent character: " + result);
    }
    
}
