package Courses.DataStructure.Week1.StackPractice;


public class StackMain {
    public static void main(String[] args){
        StackPractice<Integer> stack = new StackPractice<>();
        stack.push(2);
        stack.push(1);
        stack.push(3);
        stack.push(4);

        stack.display();
        System.out.println(stack.peek());
        stack.pop();
        stack.display();
        System.out.println();

        StackPractice<String> stack1 = new StackPractice<>();
        stack1.push("Rahat");
        stack1.push("Ali");
        stack1.push("Confiz");
        stack1.push("Lahore");

        stack1.display();
        System.out.println(stack1.peek());
        stack1.pop();
        stack1.display();
//            String exp = "a+b*(c^d-e)^(f+g*h)-i";
//            System.out.println(infixToPostFix(exp));

    }

}
