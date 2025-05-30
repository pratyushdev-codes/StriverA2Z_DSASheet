import java.util.Scanner;

public class InsertinaDoublyLL {

    // Node class representing a single node in the Doubly Linked List
    public class Node {
        int data;   // Data stored in the node
        Node next;  // Reference to the next node in the list
        Node prev;  // Reference to the previous node in the list

        // Constructor for a Node with only data.
        // Used when creating a new node that will be appended or inserted.
        public Node(int data) {
            this.data = data;
            this.next = null; // Initially, no next node
            this.prev = null; // Initially, no previous node
        }

        // Constructor for a Node with data, and references to the next and previous nodes.
        // Useful for building the list where links are known.
        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    /**
     * Creates a Doubly Linked List from a given array of integers.
     *
     * @param arr The array of integers to convert into a DLL.
     * @return The head node of the newly created Doubly Linked List.
     */
    public Node createDLLfromArr(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null; // Return null if the array is empty or null
        }

        // Create the head node from the first element of the array
        Node head = new Node(arr[0]);
        Node mover = head; // 'mover' will traverse the list to add new nodes

        // Iterate through the rest of the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // Create a new node for the current array element
            Node temp = new Node(arr[i]);
            
            // Link the 'next' pointer of the current last node (mover) to the new node (temp)
            mover.next = temp;
            
            // Link the 'prev' pointer of the new node (temp) back to the current last node (mover)
            temp.prev = mover;
            
            // Move 'mover' to the newly added node (temp) to prepare for the next iteration
            mover = temp;
        }
        return head; // Return the head of the constructed DLL
    }

    /**
     * Inserts a new node with the given data at the end of the Doubly Linked List.
     *
     * @param head The head node of the Doubly Linked List.
     * @param data The data to be inserted into the new node.
     * @return The head node of the modified Doubly Linked List.
     */
    public Node insertAtLast(Node head, int data) {
        Node newNode = new Node(data); // Create the new node to be inserted

        // If the list is empty, the new node becomes the head
        if (head == null) {
            return newNode;
        }

        Node temp = head; // Start from the head to find the last node
        // Traverse to the last node (the node whose 'next' pointer is null)
        while (temp.next != null) {
            temp = temp.next;
        }

        // Link the 'next' pointer of the current last node (temp) to the new node
        temp.next = newNode;
        // Link the 'prev' pointer of the new node back to the current last node (temp)
        newNode.prev = temp;

        return head; // Return the head of the modified DLL
    }

    /**
     * Prints the elements of the Doubly Linked List from head to tail.
     *
     * @param head The head node of the Doubly Linked List.
     */
    public void printDLL(Node head) {
        if (head == null) {
            System.out.println("Doubly Linked List is empty.");
            return;
        }
        Node temp = head;
        System.out.print("Doubly Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements for the Doubly Linked List: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the elements:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Create an instance of InsertinaDoublyLL to call non-static methods
        InsertinaDoublyLL dllOperations = new InsertinaDoublyLL();

        // Create the Doubly Linked List from the array
        Node head = dllOperations.createDLLfromArr(arr);
        dllOperations.printDLL(head); // Print the created DLL

        System.out.print("Enter the data to insert at the last position: ");
        int dataToInsert = sc.nextInt();

        // Insert a new node at the last position
        head = dllOperations.insertAtLast(head, dataToInsert);
        dllOperations.printDLL(head); // Print the DLL after insertion

        sc.close(); // Close the scanner
    }
}
