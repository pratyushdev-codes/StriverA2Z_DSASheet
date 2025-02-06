public class DetectLoopinLL {
    public static void main(String[] args) {
        
    }
    
}    public boolean hasCycle(ListNode head) {
    ListNode fastPointer = head;
    ListNode slowPointer = head;
    while(fastPointer !=null && fastPointer.next!=null){
        fastPointer=fastPointer.next.next;
        slowPointer= slowPointer.next;
        if(fastPointer==slowPointer){
            return true;

    }
    return false;


        
}
}
