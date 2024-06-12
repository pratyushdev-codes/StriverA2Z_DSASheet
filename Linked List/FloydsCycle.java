public class FloydsCycle {
    public static void main(String[] args) {
        
    }public boolean hasCycle(ListNode head) {

        ListNode slow_pointer= head;
        ListNode fast_pointer= head;

        while(slow_pointer!=null && fast_pointer!=null){
            slow_pointer= slow_pointer.next;
            fast_pointer= fast_pointer.next.next;
            if(slow_pointer==fast_pointer){
                return true;
            }
            }
            return false;
        }


    }

