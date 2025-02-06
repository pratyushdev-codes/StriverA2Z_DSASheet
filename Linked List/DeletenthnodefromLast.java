// public class DeletenthnodefromLast {
//     public static void main(String[] args) {
        
//     } public ListNode removeNthFromEnd(ListNode head, int n) {
//          ListNode fastp = head;
//          ListNode slowp= head;

//          for(int i =0; i<n;i++){
//             fastp=fastp.next;
//          }if(fastp==null){
//             return head.next;
//          }while(fast.next!=null){
//             fastp=fastp.next;
//             slowp= slowp.next;
//          }
//          ListNode delNode = slowp.next;
//          slowp.next=slowp.next.next;
//          delNode =null;

//   return head;
//     }
// }
// public class DeletenthnodefromLast {

//    public static void main(String[] args) {
      
//    }    public ListNode removeNthFromEnd(ListNode head, int n) {
//       ListNode fast = head;
//       ListNode slow = head;

//       for(int i =0 ; i< n; i++){
//          fast= fast.next;
//       }

//       if(fast==null){
//          return head.next;
//       }

//    while(fast.next!=null){
//       fast= fast.next;
//       slow= slow.next;
//    }

//    ///removing the nth node from the end
//    ListNode delNode = slow.next;
//    slow.next= slow.next.next;
//    delNode= null;
// return head;
//    }
// }


public class DeletenthnodefromLast {

   public static void main(String[] args) {
      
   }  public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode fast=head;
      ListNode slow = head;

      for(int i = 0 ; i<n ; i++){
         fast= fast.next;
      }


      if(fast==null){
         return head;
      }

      while(fast.next!=null){
         fast= fast.next;
         slow= slow.next;
         

      }

      //Removing the nth node from the end

      ListNode delNode = slow.next;
      slow.next = slow.next.next;
      delNode= null;


      return head;





   }
}