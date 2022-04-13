package Assignments.OOP.Collection.List;

import java.util.Vector;

public class VectorPractice {
    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();

        for (int i = 1; i <= 5; i++)
            v.add(i);

        System.out.println(v);

        v.remove(2);
        System.out.println(v);

        for (int i = 0; i < v.size(); i++)
            System.out.print(v.get(i) + " ");
    }
}
