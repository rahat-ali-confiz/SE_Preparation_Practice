package Assignments.OOP.Collection.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetPractice{
    public static void main(String args[]) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();

        lhs.add("Rahat");
        lhs.add("Ali");
        lhs.add("Yasim");
        lhs.add("Rahat");
        lhs.add("Iqbal");

        Iterator<String> itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
    }
}
