package Courses.DataStructure.Week1.ListDataStructure;


public class ListUsingLinkedList<E> {
    private Node<E> head;
    private Node<E> prev;
    private Node<E> current;
    private int size;

    public ListUsingLinkedList(){
        head = null;
        current = null;
        size =0;
    }
    public boolean add(E e) {
        add(size, e);

        return true;
    }
    public boolean add(int index, E data){
        if (index < 0 || size > index) {
            throw new IndexOutOfBoundsException("out of bounds:" + index);
        }
        Node<E> newNode = new Node<>();
        newNode.setData(data);
        if (size == 0){
            head = newNode;
            current = newNode;
        }
        else if (index==0){
            newNode.next = head;
            head = newNode;
            current = head;
        }
        else if (index == size) {
            current.next = newNode;
            current = newNode;
        }
        //adding in middle
        else {
            Node<E> after = get(index);
            Node<E> beforeafter = get(index - 1);
            newNode.next = after;
            beforeafter.next = newNode;

        }
        size++;
        return true;
    }
    public Node<E> get(int index) {

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("out of bounds: " + index);
        }
        current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
    public E get(){
        return current.getData();
    }
    public int length(){
        return size;
    }
    public boolean next(){
        if (current==null)
            return false;
        prev= current;
        current= current.next;
        return current != null && size != 0;
    }
    public void remove(){
        if (current!=null && current!=head){
            prev.next = current.next;
            current = prev.next;
            size--;
        }
    }
    public void start(){
        prev = head;
        current = head;
    }

    public Node<E> reverse() {
         prev = null;
         current = head;
         Node<E> next;
        while (current != null) {
            next = current.next;
            current.next= prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    public E middleElement(){
        current = head;
        prev = head;
        if (head!=null){
            while(current!=null && current.next!=null){
                current = current.next.next;
                prev = prev.next;
            }
        }
        return prev.getData();

    }

    public Node deleteMiddle(){
        current = head;
        prev = head;

        Node<E> mid = head;
        int counter =0;
        if (head!=null){
            while(current!=null && current.next!=null){
                current = current.next.next;
                mid = prev;
                prev = prev.next;
            }
            mid.next=prev.next;
        }
        else
            head = null;

        return head;
    }

    public void display() {
        current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            System.out.print(current.getData() + " ");
            current = current.next;
        }
        current = head;
        System.out.println();
    }

}
