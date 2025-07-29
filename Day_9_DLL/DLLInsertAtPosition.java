import java.util.*;

public class DLLInsertAtPosition {

    // Node class for DLL
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Head and tail of the list
    Node head = null;
    Node tail = null;

    // Function to insert at a specific position (1-based index)
    void insertAtPosition(int value, int position) {
        Node newNode = new Node(value);

        if (position <= 1 || head == null) {
            // Insert at beginning
            if (head == null) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
            return;
        }

        Node current = head;
        int count = 1;

        while (current.next != null && count < position - 1) {
            current = current.next;
            count++;
        }

        // Insert at the end
        if (current.next == null) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            // Insert in between
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
    }

    // Print forward
    void printForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + (current.next != null ? " <-> " : ""));
            current = current.next;
        }
        System.out.println();
    }

    // Print backward
    void printBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + (current.prev != null ? " <-> " : ""));
            current = current.prev;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLLInsertAtPosition list = new DLLInsertAtPosition();

        System.out.print("Enter number of elements to insert: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            int val = sc.nextInt();
            System.out.print("Enter position to insert: ");
            int pos = sc.nextInt();
            list.insertAtPosition(val, pos);
        }

        System.out.print("List (Forward): ");
        list.printForward();

        System.out.print("List (Backward): ");
        list.printBackward();

        sc.close();
    }
}
