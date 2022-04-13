package Courses.DataStructure.Week1.ListDataStructure;

public class ListNode<E> {

    private E element;
    ListNode<E> next;

    public ListNode() {
        this.element = null;
        this.next = null;
    }
    public ListNode(E e) {
        this.element = e;
        this.next = null;
    }
    public E getElement() {
        return this.element;
    }

    public void setElement(E element) {
        this.element= element;
    }
}
