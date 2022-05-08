package Problems.Queue;

public class QueueUsingArray<T> {
    private int[] queue;
    private static int front;
    private static int rear;
    private static int size = 6;

    QueueUsingArray(){
        queue = new int[size];
        front = 0;
        rear = 0;
    }
    public void enQueue(int x){
        if(isEmpty()){
            queue[rear] = x;
            rear = (rear+1)%size;

        }
        else if(isFull()){
            System.out.println("Queue is full");
        }
        else{
            queue[rear] = x;
            rear = (rear+1)%size;

        }
    }

    public int deQueue(){
        if(!isEmpty()){
            int x = queue[front];
            front = (front+1)%size;
            return x;
        }
        else
            return -1;
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
