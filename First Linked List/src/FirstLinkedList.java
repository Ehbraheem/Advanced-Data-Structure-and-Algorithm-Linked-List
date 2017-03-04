/**
 * Created by prof.BOLA on 3/3/2017.
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
        System.out.println("\n");
        list.deleteNode(21);


        list.printNode();

//        System.out.println(list);
//        list.firstNode();
    }
}

class LinkedList {

    private Node top;

    public LinkedList() {
        this.top = null;
    }

    public void insertFront(int data) {
        this.top = new Node(data, this.top);
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
        }
    }

    public void printNode() {
        Node current = this.top;
//        int result;

        while(current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
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