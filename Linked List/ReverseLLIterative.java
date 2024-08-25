public class ReverseLLIterative {
    public static void main(String[] args) {
        
    }public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
               return head;
           }
   
           ListNode prev = null;
           ListNode curr = head;
   
           while (curr != null) {
               ListNode nextNode = curr.next;
               curr.next = prev;
               prev = curr;
               curr = nextNode;
           }
   
           return prev;
       }
   }