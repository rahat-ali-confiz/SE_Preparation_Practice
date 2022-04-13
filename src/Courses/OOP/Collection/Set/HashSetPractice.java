package Courses.OOP.Collection.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {
    public static void main(String args[]){
        HashSet<String> hs = new HashSet<String>();

        hs.add("Rahat");
        hs.add("Ali");
        hs.add("Yasim");
        hs.add("Rahat");
        hs.add("Iqbal");

        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
    }
}
