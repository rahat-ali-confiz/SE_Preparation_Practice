package Courses.OOP.AssignmentFour;

import java.util.ArrayList;
import java.util.List;

public class GenericList {
    public static void main(String[] args ){
        List simpleList = new ArrayList();
        simpleList.add(10);
        simpleList.add(20);
        simpleList.add("Rahat");
        simpleList.add(40.0);

        for (Object o : simpleList) {
            System.out.println("Elements of Simple list: " + o);
        }
        System.out.println();

        List<String> genericList = new ArrayList<>();
        genericList.add("Rahat Ali");
        genericList.add("Confiz");
        genericList.add("Lahore");



        for (String s : genericList){
            System.out.println("Element of Generic list: "+s);
        }
    }
}
