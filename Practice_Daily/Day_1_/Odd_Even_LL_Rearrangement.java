public class Odd_Even_LL_Rearrangement {

    // Define the Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to rearrange odd-even positions
    static Node rearrangeOddEven(Node head) {
        if (head == null || head.next == null)
            return head;

        Node odd = head;
        Node even = head.next;
        Node evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }

    // Utility function to create a list
    static Node createList(int[] values) {
        if (values.length == 0) return null;

        Node head = new Node(values[0]);
        Node current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new Node(values[i]);
            current = current.next;
        }

        return head;
    }

    // Utility function to print the list
    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + (head.next != null ? " -> " : ""));
            head = head.next;
        }
        System.out.println();
    }

    // Main function
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        Node head = createList(values);

        System.out.println("Original List:");
        printList(head);

        head = rearrangeOddEven(head);

        System.out.println("Rearranged List (Odd positions first, then even):");
        printList(head);
    }
}
