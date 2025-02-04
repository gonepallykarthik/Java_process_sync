package Practice_Leetcode;
import java.util.Iterator;

public class Node implements Iterable<Node> {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public Iterator<Node> iterator() {
        return new NodeIterator(this);
    }

    private class NodeIterator implements Iterator<Node> {
        private Node current;

        public NodeIterator(Node n){
            this.current = n;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Node next() {
            Node temp = current;
            current = current.next;
            return temp;
        }
    }
}
