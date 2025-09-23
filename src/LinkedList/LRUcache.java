package LinkedList;

import java.util.HashMap;

class Node{
    int key, val;
    Node(int key, int val){
        this.key = key;
        this.val = val;
        prev = null;
        next = null;
    }
    Node next;
    Node prev;
}

class LRUcache {

    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);
    HashMap<Integer, Node> map = new HashMap<>();
    int capacity = 0;

    public LRUcache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        //if the key is present in the map
        if(map.containsKey(key)){
            Node result = map.get(key);// find the node in the list
            map.remove(key); //delete from the map too
            deleteNode(result); //delete where it is currently
            addNode(result); //add it in the beginning as its recently used
            map.put(key,result); //add it in the map too
            return result.val;
        }

        //if not present return -1
        return -1;
    }

    public void put(int key, int value) {

        //check if the key already exist
        //if it does then delete the old one and insert the new one
        if(map.containsKey(key)){
            Node temp = map.get(key);
            deleteNode(temp);
            map.remove(key);
        }
        //capacity reached
        //if the capacity is reached then delete the node near the tail
        if(map.size() == capacity){
            map.remove(tail.prev.key);
            deleteNode(tail.prev);
        }

        //add the new node at the beginning
        Node newNode = new Node(key,value);
        addNode(newNode);
        map.put(key, newNode);
    }


    void addNode(Node newNode){
        Node curr = head;
        Node nextNode = head.next;
        curr.next = newNode;
        newNode.prev = curr;

        newNode.next = nextNode;
        newNode.next.prev = newNode;
    }

    void deleteNode(Node temp){
        Node curr = temp.prev;
        Node nextNode = temp.next;

        curr.next = nextNode;
        nextNode.prev = curr;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
