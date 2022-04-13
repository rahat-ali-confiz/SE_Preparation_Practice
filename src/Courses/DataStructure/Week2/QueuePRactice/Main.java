package Courses.DataStructure.Week2.QueuePRactice;

import static Courses.DataStructure.Week2.QueuePRactice.PriorityQueue.*;

public class Main {
    public static void main(String[] args){
//        QueueUsingArray<Integer> queue = new QueueUsingArray();
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


        QNode pq = newNode(4, 1);
        pq = enQueue(pq, 5, 2);
        pq = enQueue(pq, 6, 3);
        pq = enQueue(pq, 7, 0);
        pq = enQueue(pq, 8, 0);
        pq = enQueue(pq, 9, 2);
        while (isEmpty(pq)==0) {
            System.out.print(peek(pq)+" ");
            pq = pop(pq);
        }

    }
}
