package excercise;


/**
 * Created by Ehbraheem on 3/5/2017.
 */
public class Exercise1 {
    public static void main(String[] args){

        testCases();

    }

    public static void testCases() {
        /*DO NOT MODIFY*/
        /**
         * Your program must pass all test cases for insertion deletion and search
         */
        LinkedList list = new LinkedList();

        list.addNode("Sarah", true);
        list.addNode("Ahmed", false);
        list.addNode("Sheila", false);
        list.addNode("Peter", false);
        list.addNode("Dave", true);
        list.addNode("Quadri", true);

        System.out.println("\n********[List Before Deletion]********");
        System.out.println(list + "\n");

        list.delete("Sarah");
        list.delete("Quadri");
        list.addNode("Ben", true);
        list.addNode("Ash", true);

        System.out.println("\n********[List After Deletion & Insertion]********");
        System.out.println(list + "\n");

        list.showAllTrue();
        System.out.println("\n");

        list.showAllFalse();
        System.out.println("\n");
    }
}


class Node {
    /*INSERT CODE HERE*/
    private String name;
    private boolean flag;
    private Node next;

    public Node() {};

    public Node (String name, boolean flag, Node next) {
        this.name = name;
        this.flag = flag;
        this.next = next;
    }

    public String getName () { return name;}
    public boolean getFlag() { return flag;}
    public Node getNext() { return next;}
    public void setNext(Node next) { this.next = next;}

}


class LinkedList {
    private Node top;

    public LinkedList(){
        /**
         * PURPOSE: initializes an empty linked list by setting top to null
         */
        /*INSERT CODE HERE*/
        this.top = null;
    }

    public void addNode(String name, boolean flag)
    {
        /**
         * PURPOSE: add nodes to the beginning of the linked list
         */

         /*INSERT CODE HERE*/

        Node newNode = new Node(name, flag, top);
        //  top.setNext(newNode);

    }


    public String delete(String name)
    {
        /**
         * PURPOSE: Deletes a given name from the linked list and returns the name
         */
        Node prev = null;
        Node curr = top;

        /*INSERT CODE HERE*/
        while((curr != null) && (curr.getName() != name)) {
            prev = curr;
            curr = curr.getNext();
        }

        if (curr != null) {
            if (prev != null) {

                prev.setNext(curr.getNext());
            } else {
                top = curr.getNext();
            }

        }

        return name;
    }

    /* Don't modify already given code*/
    public void showAllTrue() {
        Node curr = top;

        System.out.print("LinkedList items containing TRUE:\n");
        System.out.println("---------------------------------");

        /*INSERT CODE HERE*/
        while(curr != null) {
            if (curr.getFlag()) {
                System.out.println(curr.getName());
            }
            curr = curr.getNext();
        }
    }

    /* Don't modify already given code*/
    public void showAllFalse() {
        Node curr = top;

        System.out.print("LinkedList items containing FALSE:\n");
        System.out.println("---------------------------------");

        /*INSERT CODE HERE*/
        while(curr != null) {
            if (!curr.getFlag()) {
                System.out.println(curr.getName());
            }
            curr = curr.getNext();
        }
    }


    /*DO NOT MODIFY*/
    public String toString()
    {
        /**
         * public driver toString method to print out all elements in the list recursively
         */
        return toString(top);
    }

    private String toString(Node curr)
    {
        /**
         * private helper recursive toString method
         */
        String result = "";

        if(curr != null)
        {
            if ( curr == top )
            {
                result += "{";
            }

            if ( curr.getNext() != null )
            {
                result += curr.getName() + "," + toString(curr.getNext());
            }else
            {
                result += curr.getName().toString();
                result += "}";
            }
        }
        return  result;
    }
}

