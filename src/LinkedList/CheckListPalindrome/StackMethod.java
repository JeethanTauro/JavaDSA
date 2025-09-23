package LinkedList.CheckListPalindrome;

import java.util.Stack;



  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class StackMethod {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode curr = head;
        while(curr != null){
            stack.push(curr.val);
            curr = curr.next;
        }
        curr = head;
        while(curr != null){
            if(stack.peek() == curr.val){
                curr = curr.next;
                stack.pop();
            }
            else{
                return false;
            }
        }
        return true;

    }
}
