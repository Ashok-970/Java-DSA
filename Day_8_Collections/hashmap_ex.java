
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class hashmap_ex {
    public static void main(String[] args) {
        // Example usage of HashMap
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        
        System.out.println("HashMap: " + map);
        System.out.println("Value for key 'Two': " + map.get("Two"));
        
        map.remove("One");
        System.out.println("After removing 'One': " + map);
        
        System.out.println("Size of HashMap: " + map.size());
        System.out.println("Is HashMap empty? " + map.isEmpty());
        
        System.out.println("Keys in HashMap:");
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        
        System.out.println("Values in HashMap:");
        for (Integer value : map.values()) {
            System.out.println(value);
        }
        
        System.out.println("Entries in HashMap:");
        for (java.util.Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        map.clear();
        System.out.println("HashMap after clear: " + map);
        System.out.println("Is HashMap empty after clear? " + map.isEmpty());
        map.put("Four", 4);
        System.out.println("HashMap after adding 'Four': " + map);
        System.out.println("Contains key 'Four'? " + map.containsKey("Four"));
        System.out.println("Contains value 4? " + map.containsValue(4));
        System.out.println("HashMap after adding 'Five': " + map.put("Five", 5));
        System.out.println("HashMap after adding 'Six': " + map.put("Six", 6));
        System.out.println("Final HashMap: " + map);
        System.out.println("HashMap after removing 'Five': " + map.remove("Five"));
        System.out.println("Final HashMap after removing 'Five': " + map);
        System.out.println("Final HashMap after removing 'Six': " + map.remove("Six"));
        System.out.println("Final HashMap after removing 'Six': " + map);
        System.out.println("Final HashMap after removing 'Four': " + map.remove("Four"));
        System.out.println("Final HashMap after removing 'Four': " + map);
        System.out.println("Final HashMap after removing 'Two': " + map.remove("Two"));
        System.out.println("Final HashMap after removing 'One': " + map.remove("One"));
        System.out.println("Final HashMap after removing 'Three': " + map.remove("Three"));
        System.out.println("Final HashMap after removing 'Three': " + map); 
        System.out.println("Final HashMap after removing 'One': " + map.remove("One"));
        System.out.println("Final HashMap after removing 'Two': " + map.remove("Two"));
        System.out.println("Final HashMap after removing 'Three': " + map.remove("Three"));
        System.out.println("Final HashMap after removing 'Four': " + map.remove("Four"));
        System.out.println("Final HashMap after removing 'Five': " + map.remove("Five"));
        System.out.println("Final HashMap after removing 'Six': " + map.remove("Six "));
        System.out.println("Final HashMap after removing 'Seven': " + map.remove("Seven"));
        System.out.println("Final HashMap after removing 'Eight': " + map.remove("Eight"));

        Collection<Integer> values = map.values();
        System.out.println("Values in HashMap:");
        for (Integer value : values) {
            System.out.println(value);
        }   
        System.out.println("Final HashMap after removing all elements: " + map);
        System.out.println("Final HashMap after removing all elements: " + map.isEmpty());
        System.out.println("Final HashMap after removing all elements: " + map.size());
        Set<Map.Entry<String, Integer>> keys = map.entrySet();
        System.out.println("Keys in HashMap:");
        for (Map.Entry<String, Integer> entry : keys) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }   
        System.out.println("Final HashMap after removing all elements: " + map);
        System.out.println("Final HashMap after removing all elements: " + map.isEmpty());
        System.out.println("Final HashMap after removing all elements: " + map.size());
        System.out.println("Final HashMap after removing all elements: " + map);
    
    }
    
}
