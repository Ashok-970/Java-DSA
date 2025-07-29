/*import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("World");
        System.out.println(list);

        LinkedList<Integer> n = new LinkedList<>();
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
        n.addLast(50);
        System.out.println("Add Last:"+ n);
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

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Iterating using for-each loop:");
        for (String str : list) {
            System.out.println(str);
        }   

        System.out.println("peek: " + n.peek());
        System.out.println("peekFirst: " + n.peekFirst());
        System.out.println("peekLast: " + n.peekLast());
        System.out.println("poll: " + n.poll());
        System.out.println("pollFirst: " + n.pollFirst());
        System.out.println("pollLast: " + n.pollLast());
        //System.out.println("pollFirst: " + n.pollFirst());
        //System.out.println("pollLast: " + n.pollLast());
        System.out.println("List after poll operations: " + n);
        System.out.println("Element at index 0: " + n.get(0));
        System.out.println("Element at index 1: " + n.get(1));


        System.out.println("List after removing first element: " + n.removeFirst());
        System.out.println("List after removing last element: " + n.removeLast());
        System.out.println("List after removing element at index 0: " + n.remove(0));
        System.out.println("List after removing element 30: " + n.remove(Integer.valueOf(30)));
        System.out.println("List after removing element 40: " + n.remove(Integer.valueOf(40)));
        System.out.println("List after removing element 50: " + n.remove(Integer.valueOf(50)));
        System.out.println("List after removing element 20: " + n.remove(Integer.valueOf(20)));
        System.out.println("List after removing element 10: " + n.remove(Integer.valueOf(10)));
        System.out.println("List after removing all elements: " + n);
    
        n.clear();
        System.out.println("List after clear: " + n);
    }
}*/

import java.util.Iterator;
import java.util.List;
import java.util.Vector;


public class LinkedListExample {

    public static void main(String[] args) {
        Vector<String> list = new Vector<>();
        list.add("Hello");
        list.add("World");
        System.out.println(list);

        Vector<Integer> n = new Vector<>();
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
        n.addLast(50);
        System.out.println("Add Last:"+ n);
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

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Iterating using for-each loop:");
        for (String str : list) {
            System.out.println(str);
        }   

        /*System.out.println("peek: " + n.peek());
        System.out.println("peekFirst: " + n.peekFirst());
        System.out.println("peekLast: " + n.peekLast());
        System.out.println("poll: " + n.poll());
        System.out.println("pollFirst: " + n.pollFirst());
        System.out.println("pollLast: " + n.pollLast());
        //System.out.println("pollFirst: " + n.pollFirst());
        //System.out.println("pollLast: " + n.pollLast());
        System.out.println("List after poll operations: " + n);*/
        System.out.println("Element at index 0: " + n.get(0));
        System.out.println("Element at index 1: " + n.get(1));


        System.out.println("List after removing first element: " + n.removeFirst());
        System.out.println("List after removing last element: " + n.removeLast());
        System.out.println("List after removing element at index 0: " + n.remove(0));
        System.out.println("List after removing element 30: " + n.remove(Integer.valueOf(30)));
        System.out.println("List after removing element 40: " + n.remove(Integer.valueOf(40)));
        System.out.println("List after removing element 50: " + n.remove(Integer.valueOf(50)));
        System.out.println("List after removing element 20: " + n.remove(Integer.valueOf(20)));
        System.out.println("List after removing element 10: " + n.remove(Integer.valueOf(10)));
        System.out.println("List after removing all elements: " + n);
    
        n.clear();
        System.out.println("List after clear: " + n);
    }
}

