package LinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//create another linked list

class AddLinkedList {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;
        while(head1!=null || head2!=null || carry>0){
            int x = (head1!=null ? head1.val : 0);
            int y = (head2!=null ? head2.val : 0);
            int sum = x+y+carry;
            carry = sum/10;
            ListNode node = new ListNode(sum%10);
            curr.next = node;
            curr = curr.next;
            if(head1 != null)head1 = head1.next;
            if(head2 != null)head2 = head2.next;
        }

        return dummy.next;




    }
}
