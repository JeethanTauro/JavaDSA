package LinkedList.CheckListPalindrome;


import java.util.HashMap;

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
    class ReverseMethod {
        public ListNode reversed(ListNode head){
            ListNode prev = null;
            ListNode curr = head;
            while(curr != null){
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;

            }
            return prev;
        }
        public boolean isPalindrome(ListNode head) {
            if (head == null || head.next == null) return true;

            ListNode slow = head;
            ListNode fast = head;

            // Step 1: Find the middle
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // Step 2: Reverse second half
            ListNode secondHalfHead = reversed(slow);

            // Step 3: Compare two halves
            ListNode firstHalf = head;
            ListNode secondHalf = secondHalfHead;
            boolean isPalin = true;

            while (secondHalf != null) {
                if (firstHalf.val != secondHalf.val) {
                    isPalin = false;
                    break;
                }
                firstHalf = firstHalf.next;
                secondHalf = secondHalf.next;
            }

            return isPalin;
        }


    }

