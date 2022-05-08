package Problems.Stack;

public class StackUsingArray {
    private int[] arr;
    private int top;
    private int capacity;

    StackUsingArray(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    StackUsingArray() {
        top = -1;
    }
    public int pop() {
        IsEmpty();
        return arr[top--];
    }

    public void push(int x) {
        IsFull();
        arr[++top] = x;
    }

    public int top() {
        return arr[top];
    }

    public boolean IsEmpty() {
        return (top == -1);
    }

    public boolean IsFull() {
        return (top == capacity - 1);
    }

}
