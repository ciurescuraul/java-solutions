package hackerrank.algorithms.data_structures.ll;

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }
}

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    // constructor
    public LinkedList() {
    }

    public LinkedList(int value) {

        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
    //
    //    public Node RemoveLast() {
    //    }
    //
    //    public void prepend(int value) {
    //    }
    //
    //    public boolean insert(int index, int value) {
    //    }
    //
    //    public Node remove(int index) {
    //    }
}
