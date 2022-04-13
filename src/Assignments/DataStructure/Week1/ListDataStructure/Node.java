package Assignments.DataStructure.Week1.ListDataStructure;

public class Node<E> {
    private E data;
    public Node<E> next;
    private Node<E> prev;


    public Node(){
        this.data = null;
        this.next = null;
    }
    Node(E d){
        data = d;
        next = null;
    }

    public E getData(){return data;}
    public void setData(E data){this.data=data;}
    public Node<E> getPrev() {
        return prev;
    }
    public void setPrev(Node prev) {
        this.prev = prev;
    }

}
