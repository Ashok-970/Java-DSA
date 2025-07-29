import java.util.HashMap;
import java.util.Map;

public class CharCount {
     public static void countCharOcc(String s){
        HashMap<Character, Integer> charCounts = new HashMap<>();

        for(char c : s.toCharArray()){
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : charCounts.entrySet()){
            System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        // This is a placeholder for the main method.
        // You can add your code here to execute when the program runs.
        countCharOcc("apple");    
    }
    
}

