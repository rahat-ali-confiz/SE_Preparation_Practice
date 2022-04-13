package Courses.OOP.Collection.Queue;

import java.util.PriorityQueue;

public class PriorityQuePractice {
    public static void main(String args[]){
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);

        // Printing the top element of PriorityQueue
        System.out.println(pQueue.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll());

        // Printing the top element again
        System.out.println(pQueue.peek());
    }
}
