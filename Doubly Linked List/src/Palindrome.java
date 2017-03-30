import jdk.nashorn.internal.ir.annotations.Ignore;

/**
 * Created by Ehbraheem on 3/26/2017.
 */
public class Palindrome {

    public static void main(String[] args) {
        StringLinkedList list = new StringLinkedList();

        String name = "abba";

        for (int i = 0; i < name.length(); i++) {
            list.insertFirst(name.charAt(i));
        }

//        list.displayForward();

        list.isPalindrome();
    }
}
class StringNode {

    private char data;
    private StringNode next;
    private StringNode prev;

    public StringNode(char data) {
        this.data = data;
    }


    public char getData() {
        return data;
    }


    public StringNode getNext() {
        return next;
    }

    public void setNext(StringNode next) {
        this.next = next;
    }

    public StringNode getPrev() {
        return prev;
    }

    public void setPrev(StringNode prev) {
        this.prev = prev;
    }

    public void displayLink() {
        System.out.println(data + " ");
    }
}

class StringLinkedList {

    private StringNode first;
    private StringNode last;


    public void insertFirst(char data) {
        StringNode newNode = new StringNode(data);

        if (isEmpty()) {
            last = newNode;
        }else {
            first.setPrev(newNode);
            newNode.setNext(first);
        }

        first = newNode;
    }

    public void insertLast(char data) {
        StringNode newNode = new StringNode(data);

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

    public boolean isFull() {
        return first != null;
    }

    public void displayForward() {
        System.out.println("Display Forward: ");

        StringNode curr = first;

        while (curr != null) {
            curr.displayLink();
            curr = curr.getNext();
        }
        System.out.println("");
    }

    public void displayBackward() {
        System.out.println("Display Backward: ");

        StringNode curr = last;

        while (curr != null) {
            curr.displayLink();
            curr = curr.getPrev();
        }
        System.out.println("");
    }

    public void isPalindrome() {
        String currFwd = "";
        String currBck = "";

        StringNode forward  = first;
        StringNode backward = last;

        while (forward != null) {
            currFwd += forward.getData();
            forward = forward.getNext();
        }

        while (backward != null) {
            currBck += backward.getData();
            backward = backward.getNext();
        }

        if (currFwd.equals(currBck)) {
            System.out.println("This string is a palindrome");
        } else {
            System.out.println("This string is not a palindrome");
        }

    }
}