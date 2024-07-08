
public class  mergerKLists {

    public static void main(String[] args) {
        
    }public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        return mergeSort(lists, 0, lists.length - 1);
    }

//Recurssive funcion for merger sort to get final two lists , which can be later passed to mergerTwolists function to sort two linked Lists
    private ListNode mergeSort(ListNode[] lists, int start, int end) {
        if (start == end) {
            return lists[start]; // Base case: Return the single list
        }
//keeps on dividing the lists to halves
        int mid = start + (end - start) / 2;

        ListNode leftList = mergeSort(lists, start, mid);
        ListNode rightList = mergeSort(lists, mid + 1, end);

        return mergeTwoLists(leftList, rightList);
    }


//recurssive function to make 2 linkedlists sorted.
    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Base cases
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        // Recursive merge
        //comparing valyes for sorting 
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l2.next, l1);
            return l2;
        }
    }
}

}