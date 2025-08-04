package LinkedList;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.LinkedList;


public class MyLinkedList {
     class Node{
        int data;
        Node next; //the 'next' is a reference variable is storing the address of a node object
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node start=null;

    //add node at end
    private void addNode(int data){
        Node newNode = new Node(data);
        //curr and start point at the same node now
        if(start == null){
            start = newNode;
            return;
        }
        //go to the end of the linked list
        Node curr = start;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }

    // add node at beginnning
    public void addNodeFirst(int data){
        Node newNode = new Node(data);
        if(start == null){
            start = newNode;
            return;
        }
        newNode.next  = start;
        start = newNode;
    }

    //add node in between after index
    public void addNodeAt(int data,int index){
        Node newNode = new Node(data);
        if(start == null){
            start = newNode;
            return;
        }
        int count = 0;
        Node curr = start;
        if(index == 0){ //if to add at first
            addNodeFirst(data);
            return;
        }
        while(curr!=null && count < index-1){
            curr = curr.next;
            count++;
        }
        if (curr == null) {// gave a too large number
            System.out.println("Index out of bounds");
            return;
        }
        newNode.next = curr.next;
        curr.next = newNode;
    }


    //search node and return its index
    private int find(int data){
        Node curr = start;
        int count = 0;
        while(curr != null){
            if(curr.data == data){
                return count;
            }
            curr = curr.next;
            count++;
        }
        return -1;
    }

    //delete node at end
    private void deleteEnd(){
        if(start == null){
            System.out.println("No nodes");
            return;
        }
        Node prev = start;
        Node curr = start.next;
        while(curr.next != null){
            prev = prev.next;
            curr = curr.next;
        }
        prev.next = null;
    }
    //delete node at beginning
    private void deleteFirst(){
        if(start == null){
            System.out.println("No nodes");
            return;
        }
        Node curr = start;
        start = curr.next;
    }

    //delete node in at given index
    private void deleteAt(int index){
        if(start == null){
            System.out.println("No nodes");
            return;
        }
        Node prev = start;
        Node curr = start.next;
        int count = 0;
        while(curr!=null && count<index-1){
            count++;
            prev = prev.next;
            curr = curr.next;
        }
        if(curr == null){
            System.out.println("Out of bounds");
            return;
        }
        prev.next = curr.next;
    }

    //display
    private void print(){
         if(start == null){
             System.out.println("Nothing to display");
             return;
         }
         Node curr = start;
         while(curr!= null){
             System.out.print(curr.data+" => ");
             curr = curr.next;
         }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        LinkedList<String> list = new LinkedList<>(); //this is inbuilt linked list
        ll.addNode(5);
        ll.addNode(10);
        ll.addNode(15);
        ll.addNode(20);
        ll.addNode(25);
        ll.print();
        ll.deleteAt(2);
        ll.print();

        list.add("Hi");
        list.addLast("world");
        list.addFirst("HELOO");
        System.out.println(list);
    }
}
