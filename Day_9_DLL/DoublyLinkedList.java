class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList {
    Node head, tail;

    // Insert at end
    public void insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Print forward
    public void printForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + (current.next != null ? " <-> " : ""));
            current = current.next;
        }
        System.out.println();
    }

    // Print backward
    public void printBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + (current.prev != null ? " <-> " : ""));
            current = current.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);

        System.out.print("List (Forward): ");
        list.printForward();

        System.out.print("List (Backward): ");
        list.printBackward();
    }
}
