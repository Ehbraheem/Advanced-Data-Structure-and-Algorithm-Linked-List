package excercise;

/**
 * Created by Ehbraheem on 3/31/2017.
 */
public class Excercise2 {

    class Node
    {
        /**
         * INSERT CODE HERE
         */

        private char data;
        private Node next;
        private Node prev;

        public Node () {

        }

        public Node (char data) {
            this.data = data;
        }

        public char getData() {
            return this.data;
        }

        public Node getNext() {
            return this.next;
        }

        public Node getPrev() {
            return this.prev;
        }
    }
}

