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
class RotateLinkedList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        int length = 1;
        ListNode curr = head.next;
        ListNode tail = head;
        while(curr != null){
            length++;
            tail = tail.next;
            curr =  curr.next;
        }

        //this is for when k>length
        k = k % length;
        if(k == 0) return head; //no rotation needed

        int pos = length - k;
        ListNode temp = head;

        //go up till the point where the node becomes last node
        while(pos > 1){
            pos--;
            temp = temp.next;
        }

        ListNode start = temp.next; //the new head
        temp.next = null;
        tail.next = head;

        return start;

    }
}
