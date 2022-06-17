package Problems.LinkedList;


public class Node<E> {
    public E element;
    Node<E> next;

    public Node() {
        this.element = null;
        this.next = null;
    }
    public Node(E e) {
        this.element = e;
        this.next = null;
    }
}
