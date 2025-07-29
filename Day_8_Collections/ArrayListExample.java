import java.util.ArrayList;
import java.util.List;
public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        System.out.println(list);

        ArrayList<Integer> n = new ArrayList<>();
        n.add(10);
        n.add(20);
        System.out.println(n);

        n.add(2, 30);
        System.out.println(n.get(2));

        n.set(0, 40);
        System.out.println(n);

        n.remove(1);
        System.out.println(n);

        System.out.println("Size of list: " + n.size());
        System.out.println("Is list empty? " + n.isEmpty());
        System.out.println("Does list contain 30? " + n.contains(30));
        System.out.println("Index of 40: " + n.indexOf(40));
        System.out.println("Last index of 30: " + n.lastIndexOf(30));
        System.out.println("Sublist from index 0 to 1: " + n.subList(0, 2));
        n.iterator().forEachRemaining(System.out::println);
        
    
        System.out.println("List after clearing: " + n);

        List<Integer> subList = n.subList(0, 1);
        System.out.println("Sublist: " + subList);
         
        Object[] array = n.toArray();
        System.out.println("Array from list: ");
        for (Object obj : array) {
            System.out.println(obj);
        }

        n.clear();
        System.out.println("List after clear: " + n);
        
    }
}
