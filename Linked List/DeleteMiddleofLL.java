public class DeleteMiddleofLL {
    public static void main(String[] args) {
        
    } public ListNode deleteMiddle(ListNode head) {
      
        if(head.next == null)
        return null;
         


        ListNode previousp = getPrev(head);
        previousp.next=previousp.next.next;
        return head;




    }private ListNode getPrev(ListNode head){
        ListNode fastp= head;
        ListNode slowp=head;
        ListNode prev= null;
            while(fastp!=null || fastp.next!=null){
                prev= slowp;
               fastp= fastp=next.next;
               slowp= slowp.next;
           }
           return prev;
        }
    
       
    
        
    }

