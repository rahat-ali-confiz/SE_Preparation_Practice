package Problems.Stack;


import java.util.Stack;

public class StackMain {
    public static void main (String[] args){
//        StackUsingArray stack = new StackUsingArray(4);
//        stack.push(2);
//        stack.push(1);
//        stack.push(3);
//        stack.push(4);
//        for (int i=0;i< 4;i++) {
//            System.out.print(stack.pop()+" ");
//        }
//
//        StackUsingLinkedList stack1 = new StackUsingLinkedList();
//        stack1.push(2);
//        stack1.push(1);
//        stack1.push(3);
//        stack1.push(4);
//
//        stack1.display();
//        System.out.println();



        ReverseStringUsingStack stack2 = new ReverseStringUsingStack();

        String str = "PracticeProblems";
        String str1 = "[()]{}{[()()]()}";

        System.out.println(stack2.reverseStringUsingStack(str));

        System.out.println(stack2.isPair(str1));



    }

}
