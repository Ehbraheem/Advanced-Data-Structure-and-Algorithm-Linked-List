/**
 * Created by Ehbraheem on 3/26/2017.
 */
public class DoublyLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertFirst(23);
        list.insertFirst(21);
        list.insertFirst(90);
        list.insertFirst(78);
        list.insertFirst(33);

        list.displayForward();

        list.displayBackward();

        list.insertLast(23);
        list.insertLast(21);
        list.insertLast(90);
        list.insertLast(78);
        list.insertLast(33);

        list.displayForward();

        list.displayBackward();
    }
}

class Node {

    private int data;
    private Node next;
    private Node prev;

    public Node (int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void displyLink() {
        System.out.println(data + " ");
    }
}

class LinkedList {

    private Node first;
    private Node last;

    public LinkedList() {
        first = null;
        last = null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            last = newNode;
        }else {
            first.setPrev(newNode);
            newNode.setNext(first);
        }

        first = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            first = newNode;
        } else {
            last.setNext(newNode);
            newNode.setPrev(last);
        }

        last = newNode;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void displayForward() {
        System.out.println("Display Forward: ");

        Node curr = first;

        while (curr != null) {
            curr.displyLink();
            curr = curr.getNext();
        }
        System.out.println("");
    }

    public void displayBackward() {
        System.out.println("Display Backward: ");

        Node curr = last;

        while (curr != null) {
            curr.displyLink();
            curr = curr.getPrev();
        }
        System.out.println("");
    }
}

