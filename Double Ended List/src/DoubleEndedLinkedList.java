/**
 * Created by Ehbraheem on 3/29/2017.
 */
public class DoubleEndedLinkedList {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.inserFirst(23);
        list.inserFirst(13);
        list.inserFirst(90);
        list.inserFirst(24);
        list.inserFirst(78);

        list.displayList();

        list.deleteLast();

        list.displayList();

        list.deleteLast();

        list.displayList();
    }
}

class Node {

    private long data;
    private Node next;

    public Node (long data) {
        this.data = data;
    }

    public long getdata () {
        return data;
    }

    public Node getNext () {
        return next;
    }

    public void setNext (Node next) {
        this.next = next;
    }

    public void displayLink () {
        System.out.println(data + " ");
    }
}

class LinkedList {

    private Node first;
    private Node last;

    public LinkedList () {
        this.first = null;
        this.last = null;
    }

    public void inserFirst (long data) {
        Node newNode = new Node(data);

        if(isEmpty()) {
            last = newNode;
        }
        newNode.setNext(first);
        first = newNode;
    }

    public void insertLast (long data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            first = newNode;
        } else {
            last.setNext(newNode);
        }
        last = newNode;
    }

    public boolean isEmpty () {
        return first == null;
    }

    public boolean isFull () {
        return first != null;
    }

    public long deleteLast () {
        long result = first.getdata();

        Node curr = first;

        if (first.getNext() != null) {
            while (curr != null && curr.getNext() != null) {
                curr = curr.getNext();
            }

            if (curr != null) {
                result = last.getdata();
                System.out.println("Sucessfully deleted " + result + " ");

                last = curr;
                last.setNext(null);
            }
        } else {
            result = first.getdata();
            System.out.println("Sucessfully deleted " + result + " ");
            first = null;
        }
        return result;
    }

    public void displayList () {
        System.out.println("\n List (FIRST --> LAST): \n");

        Node curr = first;

        while (curr != null) {
            curr.displayLink();
            curr = curr.getNext();
        }

        if (!isFull()) {
            System.out.println("The list is empty");
        }
    }

    public void deleteAll () {
        first = null;
    }
}
