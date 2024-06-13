import javax.swing.event.ListDataEvent;

public class AddTwoLL {
    public static void main(String[] args) {
        
    }public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
      ListNode dummy = new ListNode();
      ListNode res = dummy;
      int total = 0;
      int carry =0;

      while(l1!=null || l1!=null || carry!=null){
        total = carry;
       
        if (l1 != null) {
            total += l1.val;
            l1 = l1.next;
        }
        if(l2!=null){
            total +=l2.val;
            l2=l2.next;
        }
        int num = total%10;
        carry= total/10;
        dummy.next = new ListNode(num);

        dummy= dummy.next;


      }
return res.next;




    }
    }

