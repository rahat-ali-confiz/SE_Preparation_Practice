package Courses.OOP.Collection.List;

import java.util.Iterator;
import java.util.Stack;

public class StackPractice {
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();
        stack.push("Rahat");
        stack.push("Hafeez");
        stack.push("Yasim");
        stack.push("Ali");

        Iterator<String> itr = stack.iterator();
        while(itr.hasNext())
            System.out.print(itr.next()+" ");
        System.out.println();

        stack.pop();
        itr = stack.iterator();
        while (itr.hasNext())
            System.out.print(itr.next()+" ");
    }
}
