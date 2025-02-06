class Node{
    int data ;
    Node next;


    //constructor with both parameters
    Node(int data1 , Node next1){
        data= data1;
        next = next1;
    }

     // Constructor with only data as a
    // parameter, sets next to null
    Node(int data1) {
        data = data1;
        next = null;
    }
}
public class SortList {
    public static void main(String[] args) {
        
    }public Node mergeTwoSortedLinkedLists(Node list1, Node list2) {





    }public Node findMidNode(Node head){

        if(head==null || head.next==null){
            return head;
        }

        Node fastPointer = head;
        Node slowPNode= head.next;

        while(fastPointer!=null && fastPointer.next.next!=null){
            fastPointer= fastPointer.next.next;
            slowPNode= slowPNode.next;
        }

        return slowPNode; //middle node
    }public Node mergeSort(Node head){
        if(head== null || head.next == null){
            return head;
        }

        Node middle = findMidNode(head);

        Node right = middle.next;
        middle.next= null;
        Node left= head;

        left= mergeSort(left);
        right = mergeSort(right);


        return mergeTwoSortedLinkedLists(left, right);
   
    }public node mergeTwoSortedLinkedLists(Node list1, Node list2){

            // Create a dummy node to serve
    // as the head of the merged list
       Node dummyNode = new Node(-1);
       Node temp = dummyNode;

       while (list1!=null && list2!=null) {


        if(list1.data<=list2.data){
            temp.next = list1;
            list1= list1.next;
        }else{
            temp.next= list2;
            list2 = list2.next;
        }
        
        temp = temp.next;
       }


       if(list1!=null){
          temp.next=list1;
       }
       temp.next=list2;
    }
    return dummyNode.next;
    }

