// public class DeleteMiddleofLL {
//     public static void main(String[] args) {
        
//     } public ListNode deleteMiddle(ListNode head) {
      
//         if(head.next == null)
//         return null;
         


//         ListNode previousp = getPrev(head);
//         previousp.next=previousp.next.next;
//         return head;




//     }private ListNode getPrev(ListNode head){
//         ListNode fastp= head;
//         ListNode slowp=head;
//         ListNode prev= null;
//             while(fastp!=null || fastp.next!=null){
//                 prev= slowp;
//                fastp= fastp=next.next;
//                slowp= slowp.next;
//            }
//            return prev;
//         }
    
       
    
        
//     }

// public class DeleteMiddleofLL {

//     public static void main(String[] args) {
        
//     }    public ListNode deleteMiddle(ListNode head) {{
//         if(head.next==null){
//             return null;
//         }

//         ListNode previousP = 
//     }
// }

public class DeleteMiddleofLL {

    public static void main(String[] args) {
        
    }    public ListNode deleteMiddle(ListNode head) {

        if(node==null || head.next==null){
            return null;
        }

        Node slow = head;
        Node fast = head;
        //Setting it twice as the slow pointer

        fast = head.next.next;

        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast= fast.next.next;
        }


        if(slow.next!=null){
            slow.next= slow.next.next;
        }

        return head;









    }
}