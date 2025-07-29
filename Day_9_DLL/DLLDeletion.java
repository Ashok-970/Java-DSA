import java.util.*;

public class DLLDeletion {

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

    // Insert at end (for building the list)
    void insertAtEnd(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Delete from front
    void deleteFromFront() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    // Delete from end
    void deleteFromEnd() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    // Delete from a specific position (1-based)
    void deleteFromPosition(int position) {
        if (head == null || position <= 0) {
            System.out.println("Invalid position or list is empty.");
            return;
        }

        if (position == 1) {
            deleteFromFront();
            return;
        }

        Node current = head;
        int count = 1;

        while (current != null && count < position) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        if (current == tail) {
            deleteFromEnd();
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    // Print forward
    void printForward() {
        Node current = head;
        System.out.print("List (Forward): ");
        while (current != null) {
            System.out.print(current.data + (current.next != null ? " <-> " : ""));
            current = current.next;
        }
        System.out.println();
    }

    // Print backward
    void printBackward() {
        Node current = tail;
        System.out.print("List (Backward): ");
        while (current != null) {
            System.out.print(current.data + (current.prev != null ? " <-> " : ""));
            current = current.prev;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLLDeletion list = new DLLDeletion();

        System.out.print("Enter number of elements to insert at end: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            list.insertAtEnd(sc.nextInt());
        }

        list.printForward();
        list.printBackward();

        System.out.println("\nChoose deletion option:");
        System.out.println("1. Delete from Front");
        System.out.println("2. Delete from End");
        System.out.println("3. Delete from Position");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                list.deleteFromFront();
                break;
            case 2:
                list.deleteFromEnd();
                break;
            case 3:
                System.out.print("Enter position to delete: ");
                int pos = sc.nextInt();
                list.deleteFromPosition(pos);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        list.printForward();
        list.printBackward();
        sc.close();
    }
}
