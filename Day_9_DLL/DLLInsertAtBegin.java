import java.util.*;

public class DLLInsertAtBegin {

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

    // Function to insert at the beginning
    void insertAtBeginning(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
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
        DLLInsertAtBegin list = new DLLInsertAtBegin();

        System.out.print("Enter number of elements to insert at beginning: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            int val = sc.nextInt();
            list.insertAtBeginning(val);
        }

        System.out.print("List (Forward): ");
        list.printForward();

        System.out.print("List (Backward): ");
        list.printBackward();

        sc.close();
    }
}
