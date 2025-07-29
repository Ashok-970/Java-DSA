
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;




public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(); 
        System.out.println(set);
        set.add("Hello");
        set.add("World");   
        System.out.println(set);
        set.add("Hello"); // Duplicate, will not be added
        System.out.println(set);
        set.remove("World");
        System.out.println(set);
        System.out.println("Size of set: " + set.size());   
        System.out.println("Is set empty? " + set.isEmpty());
        System.out.println("Contains 'Hello'? " + set.contains("Hello"));
        System.out.println("Contains 'World'? " + set.contains("World"));
        System.out.println("Iterating over set:");
        for (String str : set) {
            System.out.println(str);
        }
        System.out.println("Iterating using iterator:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        Object[] array = set.toArray();
        System.out.println("Array from set:");
        for (Object obj : array) {
            System.out.println(obj);
        }
        System.out.println("Sublist from index 0 to 1: " + set.stream().limit(2).toList());
        System.out.println("Index of 'Hello': " + (set.contains("Hello") ? 0 : -1));
        System.out.println("Last index of 'Hello': " + (set.contains("Hello") ? 0 : -1));
        set.add("Java");
        System.out.println("Set after adding 'Java' : " + set);
        set.clear();
        System.out.println("Set after clear: " + set);  

    }
    
}
