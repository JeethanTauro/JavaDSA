package LinkedList.FlattenDoublyLinkedList;

/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/
// given a doubly linked list
// it contains an additional child pointer
// the child pointer could point to a seperate special doubly linked list
// this forms a multilevel doubly linked list
// our job is to flatten the list
// if 'curr' is the node with the child pointer, then all the nodes in the child pointer must come before 'curr.next'

class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
class Recursive {
    public Node flatten(Node head) {
        Node curr = head;
        while(curr != null){
            if(curr.child != null){//valid child pointer
                Node nextNode = curr.next;
                curr.next = flatten(curr.child);
                curr.next.prev = curr;
                curr.child = null;

                while(curr.next != null){
                    curr = curr.next;
                }
                if(nextNode != null){
                    curr.next = nextNode;
                    nextNode.prev = curr;
                }
            }

            curr = curr.next;
        }

        return head;
    }
}
