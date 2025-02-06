class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

import java.util.ArrayList;

public class PalindromicLL {
    public static void main(String[] args) {
        
    }    public boolean isPalindrome(ListNode head) {
        // make an array list add all the elements of the Linked list to array List
        ArrayList<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head= head.next;
        }



    }public boolean checkPalindrome(ArrayList<Integer> list){
        int j = list.size()-1;
        int i = 0;
        while(i<=j){
            if(list.get(i)==list.get(j)){
                return true;

            }
            i++;
            j--;
        }
        return false;
    }
}
