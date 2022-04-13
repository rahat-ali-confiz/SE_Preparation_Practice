package Courses.OOP.Collection.List;

import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args){
        LinkedList<Integer> ll = new LinkedList<>();

        for (int i = 1; i <= 5; i++)
            ll.add(i);
        System.out.println(ll);
        ll.remove(3);

        System.out.println(ll);

        for (int i = 0; i < ll.size(); i++)
            System.out.print(ll.get(i) + " ");
    }
}
