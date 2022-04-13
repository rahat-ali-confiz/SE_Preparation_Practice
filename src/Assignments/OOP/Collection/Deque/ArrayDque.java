package Assignments.OOP.Collection.Deque;

import java.util.ArrayDeque;

public class ArrayDque {
    public static void main(String args[]){
        ArrayDeque<Integer> de_que = new ArrayDeque<>();

        de_que.add(10);
        de_que.add(20);
        de_que.add(30);
        de_que.add(40);
        de_que.add(50);

        System.out.println(de_que);

        de_que.clear();

        // addFirst() method to insert the elements at the head
        de_que.addFirst(564);
        de_que.addFirst(291);

        // addLast() method to insert the elements at the tail
        de_que.addLast(24);
        de_que.addLast(14);
        System.out.println(de_que);
    }
}
