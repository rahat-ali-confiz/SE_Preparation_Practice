package Assignments.DataStructure.Week1.StackPractice;


import java.util.Stack;

public class InfixToPostfix {

    public static int operatorPrecedent(char ch){
        switch (ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static String infixToPostFix(String str){
        String  result = "";
        Stack<Character> stack = new Stack<>();

        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);

            if (Character.isLetterOrDigit(c))
                result += c;

            else if(c == '(')
                stack.push(c);

            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    result +=stack.pop();

                stack.pop();
            }
            else {
                while(!stack.isEmpty() && operatorPrecedent(c)<= operatorPrecedent(stack.peek())){
                    result +=stack.pop();
                }
                stack.push(c);
            }
        }
        while(!stack.isEmpty()){
            if(stack.peek() == '(')
                return "Invalid Expression";
            result += stack.pop();
        }
        return result;
    }
}
