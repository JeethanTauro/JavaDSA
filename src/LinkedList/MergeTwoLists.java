package LinkedList;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Dummy node to simplify handling head
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        // Traverse both lists
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;   // attach list1's node
                list1 = list1.next;  // move list1 forward
            } else {
                tail.next = list2;   // attach list2's node
                list2 = list2.next;  // move list2 forward
            }
            tail = tail.next; // move the tail forward
        }

        // Attach remaining nodes (if any)
        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }



        return dummy.next; // merged list starts from dummy.next
    }
}
