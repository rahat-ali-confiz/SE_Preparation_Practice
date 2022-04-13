package Assignments.DataStructure.Week1.ListDataStructure;

import java.util.Iterator;
import java.util.ListIterator;

public class CircularLinkedList<E> {

    ListNode<E> head;
    ListNode<E> tail;
    int size;

    public CircularLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean add(E e) {
        add(size, e);
        return true;
    }

    public boolean add(int index, E e) {
        if (index < 0 || size > index) {
            throw new IndexOutOfBoundsException("out of bounds:" + index);
        }

        ListNode<E> temp = new ListNode<E>(e);
        if (size == 0) {

            head = temp;
            tail = temp;

        }
        //in front of head
        else if (index == 0) {
            temp.next = head;
            head = temp;
            tail.next = head;
        }
        //adding after tail
        else if (index == size) {
            tail.next = temp;
            tail = temp;
            //circular
            tail.next = head;
        }
        //adding in middle
        else {
            ListNode<E> after = getNode(index);
            ListNode<E> beforeafter = getNode(index - 1);
            temp.next = after;
            beforeafter.next = temp;

        }
        size++;
        return true;
    }
    public void start(){
        ListNode<E> current;
        tail = head;
        current = head;
    }

    public ListNode<E> getNode(int index) {

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("out of bounds: " + index);
        }
        ListNode<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
    public E getNode(){
        return tail.getElement();
    }
    public E remove(int index) {

        if (index < 0 || index > size) {
            System.out.println("index  < 0");
            throw new IndexOutOfBoundsException("out of bounds: " + index);
        }

        E item = null;

        //only 1 item in list
        if (size == 1) {

            item = head.getElement();
            head = null;
            tail = null;
            //removes head
        } else if (index == 0) {

            item = head.getElement();
            head = head.next;
            tail.next = head;

            //removing tail
        } else if (index == size) {

            ListNode<E> beforetail = getNode(size - 1);

            item = tail.getElement();
            tail = beforetail.next;
            tail.next = head;
        }
        //removing in the middle
        else {

            ListNode<E> node = getNode(index);
            ListNode<E> beforenode = getNode(index - 1);
            beforenode.next = node.next;
            item = node.getElement();
        }

        size--;
        return item;
    }

    public String toString() {
        ListNode<E> current = head;
        StringBuilder result = new StringBuilder();
        if (size == 0) {
            return "";
        }
        if (size == 1) {
            return head.getElement().toString();

        } else {
            do {
                result.append(current.getElement());
                result.append(" ==> ");
                current = current.next;
            } while (current != head);
        }
        return result.toString();
    }
    public Iterator<E> iterator() {
        return new ListIterator<E>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public E next() {
                return null;
            }

            @Override
            public boolean hasPrevious() {
                return false;
            }

            @Override
            public E previous() {
                return null;
            }

            @Override
            public int nextIndex() {
                return 0;
            }

            @Override
            public int previousIndex() {
                return 0;
            }

            @Override
            public void remove() {

            }

            @Override
            public void set(E e) {

            }

            @Override
            public void add(E e) {

            }
        };
    }
}

