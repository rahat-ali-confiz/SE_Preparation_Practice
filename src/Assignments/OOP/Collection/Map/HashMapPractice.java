package Assignments.OOP.Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapPractice {
    public static void main(String args[])
    {
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(1, "Rahat");
        hm.put(2, "Ali");
        hm.put(3, "Confiz");


        System.out.println("Value for 1 is " + hm.get(3));

        for (Map.Entry<Integer, String> e : hm.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }
}
