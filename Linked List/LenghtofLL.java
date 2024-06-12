/**
 * LenghtofLL
 */
public class LenghtofLL {

    public static void main(String[] args) {
        
    }public void lengthofLinedList(Node head){
        int count = 0;
        
        Node temp = head;
        while(temp!=null){
            count = count +1;
            temp= temp.next;
        }
        System.out.println(count);
    }
}