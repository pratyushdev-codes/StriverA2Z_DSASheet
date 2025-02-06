class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LengthofLoopLL {
    public static void main(String[] args) {
        // Test cases can be added here
    }

    public int countNodesinLoop(Node head) {
        Node slow = head, fast = head;

        // Step 1: Detect loop using Floyd’s Cycle Detection Algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // Loop detected
                return getLoopLength(slow);
            }
        }

        return 0; // No loop
    }

    private int getLoopLength(Node slow) {
        int length = 1;
        Node temp = slow.next;

        while (temp != slow) {
            length++;
            temp = temp.next;
        }

        return length;
    }
}
