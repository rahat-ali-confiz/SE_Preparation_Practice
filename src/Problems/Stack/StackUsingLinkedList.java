package Problems.Stack;



public class StackUsingLinkedList {
    private StackNode head;
    private final int top;

    StackUsingLinkedList() {
        this.head = null;
        top = -1;
    }
    public int pop(){
        if (head == null) {
            System.out.println("Stack Underflow");
        }

        head = head.next;
        return head.element;
    }

    public void push(int x){
        StackNode newNode = new StackNode(x);

        newNode.next = head;
        head = newNode;
    }
    public int peek(){
        return head.element;
    }
    public int IsEmpty(){
        if (top<0)
            return 1;
        return 0;
    }

    public void display(){

        if (head == null) {
            System.out.println("Stack Underflow");
        }
        else {
            StackNode temp = head;
            while (temp != null) {
                System.out.println("Element :"+ temp.element);
                temp = temp.next;
            }
        }
    }

}
