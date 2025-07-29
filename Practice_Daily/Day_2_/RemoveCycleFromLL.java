class RemoveCycleFromList {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    // Function to detect and remove cycle
    static Node removeCycle(Node head) {
        if (head == null || head.next == null) return head;

        Node slow = head, fast = head;

        // Detect cycle
        boolean hasCycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }

        if (!hasCycle) return head; // No cycle

        // Find start of the cycle
        slow = head;
        Node prev = null; // To find last node in cycle

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Break the cycle
        prev.next = null;

        return head;
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + (temp.next != null ? " -> " : ""));
            temp = temp.next;
        }
        System.out.println();
    }

    // Create a cycle manually at position `pos`
    static Node createCyclicList(int[] values, int pos) {
        Node head = new Node(values[0]);
        Node current = head;
        Node cycleNode = null;

        for (int i = 1; i < values.length; i++) {
            current.next = new Node(values[i]);
            current = current.next;
            if (i == pos) {
                cycleNode = current;
            }
        }

        if (pos == 0)
            cycleNode = head;

        current.next = cycleNode; // Create cycle
        return head;
    }

    public static void main(String[] args) {
        // Input: [3, 2, 0, -4], pos = 1
        int[] values = {3, 2, 0, -4};
        Node head = createCyclicList(values, 1);

        head = removeCycle(head);

        System.out.println("After Removing Cycle:");
        printList(head);
    }
}
