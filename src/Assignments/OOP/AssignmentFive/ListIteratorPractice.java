package Assignments.OOP.AssignmentFive;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorPractice {
    public static void main(String[] args){
        ArrayList list = new ArrayList();

        for (int i=0;i<10;i++)
            list.add(i);
        System.out.println(list);

        ListIterator itr = list.listIterator();

        while(itr.hasNext()){
            int i =(Integer)itr.next();
            if (i % 2 == 0){
                i++;
                itr.set(i);
                itr.add(i);
            }
        }
        System.out.println(list);
    }
}
