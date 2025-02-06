// public class searchElementinLL {
//     public static void main(String[] args) {
        
//     } public boolean searchLL(Node head, int k) {
//         Node temp = head;

//         while (temp != null) {
//             if (temp.data == k) {
//                 return true;
//             }
//             temp = temp.next;
//         }

//         return false;
//     }
// }

class Node{
    Node next;
    int data;

    Node(int X){
        data =X;
        next= null;
        
    }

}


public class searchElementinLL {

    public static void main(String[] args) {
        
    }    static boolean searchKey(int n, Node head, int key) {
        Node temp = head;
        while(temp.next!=null){

            if(temp.data ==key){
                return true;
            }temp= temp.next;
    
            
        }
        return false;

    }



}