// public class ReverseLLIterative {
//     public static void main(String[] args) {
        
//     }public ListNode reverseList(ListNode head) {
//         if (head == null || head.next == null) {
//                return head;
//            }
   
//            ListNode prev = null;
//            ListNode curr = head;
   
//            while (curr != null) {
//                ListNode nextNode = curr.next;
//                curr.next = prev;
//                prev = curr;
//                curr = nextNode;
//            }
   
//            return prev;
//        }
//    }


//reverse a LL:-
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next= null;
    }
}

public class ReverseLLIterative {
    public static Node reverse(Node head){
        Node prev = null;
        Node current = head;
        Node nextNode ;
        while(current!=null){
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current=nextNode;
        }
        return prev;

    
    }
    
}