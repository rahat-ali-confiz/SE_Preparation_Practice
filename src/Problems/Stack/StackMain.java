package Problems.Stack;


public class StackMain {
    public static void main (String[] args){
        StackUsingArray stack = new StackUsingArray(4);
        stack.push(2);
        stack.push(1);
        stack.push(3);
        stack.push(4);
        for (int i=0;i< 4;i++) {
            System.out.print(stack.pop()+" ");
        }

        StackUsingLinkedList stack1 = new StackUsingLinkedList();
        stack1.push(2);
        stack1.push(1);
        stack1.push(3);
        stack1.push(4);

        System.out.println();
        stack1.display();


        ReverseStringUsingStack stack2 = new ReverseStringUsingStack();

        String str = "PracticeProblems";
        String str1 = "[()]{}{[()()]()}";

        System.out.println(stack2.reverseStringUsingStack(str));

        System.out.println(stack2.isPair(str1));

        StackUsingQueue s1 = new StackUsingQueue();
        s1.push(1);
        s1.push(2);
        s1.push(150);
        s1.push(4);

        System.out.println(s1.pop());
        s1.push(12);
        System.out.println(s1.top());

        System.out.println(s1.pop());



    }

}
