public class middleofLL {
    public static void main(String[] args) {
        
    } public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;


        while(fast.next!=null && fast!=null){
            fast=fast.next;
            slow =slow.next;
        }

        return slow;




    }
}
