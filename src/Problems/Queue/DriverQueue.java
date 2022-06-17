package Problems.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DriverQueue {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {

        Stack<Integer> stack = new Stack<>();
        Queue<Integer> stack1 = new LinkedList<>();

        for(int i=0;i<k;i++){
            stack.add(q.remove());
        }
        while (!q.isEmpty())
            stack1.add(q.remove());
        while(!stack.isEmpty()){
            q.add(stack.pop());
        }
        while(!stack1.isEmpty()){
            q.add(stack1.remove());
        }
        return q;
    }
}
