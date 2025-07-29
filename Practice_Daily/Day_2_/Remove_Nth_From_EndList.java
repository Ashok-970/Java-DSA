class RemoveNthFromEnd {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    static Node removeNthFromEnd(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node first = dummy;
        Node second = dummy;

        // Move first n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            if (first != null)
                first = first.next;
        }

        // Move both until first reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Remove nth node
        if (second.next != null)
            second.next = second.next.next;

        return dummy.next;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.val + (head.next != null ? " -> " : ""));
            head = head.next;
        }
        System.out.println();
    }

    // Test main
    public static void main(String[] args) {
        // Example: [1,2,3,4,5], n=2
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        printList(head);

        head = removeNthFromEnd(head, 2);
        System.out.println("After Removing 2nd Node from End:");
        printList(head);
    }
}
