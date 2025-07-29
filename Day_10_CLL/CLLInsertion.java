import java.util.*;

public class CLLInsertion {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node tail = null;  // Only tail is needed for CLL

    // Insert at beginning
    void insertAtBeginning(int value) {
        Node newNode = new Node(value);

        if (tail == null) {
            tail = newNode;
            tail.next = tail;  // Point to itself
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
        }
    }

    // Insert at end
    void insertAtEnd(int value) {
        Node newNode = new Node(value);

        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Insert at given position (1-based)
    void insertAtPosition(int value, int position) {
        Node newNode = new Node(value);

        if (position <= 1 || tail == null) {
            insertAtBeginning(value);
            return;
        }

        Node current = tail.next; // Start from head
        int count = 1;

        while (count < position - 1 && current != tail) {
            current = current.next;
            count++;
        }

        newNode.next = current.next;
        current.next = newNode;

        if (current == tail) {
            tail = newNode;  // If inserted at end
        }
    }

    // Print the list
    void printCLL() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = tail.next;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != tail.next);
        System.out.println("(back to head)");
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CLLInsertion list = new CLLInsertion();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            int val = sc.nextInt();

            System.out.print("Choose insertion: 1.Beginning 2.End 3.Position -> ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    list.insertAtBeginning(val);
                    break;
                case 2:
                    list.insertAtEnd(val);
                    break;
                case 3:
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    list.insertAtPosition(val, pos);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        System.out.println("\nCircular Linked List:");
        list.printCLL();

        sc.close();
    }
}
