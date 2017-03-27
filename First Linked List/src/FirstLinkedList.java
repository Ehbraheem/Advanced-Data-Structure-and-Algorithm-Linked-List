/**
 * Created by Ehbraheem on 3/3/2017.
 */
public class FirstLinkedList {
    public static void main (String[] args) {
        LinkedList list = new LinkedList();

        list.insertFront( 21);
        list.insertFront( 32);
        list.insertFront( 43);
        list.insertFront( 78);
        list.insertFront( 90);

        list.printNode();
        System.out.println(list.searchNode(32));
        System.out.println("\n");
        list.deleteNode(21);
        System.out.println(list.searchNode(21));


        list.printNode();

        System.out.println(list.size);
        System.out.println(list.isEmpty());
        System.out.println(list.isFull());
//        list.firstNode();
    }
}

class LinkedList {

    private Node top;

    public int size;

    public LinkedList() {
        this.top = null;
    }

    public void insertFront(int data) {
        this.top = new Node(data, this.top);
        this.size++;
    }

    public void firstNode() {
        System.out.println(this.top.getData());
    }

    public void deleteNode(int data) {
        Node previous = null;
        Node current = this.top;

        while ((current != null) && (current.getData() != data)) {
            previous = current;
            current = current.getNext();
        }

        if (current != null) {
            if (previous != null) {
                // delete the middle node
                previous.setNext(current.getNext());
            } else {
                this.top = current.getNext();
            }
            size--;
        }
    }

    public int getSize() {
        return this.size;
    }

    public void printNode() {
        Node current = this.top;
//        int result;

        while(current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
    }

    public boolean searchNode(int data) {
        boolean flag = false;
        Node current = this.top;
        while ((current != null) ) {
            if (current.getData() == data) {
                return true;
            }
            current = current.getNext();
        }
        return flag;
    }

    public boolean isEmpty () {
        return this.top == null;
    }

    public boolean isFull () {
        return this.top != null;
//        return !this.isEmpty();
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