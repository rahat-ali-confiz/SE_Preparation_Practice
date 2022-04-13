package Courses.DataStructure.Week2.QueuePRactice;

public class QueueUsingArray<T> {
    private T[] queue;
    private static int front;
    private static int rear;
    private static int size = 6;
    private static int  noOfElements;

    QueueUsingArray(){
        queue = (T[])new Object[size];
        front = 0;
        rear = 0;
        noOfElements = 0;
    }
    public void enQueue(T x){
        if(isEmpty()){
            queue[rear] = x;
            rear = (rear+1)%size;
            noOfElements++;
        }
        else if(isFull()){
            System.out.println("Queue is full");
        }
        else{
            queue[rear] = x;
            rear = (rear+1)%size;
            noOfElements++;
        }
    }

    public T deQueue(){
        if(!isEmpty()){
            T x = queue[front];
            front = (front+1)%size;
            noOfElements--;
            return x;
        }
        else
            return null;
    }
    public boolean isFull(){return front == size;}
    public static boolean isEmpty(){ return front == rear;}

    public void display(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
        }
        else{
            for (int i = front; i < rear;i++){
                System.out.print(queue[i]+" ");
            }
            System.out.println();
        }
    }
}
