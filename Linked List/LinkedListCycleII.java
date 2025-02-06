// public class LinkedListII {
//     public static void main(String[] args) {
        
//     }public ListNode detectCycle(ListNode head) {
//         ListNode slow = head;
//         ListNode fast = head;

//         while(fast!=null && fast.next !=null){
//             slow = slow.next;

//             fast = fast.next.next;

//             if(slow==fast){

//                 slow=head;


//                 while(slow!= fast){
//                     slow= slow.next;
//                     fast= fast.next;
//                 }

//                 return slow;
//             }
//         }

// return null;


//     }

// }

public class LinkedListCycleII {

    public static void main(String[] args) {
        
    }public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;


        while(fast.next!=null && fast!=null ){
            slow = slow.next;
            fast= fast.next.next;

            if(fast==slow){
                slow= head;


                while(slow!=fast){
                    slow = slow.next;
                    fast= fast.next;
                }
                return slow;
            }
        }
return null;





    }
}