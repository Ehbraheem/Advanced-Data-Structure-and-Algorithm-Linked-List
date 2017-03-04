/**
 * Created by prof.BOLA on 3/3/2017.
 */
public class FirstLinkedList {
    public static void main (String[] args) {

    }
}

class LinkedList {

    private Node top;

    public LinkedList() {
        this.top = null;
    }
}


class Node {

    private int data;

    private Node next;

    public Node (int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public int getData () {
        return this.data;
    }

    public Node getNext () {
        return this.next;
    }

    public  void setNext (Node next) {
        this.next = next;
    }
}