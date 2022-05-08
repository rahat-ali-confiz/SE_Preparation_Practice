package Problems.Queue;

public class QMain {
    public static void main(String[] args){
        QueueUsingArray<Integer> queue = new QueueUsingArray<>();
        queue.display();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(4);
        queue.enQueue(20);
        queue.enQueue(3);
        queue.display();

        queue.deQueue();
        queue.display();

        QueueUsingLinkedList q = new QueueUsingLinkedList();
        q.enQueue(4);
        q.enQueue(2);
        q.enQueue(4);
        q.enQueue(24);
        q.enQueue(3);

        q.display();
        q.dequeue();
        q.display();
    }
}
