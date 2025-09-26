class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

}


public class ReverseDLL {
    public Node reverse(Node head){
        
        Node currNode = head;
        Node temp = null;
        
        // as this is a doubly linkedlist, we can swap it similar to 
        while(currNode!=null){
            temp = currNode.prev;
            currNode.prev = currNode.next;
            currNode.next = temp;

            // Move to "previous" node (which is actually next because we swapped)
            currNode = currNode.prev;
        }

        if(temp!= null){
            head = temp.prev;
        }

        return head;

    }
}
