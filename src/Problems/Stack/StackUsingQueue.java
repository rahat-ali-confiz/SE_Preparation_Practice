package Problems.Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x){
        q1.add(x);
    }
    public int pop(){
        if(q1.isEmpty())
            return -1;

        int count = 0;
        while(!q1.isEmpty()){
            q2.add(q1.remove());
            count++;
        }
        while (count != 1){
            q1.add(q2.remove());
            count--;
        }
        return q2.remove();
    }

    public int top() {
        if (q1.isEmpty())
            return -1;

        while (q1.size() != 1) {
            q2.add(q1.remove());
        }
        int temp = q1.remove();
        q2.add(temp);

        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
        return temp;
    }

    public boolean empty() {
        return q1.isEmpty();
    }

}
