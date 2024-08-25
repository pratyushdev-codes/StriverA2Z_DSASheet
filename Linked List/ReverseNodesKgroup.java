
// 25. Reverse Nodes in k-Group
// Hard
// Topics
// Companies
// Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

// k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

// You may not alter the values in the list's nodes, only nodes themselves may be changed.

public class ReverseNodesKgroup {
    public static void main(String[] args) {

    }

    public ListNode reverseKGroup(ListNode head, int k) {
        // int previouspointer= getPrevious(head);
            ListNode fastpointer= head;
            ListNode slowpointer=head;
           ListNode prev=head;
        for(int i=0;i<k;i++){
            slowpointer= slowpointer.next;
            fastpointer= slowpointer.next;
        }
        





         

  
        
    // }private ListNode getPrevious(ListNode head){
    //     ListNode fastpointer= head;
    //     ListNode slowpointer=head;
    //    ListNode prev=head;
       
    //    while(fastpointer!=null && fastpointer.next!=null){
    //     prev= slowpointer;
    //     slowpointer= slowpointer.next;
    //     fastpointer= fastpointer.next.next;
    //    }

    //     return prev;

    // }
}
}
