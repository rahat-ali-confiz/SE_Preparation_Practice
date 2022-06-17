package Problems.Queue;


import java.util.LinkedList;
import java.util.Queue;

public class QMain {
    public static void main(String[] args){
//        QueueUsingArray queue = new QueueUsingArray();
//        queue.display();
//        queue.enQueue(1);
//        queue.enQueue(2);
//        queue.enQueue(4);
//        queue.enQueue(20);
//        queue.enQueue(3);
//        queue.display();
//
//        queue.deQueue();
//        queue.display();
//
//        QueueUsingLinkedList q = new QueueUsingLinkedList();
//        q.enQueue(4);
//        q.enQueue(2);
//        q.enQueue(4);
//        q.enQueue(24);
//        q.enQueue(3);
//
//        q.display();
//        q.dequeue();
//        q.display();
//
//
//        QueueUsingStack q1 = new QueueUsingStack();
//        q1.push(1);
//        q1.push(2);
//        q1.push(150);
//        q1.push(4);
//
//        System.out.println(q1.pop());
//        q1.push(9);
//        System.out.println(q1.peek());
//        System.out.println(q1.pop());

        DriverQueue que = new DriverQueue();

        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);

        System.out.println(que.modifyQueue(q1,3));

    }
}
