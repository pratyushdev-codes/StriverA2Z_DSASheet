// class Node {
//     int data;
//     Node next;

//     Node(int x) {
//         data = x;
//         next = null;
//     }
// }

// public class InsertinLL {

//     public static void main(String[] args) {
//         Node head = new Node(10);
//         head.next = new Node(20);
//         head.next.next = new Node(30);

//         head = insertAtEnd(head, 40);

//         printList(head);
//     }

//     public static Node insertAtEnd(Node head, int X) {
//         Node newNode = new Node(X);
//         if (head == null) {
//             return newNode; // If list is empty, return new node as head
//         }
        
//         Node temp = head;
//         while (temp.next != null) {
//             temp = temp.next;
//         }
//         temp.next = newNode; // Insert at the end
//         return head;
//     }

//     public static void printList(Node head) {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("NULL");
//     }
// }

class Node{
    int data;
    Node next;

    Node(int X){
        data= X;
        next= null;
    }
}

public class InsertinLL {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next= new Node(30);


        head= insertAtEnd(head, 20);
        printList(head);
        
    }public static Node insertAtEnd(Node head, int X) {
      Node newNode = new Node(X);
      if(head==null){
        return null;
      }

      Node temp = head;

      while (temp.next!=null) {
        temp= temp.next;

        
      }
      temp.next= newNode;

      return head;


    } public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
