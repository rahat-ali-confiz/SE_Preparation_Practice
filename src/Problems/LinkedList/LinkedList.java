package Problems.LinkedList;


import java.util.HashSet;
import java.util.Set;
import java.util.Stack;


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
    public int size(){
        return size;
    }

    public E middleElement(){
        Node<E> end = head;
        Node<E> mid = head;

        if (head!=null){
            while(end!=null && end.next!=null){
                end = end.next.next;
                mid = mid.next;
            }
        }

        return mid != null ? mid.element : null;
    }

    public void deleteNode(int x){
        if(x==1)
            head = head.next;
        if(head == null)
            return;

        Node<E> current = head;
        Node<E> prev = null;

        for(int i=1;i<x;i++){
            prev = current;
            current = current.next;
        }

        if (prev != null) {
            prev.next = current.next;
        }
    }

    public void deleteMiddle() {
        Node<E> end = head;
        Node<E> prev = null;
        Node<E> mid = head;

        if (head!=null && head.next!=null){
            while(end!=null && end.next!=null){
                end = end.next.next;
                prev = mid;
                mid = mid.next;
            }
            prev.next = mid.next;
        }
        else
            head = null;
    }

    public Node delete(Node head, int k) {
        if (head == null)
            return null;

        if (k == 1){
            return null;
        }
        Node current = head;
        Node prev = null;

        int count =0;
        while (current != null){
            count++;
            if (k == count){
                prev.next = current.next;
                count = 0;
            }
            if (count != 0)
                prev = current;

            current = current.next;
        }

        return head;
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

    public Node reverseBetween(int left, int right) {
        current = head;
        Node<E> prev = null;
        Node<E> next;
        if (head!=null && head.next!=null){
            for(int i=0;i<left;i++){
                prev = current;
                current = current.next;
            }
            Node<E> prePrev = prev;
            Node<E> preCurrent = current;
            for (int i=left;i<=right;i++){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            preCurrent.next = current;
            prePrev.next = prev;
        }
        return head;
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

    public void rotate(int k) {
       if(k==0)
           return;
        current = head;
        int itr = 1;
        while(itr<k && current!=null ){
            current = current.next;
            itr++;
        }

        if(current.next==null)
            return;

        Node<E> kthNode = current;

        while(current.next!=null)
            current = current.next;

        current.next = head;
        head = kthNode.next;
        kthNode.next = null;


    }

    public Node rotateList( int k) {

        if(k==0)
            return head;

        current = head;
        while (current.next != null)
            current = current.next;

        current.next = head;
        current = head;

        for (int i = 0; i < k ; i++)
            current = current.next;


        head = current.next;
        current.next = null;

        return head;
    }

    public boolean detectLoop() {
        Node slow_p = head, fast_p = head;
        while (slow_p != null && fast_p != null
                && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                return true;
            }
        }
        return false;

//        Set<Node> hm = new HashSet<>();
//        while(head!=null){
//            if(hm.contains(head)){
//                return true;
//            }
//            else{
//                hm.add(head);
//                head = head.next;
//            }
//        }
//        return false;
    }

    public void removeLoop(){

        Set<Node> hm = new HashSet<>();
        Node curr = head;
        while(head!=null){
            if(hm.contains(head)){
                curr.next = null;
                return;
            }
            else{
                hm.add(head);
                curr = head;
                head = head.next;
            }
        }

    }

    int intersectPoint(Node head1, Node head2){

        Node prev = null;
        while(head1 != null){
            prev = head1;
            head1 = head1.next;
            prev.next = null;
        }
        while(head2.next != null)
        {
            head2 = head2.next;
        }
        return (int) head2.element;
    }
    public void blackWhiteChar(){
        current = head;

        LinkedList<Character> s = new LinkedList<>();
        LinkedList<Character> s1 = new LinkedList<>();

        if (head == null)
            System.out.println("Both colors are same");

        while (current!=null){
            if((char)current.element=='W')
               s.add((char)current.element);
            else
                s1.add((char)current.element);

            current = current.next;
        }
        if(s.size()>s1.size())
            System.out.println("White color is greater");
        else if(s.size() == s1.size())
            System.out.println("Both colors are same");
        else
            System.out.println("Black color is greater");
    }

    public Node removeNthFromEnd(Node head, int n) {

        if(head == null)
            return null;

        Node p = head;
        int len = 0;
        while(p != null){
            len++;
            p = p.next;
        }

        int fromStart = len-n+1;
        if(fromStart==1)
            return head.next;
        
        p = head;
        Node prev = null;
        int i=0;
        while(p!=null){
            i++;
            if(i==fromStart){
                prev.next = p.next;
            }
            prev = p;
            p=p.next;
        }
        return head;

    }

    public boolean isPalindrome(Node head) {

        Stack<Integer> s = new Stack<>();

        boolean isPalin = false;
        Node pointer = head ;
        while (pointer!=null){
            s.push((int)pointer.element);
            pointer = pointer.next;
        }

        while(head!=null){
            int e = s.pop();

            if(e==(int)head.element)
                isPalin = true;
            else{
                isPalin = false;
                break;
            }

            head = head.next;
        }
        return isPalin;
    }

    public Node mergeTwoLists(Node A, Node B) {

        if(A == null)
            return B;
        if(B == null)
            return A;
        Node output = null;
        if((int)A.element < (int)B.element)
        {
            output = A;
            A = A.next;
        }
        else
        {
            output = B;
            B = B.next;
        }
        Node curr = output;
        while(A != null && B!= null)
        {
            if((int)A.element > (int)B.element)
            {
                curr.next = B;
                B = B.next;
            }
            else
            {
                curr.next = A;
                A = A.next;
            }
            curr = curr.next;
        }
        if(A!= null)
            curr.next = A;
        if(B!= null)
            curr.next = B;
        return output;
    }


}

