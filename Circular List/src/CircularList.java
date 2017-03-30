/**
 * Created by Ehbraheem on 3/29/2017.
 */
public class CircularList {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.add(23);
        list.add(12);
        list.add(15);
        list.add(10);

        System.out.println(list);

        boolean result = list.search(23);

        System.out.println(result);

    }
}

class Node {

    private int data;
    private Node next;

    public Node (int data, Node next) {
        this.data = data;
        this.next = next;
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

}

class LinkedList {

    private Node top;
    private int size;

    public LinkedList () {
        this.top = null;
    }

    public void add (int data) {
        if (top  == null) {
            top = new Node(data, null);
            top.setNext(top);
        } else {
            Node newNode = new Node(data, top.getNext());
            top.setNext(newNode);
        }
        size++;

        System.out.println("Added: " + data);
    }

    public boolean search (int data) {
        Node curr = top;

        boolean flag = false;
        if (curr != null) {
            do {
                curr = curr.getNext();

                if (curr.getData() == data) {
                    flag = true;
                }
            } while (curr != top && curr.getData() != data);
        }

        return flag;
    }

    public String toString () {
      Node curr = top;

      String result = "";

      if (curr != null) {
          do {
              result += "|";
              result += curr.getData();
              result += "|-->";

              if (curr == top) {
                  result += " back to top (" + curr.getData()  + ")";
              }
          } while (curr != top);
      }


      return result;
    }
}
