public class Node {
    public int data;
    public Node next;
    public Node prev;
// Constructor for a Node with both data and a reference to the next node
    public Node(int data){
        this.data = data;
        this.next= null;
        this.prev = null;
    }
// Constructor for a Node with data and no reference to the next node (end of the list)
    public Node(int data ){
        this.data = data;
        this.next= null;
    }
}

public class constructDoublyLL {

    public static void main(String[] args) {
        
    }
}