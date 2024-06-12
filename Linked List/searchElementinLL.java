public class searchElementinLL {
    public static void main(String[] args) {
        
    } public boolean searchLL(Node head, int k) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == k) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }
}