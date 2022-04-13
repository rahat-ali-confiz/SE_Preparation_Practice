package Assignments.DataStructure.Week1.StackPractice;

import Assignments.DataStructure.Week1.ListDataStructure.Node;

import static java.lang.System.exit;

public class StackPractice<E> {
     private Node<E> head;
     private int top;

    StackPractice() {
        this.head = null;
        top = -1;
    }
     public E pop(){
         if (head == null) {
             System.out.println("StackPractice Underflow");
         }

         head = head.next;
        return head.getData();
     }

     public void push(E x){
         Node<E> newNode = new Node<>();
         newNode.setData(x);
         newNode.next = head;
         head = newNode;
     }
     public E peek(){
             return head.getData();
     }
     public int IsEmpty(){
         if (top<0)
             return 1;
         return 0;
     }

    public void display(){

        if (head == null) {
            System.out.println("Stack Underflow");
            exit(1);
        }
        else {
            Node<E> temp = head;
            while (temp != null) {
                System.out.println("Element :"+ temp.getData());
                temp = temp.next;
            }
        }
    }


    // StackPractice Using Array
   /* private int[] arr;
    private int top;
    private int capacity;

    StackPractice(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    public int pop(){
        IsEmpty();
        return arr[top--];
    }
    public void push(int x){
        IsFull();
        arr[++top]=x;
    }
    public int top(){
        return arr[top];
    }
    public boolean IsEmpty(){
        return (top == -1);
    }
    public boolean IsFull(){
        return (top == capacity-1);
    }*/
}

