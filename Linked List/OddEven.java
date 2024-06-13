public class OddEven {
    public static void main(String[] args) {
        
    }  public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode odd= head;
        ListNode even = head.next;
        ListNide evenHead= head.next;

        while(even!=null && even.next!=null){
            odd.next= odd.next.next;
            even.next=even.next.next;
             odd=odd.next;
             even=even.next;


        }
        odd.next= evenHead;
        return head;







    }
    }

