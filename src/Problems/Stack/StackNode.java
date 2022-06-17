package Problems.Stack;


public class StackNode {
    public StackNode next;
    public int element;

    public StackNode() {
        this.element = 0;
        this.next = null;
    }
    public StackNode(int e) {
        this.element = e;
        this.next = null;
    }
}
