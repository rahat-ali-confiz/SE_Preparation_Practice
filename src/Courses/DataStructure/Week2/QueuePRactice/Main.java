package Courses.DataStructure.Week2.QueuePRactice;


import static Courses.DataStructure.Week2.QueuePRactice.PriorityQueue.*;

public class Main {
    public static void main(String[] args){

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
