class LinkedList {
    // Node class with constructor
    static class Node {
        int data;
        Node next;

        Node(int data) {   // constructor
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Constructor for LinkedList
    LinkedList() {
        this.head = null;
    }

    // Insert at head
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;  // link new node to current head
        head = newNode;       // update head
    }

    // Print the Linked List
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    // Main method to test
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);

        list.printList(); // Output: 30 -> 20 -> 10 -> NULL
    }
}
