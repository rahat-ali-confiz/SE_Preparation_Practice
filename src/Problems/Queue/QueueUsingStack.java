package Problems.Queue;

import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void push(int x){

        s1.push(x);
//        while(!s1.isEmpty()){
//            s2.push(s1.pop());
//        }
//        s1.push(x);
//
//        while(!s2.isEmpty()){
//            s1.push(s2.pop());
//        }
    }

    public int pop(){

        int x = -1;
        while(!s1.isEmpty())
            s2.push(s1.pop());

        if(!s2.isEmpty()){
             x = s2.pop();

            while(!s2.isEmpty())
                s1.push(s2.pop());
        }
        return x;
    }
    public int peek(){
        int x = -1;
        while(!s1.isEmpty())
            s2.push(s1.pop());

        if(!s2.isEmpty()){
            x = s2.peek();

            while(!s2.isEmpty())
                s1.push(s2.pop());
        }
        return x;
    }
}
