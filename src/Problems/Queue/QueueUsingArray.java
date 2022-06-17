package Problems.Queue;

public class QueueUsingArray {
    private final int[] queue;
    private static int front;
    private static int rear;
    private final int size = 6;

    QueueUsingArray(){
        queue = new int[size];
        front = 0;
        rear = 0;
    }
    public void enQueue(int x){

        if(isFull())
            System.out.println("Queue is full");

        queue[rear] = x;
        rear = (rear+1)%size;

    }

    public void deQueue(){
        if(!isEmpty()){
            front = (front+1)%size;
        }
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
