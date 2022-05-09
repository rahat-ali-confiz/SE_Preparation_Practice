package Problems.LinkedList;




public class LinkedList<E> {
    public  Node<E> head;
    private Node<E> current;
    private int size;

    public LinkedList(){
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
        newNode.element= data;
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
    public void display() {
        current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            System.out.print(current.element + " ");
            current = current.next;
        }
        current = head;
        System.out.println();
    }


    public E middleElement(){
        Node<E> current = head;
        Node<E> mid = head;

        if (head!=null){
            while(current!=null && current.next!=null){
                current = current.next.next;
                mid = mid.next;
            }
        }

        return mid != null ? mid.element : null;
    }

    public void deleteNode(int x) {
        if(x==1)
            head = head.next;

        Node<E> current = head;
        Node<E> temp = null;

        for(int i=1;i<x;i++){
            temp = current;
            current = current.next;
        }

        if (temp != null) {
            temp.next = current.next;
        }
    }

    public void deleteMiddle() {
        Node<E> current = head;
        Node<E> prev = null;
        Node<E> mid = head;

        if (head!=null && head.next!=null){
            while(current!=null && current.next!=null){
                current = current.next.next;
                prev = mid;
                mid = mid.next;
            }
            prev.next=mid.next;
        }
        else
            head = null;
    }

    public void reverse() {
        current = head;
        Node<E> prev = null;
        Node<E> next;

        while (current != null) {
            next = current.next;
            current.next= prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void reverseBetween(int left, int right) {
        current = head;
        Node<E> prev = null;
        Node<E> next;
        if (head!=null && head.next!=null){
            for(int i=0;i<left;i++){
                prev = current;
                current = current.next;
            }
            Node<E> p1 = prev;
            Node<E> p2 = current;
            for (int i=left;i<=right;i++){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            p2.next = current;
            p1.next = prev;
        }
    }

    public Node<E> reverseByNthGroup(Node<E> head ,int k){
        current = head;
        Node<E> prev = null;
        Node<E> next = null;

        int count =0;
        if (head!=null){
            while (count < k && current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                count++;
            }
            if (next != null)
                head.next = reverseByNthGroup(next,k);

        }
        return prev;
    }


}
