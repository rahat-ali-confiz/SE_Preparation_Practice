package Assignments.OOP.AssignmentFive;

import Assignments.OOP.AssignmentFour.ListClassUsingArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {

    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();

        for (int i=0;i<10;i++)
            list.add(i);

        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            int i = iterator.next();
            System.out.print(i+ " ");
            if (i%2==0){
                iterator.remove();
            }
        }
        System.out.println();
        System.out.println(list);
    }
}
