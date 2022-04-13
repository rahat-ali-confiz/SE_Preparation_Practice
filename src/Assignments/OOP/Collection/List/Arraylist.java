package Assignments.OOP.Collection.List;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i =0;i<5;i++)
            list.add(i);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");

    }
}
